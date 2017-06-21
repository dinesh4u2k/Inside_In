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
        int myvalue = intent.getIntExtra("technology",0);
        int myvalue1 = intent.getIntExtra("medicine",0);
        int myvalue2 = intent.getIntExtra("business",0);
        int myvalue3 = intent.getIntExtra("civil_services",0);
        int myvalue4 = intent.getIntExtra("creativity",0);
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

