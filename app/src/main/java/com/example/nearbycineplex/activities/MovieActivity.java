package com.example.nearbycineplex.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nearbycineplex.R;

public class MovieActivity extends AppCompatActivity {

    private Button timeA;
    private Button timeB;
    private Button timeC;
    private Button timeD;
    private Button timeE;
    private Button timeF;
    private Button timeG;
    private Button timeH;
    private Button timeI;
    private Button returnToHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        timeA = findViewById(R.id.timeA);
        timeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeB = findViewById(R.id.timeB);
        timeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeC = findViewById(R.id.timeC);
        timeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeD = findViewById(R.id.timeD);
        timeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeE = findViewById(R.id.timeE);
        timeE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeF = findViewById(R.id.timeF);
        timeF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeG = findViewById(R.id.timeG);
        timeG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeH = findViewById(R.id.timeH);
        timeH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        timeI = findViewById(R.id.timeI);
        timeI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeatingPlanActivity();
            }
        });

        returnToHome = findViewById(R.id.returnToHome);
        returnToHome.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        }));
    }

    private void openSeatingPlanActivity() {
    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, MovieActivity.class);
        startActivity(intent);
    }
}
