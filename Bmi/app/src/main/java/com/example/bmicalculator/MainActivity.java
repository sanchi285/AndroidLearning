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
    private Button calculateButton;
    private String alertTest;
    private TextView resultText;
    private RadioButton malebutton;
    private RadioButton femalebutton;
    private EditText ageText;
    private EditText feetText;
    private EditText inchesText;
    private EditText weightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
          findView();
          setUpButtonClickListener();

    }


    private void findView() {
        alertTest = "This is my Variable Text";
        //Toast.makeText(this,alertTest,Toast.LENGTH_LONG)
        //        .show();
        resultText = findViewById(R.id.text_view_result);

        malebutton = findViewById(R.id.radio_button_male);
        femalebutton = findViewById(R.id.radio_button_female);

        ageText = findViewById(R.id.text_age);
        feetText = findViewById(R.id.text_feet);
        inchesText = findViewById(R.id.text_inches);
        weightText = findViewById(R.id.text_weight);
        calculateButton = findViewById(R.id.button_calculate);

    }

    private void setUpButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        String ageTextv = ageText.getText().toString();
        String feetTextv = feetText.getText().toString();
        String inchesTextv = inchesText.getText().toString();
        String weightTextv = weightText.getText().toString();
        resultText.setText("Age: " + ageTextv + " FeetText: " + feetTextv + " InchesText: " + inchesTextv + "weightText: " + weightTextv);

    }

}