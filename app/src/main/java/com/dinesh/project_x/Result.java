package com.dinesh.project_x;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends quizpage {

    public TextView Technology,Medicine,Business,Civil_Services,Creativity;

    public int tech,med,bus,civ,cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Technology = (TextView)findViewById(R.id.Technology);
        Medicine = (TextView)findViewById(R.id.Medicine);
        Business = (TextView)findViewById(R.id.Business);
        Civil_Services = (TextView)findViewById(R.id.Civil_Services);
        Creativity = (TextView)findViewById(R.id.Creativity);

        tech = department[1] + department[6] + department[11] + department[16];
        Technology.setText(tech);

        med = department[1] + department[6] + department[11] + department[16];
        Medicine.setText(med);

        bus = department[1] + department[6] + department[11] + department[16];
        Business.setText(bus);

        civ = department[1] + department[6] + department[11] + department[16];
        Civil_Services.setText(civ);

        cre = department[1] + department[6] + department[11] + department[16];
        Creativity.setText(cre);
    }
}
