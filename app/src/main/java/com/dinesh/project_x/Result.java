package com.dinesh.project_x;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity   {

    public TextView Technology,Medicine,Business,Civil_Services,Creativity;

    boolean doubleTap = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Technology = (TextView)findViewById(R.id.Technology);
        Medicine = (TextView)findViewById(R.id.Medicine);
        Business = (TextView)findViewById(R.id.Business);
        Civil_Services = (TextView)findViewById(R.id.Civil_Services);
        Creativity = (TextView)findViewById(R.id.Creativity);

        Intent intent = getIntent();
        float myvalue = intent.getFloatExtra("technology",0.0f);
        float myvalue1 = intent.getFloatExtra("medicine",0.0f);
        float myvalue2 = intent.getFloatExtra("business",0.0f);
        float myvalue3 = intent.getFloatExtra("civil_services",0.0f);
        float myvalue4 = intent.getFloatExtra("creativity",0.0f);
        Technology.setText(""+myvalue);
        Medicine.setText(""+myvalue1);
        Business.setText(""+myvalue2);
        Civil_Services.setText(""+myvalue3);
        Creativity.setText(""+myvalue4);

        }
    public void onBackPressed(){
        if(doubleTap){
            super.onBackPressed();
        }
        else {
            Toast.makeText(this,"Press Back Button To Exit" , Toast.LENGTH_SHORT).show();
            doubleTap = true;
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleTap = false;
                }
            }, 500);
        }
    }
    }

