package com.example.android.ss;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Fall2k20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calendar);

        ArrayList<Event> events = new ArrayList<Event>();

        //Create a list of Fall 2k20
        events.add(new Event(" Fall Semester 2020 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_Fall2k20),getString(R.string.event1_Fall2k20)));
        events.add(new Event(getString(R.string.date2_Fall2k20),getString(R.string.event2_Fall2k20)));
        events.add(new Event(getString(R.string.date3_Fall2k20),getString(R.string.event3_Fall2k20)));
        events.add(new Event(getString(R.string.date4_Fall2k20),getString(R.string.event4_Fall2k20)));
        events.add(new Event(getString(R.string.date5_Fall2k20),getString(R.string.event5_Fall2k20)));
        events.add(new Event(getString(R.string.date6_Fall2k20),getString(R.string.event6_Fall2k20)));
        events.add(new Event(getString(R.string.date7_Fall2k20),getString(R.string.event7_Fall2k20)));
        events.add(new Event(getString(R.string.date8_Fall2k20),getString(R.string.event8_Fall2k20)));
        events.add(new Event(getString(R.string.date9_Fall2k20),getString(R.string.event9_Fall2k20)));
        events.add(new Event("",""));


        //Create a list of Spring 2k21
        events.add(new Event("Spring Semester 2021 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_Spring2k21),getString(R.string.event1_Spring2k21)));
        events.add(new Event(getString(R.string.date2_Spring2k21),getString(R.string.event2_Spring2k21)));
        events.add(new Event(getString(R.string.date3_Spring2k21),getString(R.string.event3_Spring2k21)));
        events.add(new Event(getString(R.string.date4_Spring2k21),getString(R.string.event4_Spring2k21)));
        events.add(new Event(getString(R.string.date5_Spring2k21),getString(R.string.event5_Spring2k21)));
        events.add(new Event(getString(R.string.date6_Spring2k21),getString(R.string.event6_Spring2k21)));
        events.add(new Event(getString(R.string.date7_Spring2k21),getString(R.string.event7_Spring2k21)));
        events.add(new Event(getString(R.string.date8_Spring2k21),getString(R.string.event8_Spring2k21)));
        events.add(new Event(getString(R.string.date9_Spring2k21),getString(R.string.event9_Spring2k21)));
        events.add(new Event(getString(R.string.date10_Spring2k21),getString(R.string.event10_Spring2k21)));
        events.add(new Event(getString(R.string.date11_Spring2k21),getString(R.string.event11_Spring2k21)));
        events.add(new Event(getString(R.string.date12_Spring2k21),getString(R.string.event12_Spring2k21)));
        events.add(new Event("",""));



        //Create a list of Summer 2k21
        events.add(new Event(" Summer Semester 2021 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_Sum2k21),getString(R.string.event1_Sum2k21)));
        events.add(new Event(getString(R.string.date1_Sum2k21),getString(R.string.event2_Sum2k21)));
        events.add(new Event(getString(R.string.date1_Sum2k21),getString(R.string.event3_Sum2k21)));
        events.add(new Event(getString(R.string.date4_Sum2k21),getString(R.string.event4_Sum2k21)));
        events.add(new Event(getString(R.string.date5_Sum2k21),getString(R.string.event5_Sum2k21)));
        events.add(new Event(getString(R.string.date6_Sum2k21),getString(R.string.event6_Sum2k21)));
        events.add(new Event(getString(R.string.date7_Sum2k21),getString(R.string.event7_Sum2k21)));
        events.add(new Event("",getString(R.string.cermony)));



        EventAdapter adapter = new EventAdapter(this, events);

        ListView listView = findViewById(R.id.eventList);
        listView.setAdapter(adapter);



    }
}
