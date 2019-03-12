package com.example.android.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = getIntent();

        TextView textView = findViewById(R.id.text_view);
        String animalName = myIntent.getStringExtra(Keys.ANIMAL_NAME);
        String numberOfLegs = myIntent.getStringExtra(Keys.NUMBER_OF_LEGS);
        String hasFur = myIntent.getStringExtra(Keys.HAS_FUR);
        String moreInfo = myIntent.getStringExtra(Keys.MORE_INFORMATION);
        textView.setText(String.format("Animal Name: %s\n" +
                "Number of Legs: %s\n" +
                "Has Fur? %s\n" +
                "Additional Information: %s", animalName, numberOfLegs, hasFur, moreInfo));

    }
}