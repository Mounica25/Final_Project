package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.common.collect.Sets;
import com.google.firebase.auth.FirebaseAuth;
import com.google.rpc.Help;

public class MyInfoActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private TextView passwordChange;
    private TextView personalInformation;
    private TextView gmailLink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);

        passwordChange = findViewById(R.id.tvPasswordChange);
        personalInformation = findViewById(R.id.tvPersonalInformation);

        gmailLink = findViewById(R.id.tvGmail);

        firebaseAuth = FirebaseAuth.getInstance();

        //Linking password change to the Update Password

        passwordChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this,UpdatePassword.class);
                startActivity(intent);
            }
        });

        //Linking personal information to the Profile Activity

        personalInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfoActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    // Logout by using menu

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        Intent intent = new Intent ( MyInfoActivity.this,MainActivity.class);
        startActivity(intent);
    }

    //Referencing the Menu by the Implementation methods and creating the Menu in the tool bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflate the Menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Handling Click events on the Menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.logoutMenu: {
                Logout();
            }
            case R.id.helpMenu: {
            }

            case R.id.myProfileMenu: {
                Intent intent = new Intent(MyInfoActivity.this, ProfileActivity.class);
                startActivity(intent);
                Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
