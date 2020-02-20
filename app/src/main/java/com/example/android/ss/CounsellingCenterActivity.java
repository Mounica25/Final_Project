package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CounsellingCenterActivity extends AppCompatActivity {

    private TextView CounsellingCenterDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling_center);

        CounsellingCenterDesc = findViewById(R.id.tvCounsellingCenterDesc);
        CounsellingCenterDesc.setText("\n\n\n \t\t\t Welcome to the Counseling Center, Abilities Office and Women’s Resource Center at Chicago State University. " +
                "We are here to provide assistance, support and resources to students as well as consultation and referral services to faculty and staff. " +
                "As the Director, it is important to me that the services that we provide are of the utmost quality and that we engage with our students in ways that make them feel heard and accepted.\n\n" +
                "The staff members in each of our areas are knowledgeable and prepared to assist students and to work with faculty and staff to provide quality services and resources to the Chicago State University community.  " +
                "We work with students during some of their most vulnerable moments and we take this responsibility very seriously. " +
                "If you feel that you could benefit from any of our services, or if you have questions about how to access our resources for yourself or someone else, " +
                "please don’t hesitate to give us a call or pay us a visit in person at the Student Union Building. Thank you.");
    }
}
