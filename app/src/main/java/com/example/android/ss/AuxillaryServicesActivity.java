package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AuxillaryServicesActivity extends AppCompatActivity {

    private TextView Bookstore,ConvocationCenter,Parking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxillary_services);

        Bookstore = findViewById(R.id.tvBookstore);
        Bookstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.bkstr.com/efollettstore/home"));
                startActivity(intent);

            }
        });


        ConvocationCenter = findViewById(R.id.tvConvocationCenter);
        ConvocationCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AuxillaryServicesActivity.this,ConvocationCenterActivity.class);
                startActivity(intent);
            }
        });


        Parking = findViewById(R.id.tvParking);
        Parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuxillaryServicesActivity.this,ParkingActivity.class);
                startActivity(intent);
            }
        });



    }
}
