package com.example.android.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SexualAssaultActivity extends AppCompatActivity {

    private TextView SexualAssualtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexual_assault);

        SexualAssualtDesc = findViewById(R.id.tvSexualAssltDesc);
        SexualAssualtDesc.setText("\t\t Chicago State University is committed to creating and maintaining a community in which students, faculty, and staff can work together in an atmosphere free from all forms of discrimination. Chicago State University is strongly opposed to discrimination, including sexual harassment, and such behavior is prohibited by University policy.\n\n" +
                "\t Title IX of the Education Amendments of 1972 provides that:\n\n" +
                "\t\t\t “No person in the United States shall, on the basis of sex, be excluded from participation in, be denied the benefits of, or be subjected to discrimination under any education program or activity receiving Federal financial assistance….”  20 U.S.C. § 1681 and 34 C.F.R. Part 106 (1972).\n\n" +
                "\t Title IX is commonly thought of as pertaining to sports, but it is actually much broader. Title IX prohibits gender discrimination in all programs and activities of a college or university." +
                "");
    }
}
