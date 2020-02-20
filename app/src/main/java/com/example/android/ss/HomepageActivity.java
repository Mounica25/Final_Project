package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.rpc.Help;

import org.w3c.dom.Text;

public class HomepageActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;
    private Button logout;
    private CardView cvQuickLinks;
    private CardView cvStudentResources;
    private CardView cvMyInfo;
    private CardView cvEmergency;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        //Tab sections

        /*SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);*/


        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();


        /* //Logout by using button
        logout = (Button) findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logout();
            }
        });*/

        /* Intent for the Quick Links Activity Category */

        cvQuickLinks = (CardView) findViewById(R.id.cv_QuickLinks);
        cvQuickLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this,QuickLinksActivity.class);
                startActivity(intent);
            }
        });

        /* Intent for the Student Resources Activity Category */

        cvStudentResources = (CardView) findViewById(R.id.cv_StudentResources);
        cvStudentResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this,StudentResourcesActivity.class);
                startActivity(intent);
            }
        });

        /* Intent for the My Info Activity Category */

        cvMyInfo = (CardView) findViewById(R.id.cv_MyInfo);
        cvMyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this,MyInfoActivity.class);
                startActivity(intent);
            }
        });

        /* Intent for the Emergency Activity Category */

        cvEmergency = (CardView) findViewById(R.id.cv_Emergency);
        cvEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this,EmergencyActivity.class);
                startActivity(intent);
            }
        });



    }

    // Logout by using menu

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        Intent intent = new Intent ( HomepageActivity.this,MainActivity.class);
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

            case R.id.logoutMenu:{
                Logout();
                break;
            }


            case R.id.helpMenu:

            case R.id.myProfileMenu: {
                Intent intent = new Intent(HomepageActivity.this, ProfileActivity.class);
                startActivity(intent);
                Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }





}
