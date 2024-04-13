package com.example.thehungrydeveloper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CardView startercard;
    CardView maincard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        startercard = findViewById(R.id.card_view_starter);
        maincard = findViewById(R.id.card_view_main);

        startercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starterActivityIntend =  new Intent(MainActivity.this,StartersActivity.class);
                startActivity(starterActivityIntend);
            }
        });

        maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuCourseIntendActivity =  new Intent(MainActivity.this,MenuCourseActivity.class);
                startActivity(menuCourseIntendActivity);
            }
        });

        TextView textViewEmail = findViewById(R.id.text_view_email);
        textViewEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntend = new Intent(Intent.ACTION_SENDTO);
                emailIntend.setData(Uri.parse("mailto:newtest151285@gmail.com")); // Only email apps handle this.
                startActivity(emailIntend);
            }
        });

    }
}