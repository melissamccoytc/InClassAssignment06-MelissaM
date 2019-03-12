package com.example.android.animalinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitInfo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String animalName = ((EditText)findViewById(R.id.animal_name)).getText().toString();
        String numberOfLegs = ((EditText)findViewById(R.id.number_of_legs)).getText().toString();
        String moreInfo = ((EditText)findViewById(R.id.more_information)).getText().toString();
        CheckBox furCheckBox = findViewById(R.id.has_fur);
        boolean hasFur = furCheckBox.isChecked();



        if(hasFur) {
            intent.putExtra(Keys.ANIMAL_NAME, animalName);
            intent.putExtra(Keys.NUMBER_OF_LEGS, numberOfLegs);
            intent.putExtra(Keys.HAS_FUR, "True");
            intent.putExtra(Keys.MORE_INFORMATION, moreInfo);
            startActivity(intent);
        }
        else{
            intent.putExtra(Keys.ANIMAL_NAME, animalName);
            intent.putExtra(Keys.NUMBER_OF_LEGS, numberOfLegs);
            intent.putExtra(Keys.HAS_FUR, "False");
            intent.putExtra(Keys.MORE_INFORMATION, moreInfo);
            startActivity(intent);
        }

    }
}
