package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splace extends AppCompatActivity {

    private Handler handler; // Declare the Handler object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splace);

        handler = new Handler(); // Initialize the Handler object

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome =new Intent(splace.this, MainActivity.class);
                startActivity(iHome);
                finish(); // Optionally, you can finish the splash activity after starting the main activity
            }
        }, 4000); // 4000 milliseconds delay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


