package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String alertTest = "This is my Variable Text";
        //Toast.makeText(this,alertTest,Toast.LENGTH_LONG)
        //        .show();
        TextView resultText =  findViewById(R.id.text_view_result);

        RadioButton malebutton = findViewById(R.id.radio_button_male);
        RadioButton femalebutton = findViewById(R.id.radio_button_female);

        EditText ageText = findViewById(R.id.text_age);
        EditText feetText = findViewById(R.id.text_feet);
        EditText inchesText = findViewById(R.id.text_inches);
        EditText  weightText = findViewById(R.id.text_weight);

        Button calculateButton = findViewById(R.id.button_calculate);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked",Toast.LENGTH_LONG)
                        .show();
            }
        });

    }
}