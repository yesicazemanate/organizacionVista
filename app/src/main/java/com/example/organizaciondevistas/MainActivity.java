package com.example.organizaciondevistas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnLinear;
    Button btnTable;
    Button btnRelative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLinear = findViewById(R.id.botonlinear);
        btnTable = findViewById(R.id.botontable);
        btnRelative= findViewById(R.id.botonrelative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext= new Intent(MainActivity.this, Relative.class);
                startActivity(goNext);
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext= new Intent(MainActivity.this, Table.class);
                startActivity(goNext);
            }
        });
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext= new Intent(MainActivity.this, LinearLayout.class);
                startActivity(goNext);
            }

        });
    }
}