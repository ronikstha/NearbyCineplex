package com.example.nearbycineplex;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nearbycineplex.activities.MovieActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button detailView1;
    private Button detailView2;
    private Button detailView3;
    private Button detailView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        detailView1 = findViewById(R.id.detailView1);
        detailView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovieActivity();
            }
        });

        detailView2 = findViewById(R.id.detailView2);
        detailView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovieActivity();
            }
        });

        detailView3 = findViewById(R.id.detailView3);
        detailView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovieActivity();
            }
        });

        detailView4 = findViewById(R.id.detailView4);
        detailView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMovieActivity();
            }
        });

    }

    private void openMovieActivity() {
        Intent intent = new Intent(this, MovieActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }
}


