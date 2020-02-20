package com.example.android.ss;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Fall2k17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        //Create a list of Fall 2k17
        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Fall Semester 2017 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_2k17),getString(R.string.event1_2k17)));
        events.add(new Event(getString(R.string.date2_2k17),getString(R.string.event2_2k17)));
        events.add(new Event(getString(R.string.date3_2k17),getString(R.string.event3_2k17)));
        events.add(new Event(getString(R.string.date4_2k17),getString(R.string.event4_2k17)));
        events.add(new Event(getString(R.string.date5_2k17),getString(R.string.event5_2k17)));
        events.add(new Event(getString(R.string.date6_2k17),getString(R.string.event6_2k17)));
        events.add(new Event(getString(R.string.date7_2k17),getString(R.string.event7_2k17)));
        events.add(new Event(getString(R.string.date8_2k17),getString(R.string.event8_2k17)));
        events.add(new Event(getString(R.string.date9_2k17),getString(R.string.event9_2k17)));
        events.add(new Event("",""));

        //Create a list of Spring 2k18
        events.add(new Event(" Spring Semester 2018 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_2k18),getString(R.string.event1_2k18)));
        events.add(new Event(getString(R.string.date2_2k18),getString(R.string.event2_2k18)));
        events.add(new Event(getString(R.string.date3_2k18),getString(R.string.event3_2k18)));
        events.add(new Event(getString(R.string.date4_2k18),getString(R.string.event4_2k18)));
        events.add(new Event(getString(R.string.date5_2k18),getString(R.string.event5_2k18)));
        events.add(new Event(getString(R.string.date6_2k18),getString(R.string.event6_2k18)));
        events.add(new Event(getString(R.string.date7_2k18),getString(R.string.event7_2k18)));
        events.add(new Event(getString(R.string.date8_2k18),getString(R.string.event8_2k18)));
        events.add(new Event(getString(R.string.date9_2k18),getString(R.string.event9_2k18)));
        events.add(new Event(getString(R.string.date10_2k18),getString(R.string.event10_2k18)));
        events.add(new Event(getString(R.string.date11_2k18),getString(R.string.event11_2k18)));
        events.add(new Event(getString(R.string.date12_2k18),getString(R.string.event12_2k18)));
        events.add(new Event("",""));

        //Create a list of Summer 2k18
        events.add(new Event(" Summer Semester 2018 ",""));
        events.add(new Event("",""));
        events.add(new Event(getString(R.string.date),getString(R.string.event)));
        events.add(new Event(getString(R.string.date1_Sum2k18),getString(R.string.event1_Sum2k18)));
        events.add(new Event(getString(R.string.date2_Sum2k18),getString(R.string.event2_Sum2k18)));
        events.add(new Event(getString(R.string.date3_Sum2k18),getString(R.string.event3_Sum2k18)));
        events.add(new Event(getString(R.string.date4_Sum2k18),getString(R.string.event4_Sum2k18)));
        events.add(new Event(getString(R.string.date5_Sum2k18),getString(R.string.event5_Sum2k18)));
        events.add(new Event(getString(R.string.date6_Sum2k18),getString(R.string.event6_Sum2k18)));
        events.add(new Event(getString(R.string.date7_Sum2k18),getString(R.string.event7_Sum2k18)));
        events.add(new Event("",getString(R.string.cermony)));



        EventAdapter adapter = new EventAdapter(this, events);

        ListView listView = findViewById(R.id.eventList);
        listView.setAdapter(adapter);
    }
}
