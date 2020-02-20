package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class QuickLinksActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private TextView Examinations , AcademicCalendar , Library, A3CourseCatalog , A3ClassSchedule , A3MyClassSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_links);

        firebaseAuth = FirebaseAuth.getInstance();

        Examinations = findViewById(R.id.tvExaminations);
        Examinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuickLinksActivity.this,ExaminationsActivity.class);
                startActivity(intent);
            }
        });

        AcademicCalendar = findViewById(R.id.tvAcademicCalendar);
        AcademicCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuickLinksActivity.this,AcademicCalendarActivity.class);
                startActivity(intent);
            }
        });

        Library = findViewById(R.id.tvLibrary);
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chipublib.org"));
                startActivity(intent);

            }
        });

        A3CourseCatalog = findViewById(R.id.tvA3CourseCatalog);
        A3CourseCatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuickLinksActivity.this,A3CourseCatalog.class);
                startActivity(intent);

            }
        });

        A3ClassSchedule = findViewById(R.id.tvA3ClassSchedule);
        A3ClassSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (QuickLinksActivity.this,A3ClassScheduleActivity.class);
                startActivity(intent);
            }
        });

        A3MyClassSchedule = findViewById(R.id.tvMyClassSchedule);
        A3MyClassSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (QuickLinksActivity.this,A3MyClassScheduleActivity.class);
                startActivity(intent);
            }
        });



    }

    // Logout by using menu

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        Intent intent = new Intent ( QuickLinksActivity.this,MainActivity.class);
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
                break;
            }
            case R.id.helpMenu: {
            }

            case R.id.myProfileMenu: {
                Intent intent = new Intent(QuickLinksActivity.this, ProfileActivity.class);
                startActivity(intent);
                Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
