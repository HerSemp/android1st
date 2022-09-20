package com.example.activitylifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    public Button bt_backP;
    public Button bt_backM;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(this, "Third Oncreate started", Toast.LENGTH_SHORT).show();

        bt_backP = findViewById(R.id.bt_backP);
        bt_backM = findViewById(R.id.bt_backM);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Third onStart started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Third onResume started", Toast.LENGTH_SHORT).show();
        bt_backP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(i);

            }
        });
        bt_backM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Third onPause started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Third onRestat started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Third onstop started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Third on destroy started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
