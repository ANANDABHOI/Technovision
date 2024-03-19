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

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contact);

        ImageButton imageButton9 = findViewById(R.id.imageButton7);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://www.facebook.com/Technovation2020?mibextid=ZbWKwL";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });
        ImageButton imageButton10 = findViewById(R.id.imageButton22);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://www.instagram.com/technovation2024/?igsh=MTI5dTZpdWFldWlqMQ%3D%3D";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton11 = findViewById(R.id.imageButton21);
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://twitter.com/i/flow/login?redirect_after_login=%2FOTechnovation";
                // Create an Intent with ACTION_VIEW to open the website link
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Start the activity
                startActivity(intent);
            }
        });

        ImageButton imageButton14 = findViewById(R.id.imageButton20);
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the website URL
                String url = "https://www.youtube.com/@TECHNOVATION5.O";
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