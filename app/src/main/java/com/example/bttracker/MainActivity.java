package com.example.bttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainButton1=findViewById(R.id.MainButton1);
        mainButton1.setOnClickListener(this);

        TextView mainButton2=findViewById(R.id.MainButton2);
        mainButton2.setOnClickListener(this);

        TextView mainButton3=findViewById(R.id.MainButton3);
        mainButton3.setOnClickListener(this);

        TextView mainButton4=findViewById(R.id.MainButton4);
        mainButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.MainButton1:
                //If MainButton1 is clicked, do something
                Intent toLog=new Intent(this, LogActivity.class);
                startActivity(toLog);
                break;
            case R.id.MainButton2:
                //If MianButton is clicked, do something
                Intent toNormal=new Intent(this, NormalActivity.class);
                startActivity(toNormal);
                break;
            case R.id.MainButton3:
                //If MainButton is clicked, do something
                Intent openMechanismLink=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.scientificamerican.com/article/what-causes-a-fever/"));
            case R.id.MainButton4:
                //If MainButton is clicked, do something
                Intent openFeverLink=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));
                //Verify that the intent openFeverLink will res/olve properly
                if(openFeverLink.resolveActivity(getPackageManager()) !=null){
                    startActivity(openFeverLink);
            }
                break;
        }

    }






    public void openHandleFeverLink(View view) {
        Intent i3= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));
        startActivity(i3);
    }
}
