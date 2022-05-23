package com.manuni.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button secondBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        secondBtn = findViewById(R.id.secondBtn);


        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,SecondActivity.class));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        //Toast.makeText(this, "First calling onCreate Method", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "MainActivity onCreate Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "Second calling onStart Method", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "MainActivity onStart Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "Third calling onResume Method", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "MainActivity onResume Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "Now calling onPause Method", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "MainActivity onPause Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "MainActivity onStop Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "MainActivity onRestart Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "MainActivity onDestroy Method", Toast.LENGTH_SHORT).show();

    }

}