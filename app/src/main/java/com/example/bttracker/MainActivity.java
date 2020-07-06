package com.example.bttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLog(View view) {
      Intent toLog = new Intent(this,LogActivity.class);
      startActivity(toLog);
    }

    public void goToNormal(View view) {
        Intent i1=new Intent(this,NormalActivity.class);
        startActivity(i1);
    }

    public void goToMechanism(View view) {
        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scientificamerican.com/article/what-causes-a-fever/"));
        startActivity(i2);
    }

    public void openHandleFeverLink(View view) {
        Intent i3= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));
        startActivity(i3);
    }
}
