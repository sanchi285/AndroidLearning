package com.example.sanchisandroidproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recyclerview_projects_id);

        Project gettingStartedProject = new Project("Getting Started Apps",
                "Our Very First App", R.drawable.getting_started
        );
        Project[] projects = {new Project("Calculator App",
                "Our Very First App", R.drawable.calculator
        ),
                new Project("Motivation ",
                        "Our Very First App", R.drawable.quote
                ),
                new Project("Challenge",
                        "Our Very First App", R.drawable.tape
                ),
                new Project("BMI",
                        "It is a helth app", R.drawable.tape
                ),
                new Project("Hungry dev",
                        "Teaches me list View",R.drawable.hungry_developer
                ),
                new Project("Motivation ",
                        "Our Very First App", R.drawable.quote
                ),
                new Project("Challenge",
                        "Our Very First App", R.drawable.tape
                ),
                new Project("BMI",
                        "It is a helth app", R.drawable.tape
                ),
                new Project("Hungry dev",
                        "Teaches me list View",R.drawable.hungry_developer
                )
        };

        ProjectsAdapter adapter =  new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}