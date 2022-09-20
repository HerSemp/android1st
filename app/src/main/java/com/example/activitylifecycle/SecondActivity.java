package com.example.activitylifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public Button bt_back;
    public Button bt_next;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "Oncreate started", Toast.LENGTH_SHORT).show();

        bt_back = findViewById(R.id.bt_back);
        bt_next = findViewById(R.id.bt_next);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume started", Toast.LENGTH_SHORT).show();
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(i2);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestat started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onstop started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
