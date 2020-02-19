package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class CategoriesScreen extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_screen);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton6);
    }
}
