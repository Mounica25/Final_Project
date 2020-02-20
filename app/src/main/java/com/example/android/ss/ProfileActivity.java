package com.example.android.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

public class ProfileActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView profileName, profileAge, profileEmail;
    private Button profileUpdate , profileChangePassword;
    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private FirebaseStorage firebaseStorage;

    String currenntUserID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        /* Defining the ID for the respective elements created in the layout */
        profileImage = findViewById(R.id.ivProfileImage);
        profileName = (TextView) findViewById(R.id.tvProfileName);
        profileAge = (TextView) findViewById(R.id.tvProfileAge);
        profileEmail = (TextView) findViewById(R.id.tvProfileEmail);
        profileUpdate = findViewById(R.id.btnEdit);
        profileChangePassword = findViewById(R.id.btnChangePassword);

        //For back button to go the Home Page
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /* Getting an instance of the Firebase */
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();

        /* Referencing Database */
        DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());

        StorageReference storageReference = firebaseStorage.getReference();
        storageReference.child(firebaseAuth.getUid()).child("Images").child("Profile Picture").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);

                Picasso.get().load(uri).fit().centerCrop().into(profileImage);
                // profileImage.setImageURI(uri);
            }
        });


        /* Accessing the database to retrieve data  */
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                UserProfile userProfile = dataSnapshot.getValue(UserProfile.class);
                profileName.setText("Name : " + userProfile.getUserName());
                profileAge.setText("Age : " + userProfile.getUserAge());
                profileEmail.setText("Email : " + userProfile.getUserEmail());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(ProfileActivity.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();

            }
        });

        // Linking the Edit Button to the Update Profile Activity
        profileUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this,UpdateProfileActivity.class);
                startActivity(intent);
            }
        });

        // Linking the Change Password Button to the Update Password Activity

        profileChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, UpdatePassword.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}


