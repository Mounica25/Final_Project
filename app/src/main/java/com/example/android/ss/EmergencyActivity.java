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

public class EmergencyActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private TextView Alerts,PoliceDepartment,CounsellingCenter,SexualAssault;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        firebaseAuth = FirebaseAuth.getInstance();

        // Weather Alerts
        Alerts = findViewById(R.id.tvAlerts);
        Alerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.weather.gov/alerts"));
                startActivity(intent);
            }
        });

        //Police Department
        PoliceDepartment = findViewById(R.id.tvPoliceDepartment);
        PoliceDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyActivity.this,PoliceDepartmentActivity.class);
                startActivity(intent);
            }
        });

        //Counselling Center
        CounsellingCenter = findViewById(R.id.tvCounselingCenter);
        CounsellingCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (EmergencyActivity.this,CounsellingCenterActivity.class);
                startActivity(intent);

            }
        });

        //Sexual Assault Policy
        SexualAssault = findViewById(R.id.tvSexualAssaultPolicy);
        SexualAssault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyActivity.this,SexualAssaultActivity.class);
                startActivity(intent);
            }
        });

    }

    // Logout by using menu

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        Intent intent = new Intent ( EmergencyActivity.this,MainActivity.class);
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
                Intent intent = new Intent(EmergencyActivity.this, ProfileActivity.class);
                startActivity(intent);
                Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
