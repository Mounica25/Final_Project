package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

public class A3Summer2k20ScheduleActivity extends AppCompatActivity {

    private TextView SummerSub1Title, SummerSub1Desc1, SummerSub1Desc2,
            SummerSub2Title, SummerSub2Desc1, SummerSub2Desc2,
            SummerSub3Title, SummerSub3Desc1, SummerSub3Desc2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3_summer2k20_schedule);

        /*radioGroup = findViewById(R.id.radioGrp);
        A3Register = findViewById(R.id.btnA3Register);

        A3Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                Toast.makeText(A3Summer2k20ScheduleActivity.this, "Selected radio Button is :" + radioButton.getText(), Toast.LENGTH_SHORT).show();

                //String SummerSubject =  radioButton.getText().toString();

               *//* Intent intent = new Intent(A3Summer2k20ScheduleActivity.this, A3MyClassScheduleActivity.class);
                intent.putExtra("Name",SummerSubject);
                startActivity(intent);*//*


            }
        });*/

        /* Getting an instance of the Firebase *//*
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();

        *//* Referencing Database *//*
        final DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());
        String SummerSubject =  SummerSub1Title.getText().toString();
        SubjectsData subjectsData = new SubjectsData(SummerSubject);

        databaseReference.setValue(subjectsData);
*/

       /* *//* Accessing the database to retrieve data  *//*
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                SubjectsData subjectsData = dataSnapshot.getValue(SubjectsData.class);
                String subject1 = dataSnapshot.child("subject1").getValue().toString();
                radioButton1.setText(subject1);



                //SummerSub1Title.setText(subjectsData.getUserSubjects());


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(A3Summer2k20ScheduleActivity.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();

            }
        });
*/
        /*A3Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String SummerSubject =  SummerSub1Title.getText().toString();

                SubjectsData subjectsData = new SubjectsData(SummerSubject);

                databaseReference.setValue(subjectsData);

                finish();

            }
        });*/


       SummerSub1Title = findViewById(R.id.tvA3SummerSub1Title);
        SummerSub1Title.setText("\nPrivate Pilot Flight Lab II - AVIA 153\n");

        SummerSub1Desc1 = findViewById(R.id.tvA3SummerSub1Desc1);
        SummerSub1Desc1.setText("Associated Term - Summer 2020\n" +
                "Registration Dates: \n" +
                "Levels: Undergraduate , Graduate\n" +
                "Campus: Distance Learning\n" +
                "Schedule Type: Distance Learning(Web)\n" +
                "Credits:3.000");

        SummerSub1Desc2 = findViewById(R.id.tvA3SummerSub1Desc2);
        SummerSub1Desc2.setText("\nScheduled Meeting Times\n" +
                "Time: 9.00 am - 1.15pm\n" +
                "Days:W\n" +
                "Where: LI849\n" +
                "Instructor:Smith, Terry\n");


       SummerSub2Title = findViewById(R.id.tvA3SummerSub2Title);
        SummerSub2Title.setText("\nMulti- Engine Flight Lab - AVIA 171\n");

        SummerSub2Desc1 = findViewById(R.id.tvA3SummerSub2Desc1);
        SummerSub2Desc1.setText("Associated Term - Summer 2020\n" +
                "Registration Dates: \n" +
                "Levels: Undergraduate, Graduate\n" +
                "Campus: Wheeling\n" +
                "Schedule Type: Lecture\n" +
                "Credits:3.000");

        SummerSub2Desc2 = findViewById(R.id.tvA3SummerSub2Desc2);
        SummerSub2Desc2.setText("\nScheduled Meeting Times\n" +
                "Time: 10.00 am - 2.00pm\n" +
                "Days: F\n" +
                "Where: LI852\n" +
                "Instructor: Gibson, Harrington\n\n");

       SummerSub3Title = findViewById(R.id.tvA3SummerSub3Title);
        SummerSub3Title.setText("\nInstrument Pilot Flight Lab - AVIA 241\n");

        SummerSub3Desc1 = findViewById(R.id.tvA3SummerSub3Desc1);
        SummerSub3Desc1.setText("Associated Term - Summer 2020\n" +
                "Registration Dates: \n" +
                "Levels: Undergraduate\n" +
                "Campus: Distance Learning\n" +
                "Schedule Type: Distance Learning(Web)\n" +
                "Credits:2.000");

        SummerSub3Desc2 = findViewById(R.id.tvA3SummerSub3Desc2);
        SummerSub3Desc2.setText("\nScheduled Meeting Times\n" +
                "Time:7.00 pm - 9.00PM\n" +
                "Days:W,F\n" +
                "Where: Online\n" +
                "Instructor: Gamba, Jessica\n");

    }

    /*public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        //Toast.makeText(this, "Selected radio Button is :" + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }*/
}
