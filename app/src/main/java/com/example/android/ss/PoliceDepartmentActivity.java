package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PoliceDepartmentActivity extends AppCompatActivity {

    private TextView tvPoliceDeptDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_department);


        tvPoliceDeptDescription = findViewById(R.id.tvPoliceDeptDescription);
        tvPoliceDeptDescription.setText("The goal of the Chicago State University Police Department is to maintain a safe and secure campus environment.  Members of the Department are trained professionals who present a uniformed presence while serving the University Community.  In the course of their duties they employ proactive measures to identify potential problems before they occur, thereby increasing the ability to prevent the occurrence of more serious incidents.\n " +
                "The CSU Police Department fosters solid relationships with students, faculty, staff and administrators in several ways:\n" +
                "\t\t by being visible and approachable,\n" +
                "\t\t by providing safety awareness programs on campus,\n" +
                "\t\t by communicating with the surrounding communities about their safety issues,\n" +
                "\t\t by exercising a high level of customer service, and\n" +
                "\t\t by employing other outreach efforts designed to enrich the CSU experience. \n " +
                "The Chicago State University Police Department will work diligently, effectively and cooperatively with other federal, state and local law enforcement agencies, keeping the safety of the campus community our highest priority. We will continue to serve in a manner that is respectful to all and that reflects positively upon the University.");


    }
}
