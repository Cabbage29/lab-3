package com.example.lab3profile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String STUDENT_NAME = "Abraham Joy AL Selvarajoo";
    private static final String MATRIC_NUMBER = "4241003072";
    private static final String COURSE_NAME = "IAS3153 Mobile Programming";

    private Button btnViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewDetails = findViewById(R.id.btnViewDetails);

        btnViewDetails.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", STUDENT_NAME);
            intent.putExtra("matric", MATRIC_NUMBER);
            intent.putExtra("course", COURSE_NAME);
            startActivity(intent);
        });
    }
}
