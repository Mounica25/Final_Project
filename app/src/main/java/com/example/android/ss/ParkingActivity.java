package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    private TextView ParkingDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        ParkingDesc = findViewById(R.id.tvParkingDesc);


        ParkingDesc.setText("\n\n\t\t Mission\n\n" +
                "The Parking Department at Chicago State University is committed to effectively maximizing campus access, which will enhance the quality of educational experiences. We are a customer-oriented team of professionals dedicated to providing innovative services. We are committed to providing a safe and secure environment by productively maintaining Chicago State University Fleet Vehicles and parking lots. Our success depends upon supporting and planning for a sustainable future." +
                "\n\n\t\t Are you parking on the Chicago State University's campus soon?\n\n" +
                "Read through the following pages to learn essential information for visitors and parking decal holders!\n" +
                "\n" +
                "\t.Purchase your decal in the Cashiers Office - Cook Administration Building Room 212\n\n" +
                "\t.Pick up your decal(s) in the Parking Department - O & M Building 107-G\n" +
                "\n\t\t Introduction:\n\n" +
                "Any person operating a motor vehicle on campus is subject to and must comply with all traffic regulations of the State of Illinois, the City of Chicago, and Chicago State University. The regulations and general information are printed for the benefit and compliance of everyone, and will aid all members of the University community. Nothing herein is intended to change or replace existing State statutes. The authority to proscribe and enforce motor vehicle registrations is based upon Illinois statutes and subsequent actions taken by the Chicago State University Board of Trustees. The statute with reference to powers of the Board of Trustees appears in Chapter 110, Illinois Compiled Statutes 610/1." +
                "\n\n\t\t University Liability:" +
                "\n\nNo liability is created either by granting parking or by granting operating privileges on property owned, leased or otherwise controlled by Chicago State University. The university assumes no responsibility for the care and/or protection of vehicles or their contents while operated or parked on university property. The University Police, however, do make regular tours of the parking lots." +
                "\n\n\t\t Driver Responsibility:" +
                "\n\n Individuals who use the parking facilities must have a valid parking decal or pay the daily $5.00 parking fee at either the 95th Street (95th St. & St. Lawrence) or 99th Street Parking Booth (99th St. and King Drive). " +
                "\n\n\t.Rules and regulations are enforced around the clock.\n\n" +
                "\t.Vehicles must be operated and parked in a manner that assures the safety of other vehicles and pedestrians.\n\n" +
                "\t.Parking is permitted in marked stalls only. The entire vehicle must be within the boundary lines of the parking space.\n\n" +
                "\t.Responsibility for finding a legal parking space rests with the vehicle operator.\n\n" +
                "\t.Snow or other severe weather conditions are not valid reasons to disobey the regulations.\n\n" +
                "\t.Parking privileges may be revoked for failure to comply.  \n" +
                "\t.If a vehicle is disabled, the owner / driver is responsible for its removal as soon as available services permit.\n\n" +
                "\t.Parking spaces may not be used to store a vehicle.\n\n" +
                "\t.If a vehicle is left unattended for more than 24 hours, the owner / driver should contact the Police Department at 773-995-2111.\n\n");




    }
}
