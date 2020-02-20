package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class AcademicCalendarActivity extends AppCompatActivity {

    private TextView fall2k17, fall2k18, fall2k19, fall2k20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_calendar);

        fall2k17 = findViewById(R.id.fall2k17);
        fall2k17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( AcademicCalendarActivity.this, Fall2k17Activity.class);
                startActivity(intent);
            }
        });

        fall2k18 = findViewById(R.id.fall2k18);
        fall2k18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( AcademicCalendarActivity.this, Fall2k18Activity.class);
                startActivity(intent);
            }
        });

        fall2k19 = findViewById(R.id.fall2k19);
        fall2k19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( AcademicCalendarActivity.this, Fall2k19Activity.class);
                startActivity(intent);
            }
        });

        fall2k20 = findViewById(R.id.fall2k20);
        fall2k20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( AcademicCalendarActivity.this, Fall2k20Activity.class);
                startActivity(intent);
            }
        });
    }
}
