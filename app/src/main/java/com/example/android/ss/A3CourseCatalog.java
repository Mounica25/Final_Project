package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class A3CourseCatalog extends AppCompatActivity {

    private TextView CourseTitle1,CourseDesc1,CourseTitle2,CourseDesc2,
            CourseTitle3,CourseDesc3,CourseTitle4,CourseDesc4,
            CourseTitle5,CourseDesc5, CourseTitle6,CourseDesc6, CourseTitle7,CourseDesc7, CourseTitle8,CourseDesc8, CourseTitle9,CourseDesc9, CourseTitle10,CourseDesc10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3_course_catalog);

        CourseTitle1 = findViewById(R.id.tvCourseTitle1);
        CourseTitle1.setText("\nAVIA 101 (3) World of Aviation");

        CourseDesc1 = findViewById(R.id.tvCourseDesc1);
        CourseDesc1.setText("Provides an expanded study of the changing and shrinking world brought on by the introduction of technology using the medium of aviation, especially the fixed-wing airplane, throughout the course of history. Students will analyze the significant impact and rapid changes aviation has had on cultures, commerce, wars, economics, and transportation. The effect the introduction and expansion aviation technology has had throughout the world created many of the same effects the expansion of the internet has had over the last 20 years.\n" +
                "Fall, Spring\n");

        CourseTitle2 = findViewById(R.id.tvCourseTitle2);
        CourseTitle2.setText("\nAVIA 102 (3) Aviation Terminology");

        CourseDesc2 = findViewById(R.id.tvCourseDesc2);
        CourseDesc2.setText("Aviation Terminology teaches international students the terms and meanings of airports, aircraft, and aviation in general. The course will also include instruction in proper pilot and air traffic control radio procedures and methods when in flight and on the ground. The course should reduce future difficulties in follow-on aviation management or professional flight courses.\n" +
                "Fall\n");

        CourseTitle3 = findViewById(R.id.tvCourseTitle3);
        CourseTitle3.setText("\nAVIA 150 (3) Private Pilot");

        CourseDesc3 = findViewById(R.id.tvCourseDesc3);
        CourseDesc3.setText("A study of basic aeronautical knowledge including principals of flight, aerody- namics, aviation regulations, weather, visual and instrument navigation, and emergencies. The course meets, but is not limited to, FAR part 61.105 (a, 1-6). Satisfactory completion of this course may result in an endorsement for the FAA Private Pilot written exam.\n" +
                "Fall, Spring\n");

        CourseTitle4 = findViewById(R.id.tvCourseTitle4);
        CourseTitle4.setText("\nAVIA 151 (2) Private Pilot Flight Lab");

        CourseDesc4 = findViewById(R.id.tvCourseDesc4);
        CourseDesc4.setText("Provides beginning flight student with the in-flight requirements needed to obtain the FAA Private Pilot’s Certificate.\n" +
                "Fall, Spring\n");



        CourseTitle5 = findViewById(R.id.tvCourseTitle5);
        CourseTitle5.setText("\nAVIA 153 (1) Private Pilot Flight Lab II");

        CourseDesc5 = findViewById(R.id.tvCourseDesc5);
        CourseDesc5.setText("Continues the flight lab progression in the Minnesota State Mankato aviation program to the second stage of the Private Pilot flight lab. The course reviews and expands the classroom knowledge received in the Private Pilot Ground Course as well as the skills developed in AVIA 151. The training flights continue the building block approach to training with student pilots gradually obtaining the skills to safely fly an aircraft and pass an FAA administered practical examination.\n" +
                "Fall, Spring, Summer");

        CourseTitle6 = findViewById(R.id.tvCourseTitle6);
        CourseTitle6.setText("\nAVIA 171 (1) Multi-Engine Flight Lab");

        CourseDesc6 = findViewById(R.id.tvCourseDesc6);
        CourseDesc6.setText("Prepares advanced flight student with the in-flight requirements needed to obtain the FAA Multi-Engine Pilot rating.\n" +
                "Prerequisite: AVIA 151, or equivalent\n" +
                "Fall, Spring, Summer");

        CourseTitle7 = findViewById(R.id.tvCourseTitle7);
        CourseTitle7.setText("\nAVIA 201 (3) Theory of Flight");

        CourseDesc7 = findViewById(R.id.tvCourseDesc7);
        CourseDesc7.setText("A study of physics and aerodynamic principals of flight and propulsion systems. The nature of aerodynamic forces are explained. Flight principals of lighter-than-air, airplane, glider, rotocraft and powered lift are covered in detail.\n" +
                "Prerequisite: PHYS 101, MATH 112\n" +
                "Fall, Spring");

        CourseTitle8 = findViewById(R.id.tvCourseTitle8);
        CourseTitle8.setText("\nAVIA 202 (3) Principles of Air Navigation");

        CourseDesc8= findViewById(R.id.tvCourseDesc8);
        CourseDesc8.setText("A study of fundamental air navigation principles and how it is applied to flight, pilotage and dead reckoning, great circle navigation, charts and conformal projects, and celestial navigation systems and their operations and use.\n" +
                "Prerequisite: AVIA 150\n" +
                "Spring");

        CourseTitle9 = findViewById(R.id.tvCourseTitle9);
        CourseTitle9.setText("\nAVIA 240 (3) Instrument Pilot");

        CourseDesc9 = findViewById(R.id.tvCourseDesc9);
        CourseDesc9.setText("A study of the aeronautical knowledge including aviation regulations, weather, instrument navigation, and instrument emergencies. The course meets, but is not limited to, FAR part 61.65 (b, 1-4). Satisfactory completion of this course may result in an endorsement for the FAA Instrument Pilot written exam.\n" +
                "Prerequisite: AVIA 150, or equivalent" +
                "\nFall, Spring");


        CourseTitle10 = findViewById(R.id.tvCourseTitle10);
        CourseTitle10.setText("\nAVIA 241 (2) Instrument Pilot Flight Lab");

        CourseDesc10 = findViewById(R.id.tvCourseDesc10);
        CourseDesc10.setText("Prepares advanced flight students with the in-flight requirements needed to obtain the FAA Instrument Pilot rating.\n" +
                "Fall, Spring, Summer");

    }
}
