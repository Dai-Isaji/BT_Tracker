package com.example.bttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogActivity(View view) {
      Intent toLog = new Intent(this,LogActivity.class);
      startActivity(toLog);
    }

    public void goToNormalActivity(View view) {
        Intent i1=new Intent(this,NormalActivity.class);
        startActivity(i1);
    }

    public void goToMechanism(View view) {
        Intent i2 = new Intent(this,MechanismActivity.class);
        startActivity(i2);
    }
}
