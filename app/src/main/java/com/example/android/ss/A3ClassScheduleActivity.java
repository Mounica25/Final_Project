package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class A3ClassScheduleActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3_class_schedule);

        spinner = findViewById(R.id.spinnerA3Schedule);

        List<String> categories = new ArrayList<>();
        categories.add(0,"Choose term");

        categories.add("Summer 2020 .....May 26,2020 - Aug 01,2020");
        categories.add("Spring 2020 .....Jan 13,2020 - May 15,2020");
        categories.add("Fall   2019 .....Aug 26,2019 - Dec 20,2019");

        //Style and populate the Spinner
        ArrayAdapter<String> dataAdapter;
        dataAdapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item, categories);

        //dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(parent.getItemAtPosition(position).equals("Choose term")){

                    //do nothing
                }else{

                    //on selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show selected spinner
                    Toast.makeText(parent.getContext(), "Selected: "+ item , Toast.LENGTH_SHORT).show();

                    //anything else you want to do on item selection do here
                    if(parent.getItemAtPosition(position).equals("Fall   2019 .....Aug 26,2019 - Dec 20,2019"))
                    {
                        Intent intent = new Intent(A3ClassScheduleActivity.this,A3Fall2k19ScheduleActivity.class);
                        startActivity(intent);
                    }else if(parent.getItemAtPosition(position).equals("Spring 2020 .....Jan 13,2020 - May 15,2020")){
                        Intent intent = new Intent(A3ClassScheduleActivity.this,A3Spring2k20ScheduleActivity.class);
                        startActivity(intent);
                    }else if(parent.getItemAtPosition(position).equals("Summer 2020 .....May 26,2020 - Aug 01,2020")){
                        Intent intent = new Intent(A3ClassScheduleActivity.this,A3Summer2k20ScheduleActivity.class);
                        startActivity(intent);
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                //TODO auto generated method stub
            }
        });


    }
}
