package com.example.lab3profile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView txtName;
    private TextView txtMatric;
    private TextView txtCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtName = findViewById(R.id.txtDetailName);
        txtMatric = findViewById(R.id.txtDetailMatric);
        txtCourse = findViewById(R.id.txtDetailCourse);

        String name = getIntent().getStringExtra("name");
        String matric = getIntent().getStringExtra("matric");
        String course = getIntent().getStringExtra("course");

        txtName.setText(getString(R.string.name_format, safeText(name)));
        txtMatric.setText(getString(R.string.matric_format, safeText(matric)));
        txtCourse.setText(getString(R.string.course_format, safeText(course)));
    }

    private String safeText(String value) {
        return value == null ? "-" : value;
    }
}
