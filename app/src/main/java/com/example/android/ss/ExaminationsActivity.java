package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExaminationsActivity extends AppCompatActivity {

    private TextView exDescription;
    private TextView exContactInformation;
    private TextView exContactInfoDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examinations);

        exDescription = findViewById(R.id.tvExDescription);
        exDescription.setText(" \t\t The Office of Examinations serves as the central location on campus for the administration of placement and testing services. The Office of Examinations runs the Examinations Testing Lab which is located at Douglas Hall, Room 119. At the Examinations Testing Lab, new and current students can take placement exams as part of getting started with registration for required English composition and Math courses. \n" + "Please review the information on our webpages to become familiar with the placement exam process, tap into reference tools, and view our hours of operation released on a monthly basis.");

        exContactInfoDescription = findViewById(R.id.tvExContInfoDescription);
        exContactInfoDescription.setText("Office: ADM 129G\n\n" +
                "Examinations Testing Lab:  DH 119\n\n" +
                "Phone: 773-995-5420");
    }
}
