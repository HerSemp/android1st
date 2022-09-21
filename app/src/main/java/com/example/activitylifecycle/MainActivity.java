package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaring Variables
    public TextView tv_title;

    public Button bt_clickMe;
    public EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"I am created",Toast.LENGTH_SHORT).show();

        //Initialisation of variables
        tv_title = findViewById(R.id.tx_firstScreen);
        bt_clickMe = findViewById(R.id.bt_second);
        text = findViewById(R.id.text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"I am starting", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"I am resuming", Toast.LENGTH_SHORT).show();

        //implementing button click action
        bt_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = text.getText().toString();
                Bundle b = new Bundle();
                b.putString("MyText", message);

                //implementing intent to reach second activity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"I am pausing", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"I am stopping", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"I am restarting", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Vawulence", Toast.LENGTH_SHORT).show();
    }
}