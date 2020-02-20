package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int Counter=5;
    private TextView userRegistration ;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog processDialog;
    private TextView forgotPassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText) findViewById(R.id.etEmail);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Info = (TextView) findViewById(R.id.tvInfo);
        userRegistration = (TextView) findViewById(R.id.tvRegister);
        forgotPassword = (TextView) findViewById(R.id.tvForgotPwd);


        //Info.setText("No of attempts remaining : 5 ");

        //Instance of Firebase Auth
        firebaseAuth = FirebaseAuth.getInstance();

        //Instance of Progress Dialog
        processDialog = new ProgressDialog(this);

        //Checking with database whether user has been logged in the application
        FirebaseUser user = firebaseAuth.getCurrentUser();

        //Condition if the user logged in or not ,if so direct him to the home page
        if(user != null){
            finish();
            Intent intent = new Intent(MainActivity.this,HomepageActivity.class);
            startActivity(intent);
        }

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Email.getText().toString(), Password.getText().toString());
            }
        });

        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this , RegistrationActivity.class);
                startActivity(intent);
            }
        });


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this,ForgotPasswordActivity.class);
                startActivity(intent);

            }
        });

    }

    private void validate ( String userEmail, String userPassword){

        processDialog.setMessage("Login verification");
        processDialog.show();

        firebaseAuth.signInWithEmailAndPassword(userEmail,userPassword).addOnCompleteListener((new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                   processDialog.dismiss();
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();;
                    Intent intent = new Intent(MainActivity.this,HomepageActivity.class);
                    startActivity(intent);

                }else{

                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    //finish();
                    //startActivity(new Intent(MainActivity.this,MainActivity.class));
                    //decrement the counter and the login button disables when the counter meets zero
                    Counter--;
                    Info.setText("No of attempts remaining : " + Counter);
                    processDialog.dismiss();
                    if(Counter==0){
                        Login.setEnabled(false);
                    }
                }
            }
        }));

    }

    /*private void validate ( String userEmail, String userPassword){
        if((userEmail.equals("Admin")) && (userPassword.equals("1234"))){

            Intent intent = new Intent(MainActivity.this, HomepageActivity.class);
            startActivity(intent);
        }else{
            Counter--;
            Info.setText("No.of attempts remaining: " + Counter );

            if(Counter==0){
                Login.setEnabled(false);
            }
        }
    }*/
}
