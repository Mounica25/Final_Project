package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConvocationCenterActivity extends AppCompatActivity {

    private TextView ConvocationCenterDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocation_center);

        ConvocationCenterDesc = findViewById(R.id.tvCCDescription);


        ConvocationCenterDesc.setText("\n\n\n\t\t About the Convocation Center:\n" +
                "\n\tThe Jones Convocation Center (JCC), is named after former Senate President Emil Jones Jr. and his late wife Patricia, a graduate of Chicago State University. JCC is a $47 million multi-purpose facility." +
                "\n\n\t\t Opening Date:\n"+
                "\nThe Jones Convocation Center officially opened in the Fall of 2007 and now serves as the home to the Chicago State University Athletic Department and the men's and women's basketball teams. " +
                "\n\n\t\tSize:\n"+
                "\nThe Jones Convocation Center's arena is over 140,000 sq. ft.\n" +
                "\t\tFeatures:\n"+
                "\nAmple parking, on-site security, multiple concession areas, a large and bright main lobby, eight locker rooms, a weight room, a training room, a media room, and a reception area.\n\n" +
                "\t\tEvents:"+
                "\n\nCSU Commencement Ceremony\n" +
                "\n" +
                "CSU Basketball Games\n" +
                "\n"+
                "CPS Basketball Tournaments\n" +
                "\n" +
                "CPS Graduations\n" +
                "\n" +
                "Concerts\n" +
                "\n" +
                "Theatrical Productions\n" +
                "\n" +
                "Government Job Fairs\n" +
                "\n" +
                "Family Shows" +
                "\n\n" +
                "\t\tAddress:\n\n" +
                "Emil and Patricia A. Jones Convocation Center\n" +
                "\n" +
                "Chicago State University\n" +
                "\n" +
                "9501 South King Dr.\n" +
                "\n" +
                "Chicago, IL 60628"+
                "\n\n Location:\n\n" +
                "The Jones Convocation Center is centrally located at the merge of the I-57 and I-94 expressways, which is easily accessed by I-294, I-80, and I-55.");

    }
}
