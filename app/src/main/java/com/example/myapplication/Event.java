package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Event extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_event);
        ImageButton imageButton = findViewById(R.id.imageView3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSeDb-sNKTJ4-_xMcFBngwor5NbHl3apm5wpYJz6X5i1jtwwRw/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton1 = findViewById(R.id.imageView4);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSed1_B5INv5SiAzWOgLRUz_WpeVC-QLwFzagJ7Sbkq1BLx-Yw/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.imageView5);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSe2oZhoyP92Q6Jr8P6jblzDJ4vdLDW0kvtrLAoXsOpMjujGCg/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });
        ImageButton imageButton3 = findViewById(R.id.imageView6);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfQPJtMwFWhcc1NWHgxBKwuML7wY8alL--xPZ3SBf6lP19vUA/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton4 = findViewById(R.id.imageView7);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSelW5889ATIrTTByXEv7F1bHQpBIGvY-Tb42MC1Sz0olB4Ing/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = findViewById(R.id.imageView8);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSelW5889ATIrTTByXEv7F1bHQpBIGvY-Tb42MC1Sz0olB4Ing/viewform";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton6 = findViewById(R.id.imageView34);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLScB78JTqSrbpL_f4jJCPJFn-B_HuO5vPvK8p1ztyIqeAMT0ag/viewform?vc=0&c=0&w=1&flr=0";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton7 = findViewById(R.id.imageView35);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSeFFEcM2XP0dlNxW2Vj2hSPOOOnIrc9kTYixUTTG79PoS-hFA/viewform?vc=0&c=0&w=1&flr=0";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton8 = findViewById(R.id.imageView36);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLScrV8_J8-9eV4uIzb1l6WtMR_62dZmHlUHq1mUB7JNUSRKgGQ/viewform?vc=0&c=0&w=1&flr=0";

                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton9 = findViewById(R.id.imageView37);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSd836kAxeAmxVSybLwwoVp-GvJqC4PvglnwtKjSivtaxhs3hA/viewform?vc=0&c=0&w=1&flr=0";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton10 = findViewById(R.id.imageView38);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSe2vnwmEKGDQ8gE7op3OGFAMizEuPnjuq-13Ju2YflqYEWblA/viewform?vc=0&c=0&w=1&flr=0";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton11 = findViewById(R.id.imageView39);
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSdOvljb8D1GOH4L-qE7K1xwwxO_wrqM-nVNwM9IapcQq-bYgg/viewform?vc=0&c=0&w=1&flr=0";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}