package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class StudentResourcesActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private TextView Moodle , AuxillaryServices , TransferInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_resources);

        firebaseAuth = FirebaseAuth.getInstance();

        // Moodle functionality

        Moodle = findViewById(R.id.tvMoodle);
        Moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://moodle.org/login/index.php"));
                startActivity(intent);
            }
        });

        // Auxillary Services

        AuxillaryServices = findViewById(R.id.tvAuxiliaryServices);
        AuxillaryServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentResourcesActivity.this,AuxillaryServicesActivity.class);
                startActivity(intent);
            }
        });

        //Transfer Information

        TransferInfo = findViewById(R.id.tvTransferInfo);
        TransferInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Intent.ACTION_VIEW,Uri.parse("http://itransfer.org"));
                startActivity(intent);
            }
        });
    }

    // Logout by using menu

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        Intent intent = new Intent ( StudentResourcesActivity.this,MainActivity.class);
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
                Intent intent = new Intent(StudentResourcesActivity.this, ProfileActivity.class);
                startActivity(intent);
                Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
