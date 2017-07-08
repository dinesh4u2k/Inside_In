package com.dinesh.project_x;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import java.lang.Float;

public class quizpage extends AppCompatActivity {
    private Questions mtechnology0 = new Questions();
    private Questions mtechnology5 = new Questions();
    private Questions mtechnology10 = new Questions();
    private Questions mtechnology15 = new Questions();
    private Questions mmedicine1 = new Questions();
    private Questions mmedicine6 = new Questions();
    private Questions mmedicine11 = new Questions();
    private Questions mmedicine16 = new Questions();
    private Questions mbusiness2 = new Questions();
    private Questions mbusiness7 = new Questions();
    private Questions mbusiness12 = new Questions();
    private Questions mbusiness17 = new Questions();
    private Questions mcivil3 = new Questions();
    private Questions mcivil8 = new Questions();
    private Questions mcivil13 = new Questions();
    private Questions mcivil18 = new Questions();
    private Questions mcre4 = new Questions();
    private Questions mcre9 = new Questions();
    private Questions mcre14 = new Questions();
    private Questions mcre19 = new Questions();

    private Button option1,option2,option3,option4;
    private TextView question , score;
    private int mScore = 0;
    private int mQuestionLength1 = mtechnology0.mtechnology0.length;
    private  int mQuestionLength2 = mtechnology5.mtechnology5.length;
    private  int mQuestionLength3 = mtechnology10.mtechnology10.length;
    private  int mQuestionLength4 = mtechnology15.mtechnology15.length;
    private int mQuestionLength5 = mmedicine1.mmedicine1.length;
    private int mQuestionLength6 = mmedicine6.mmedicine6.length;
    private int mQuestionLength7 = mmedicine11.mmedicine11.length;
    private int mQuestionLength8 = mmedicine16.mmedicine16.length;
    private int mQuestionLength9 = mbusiness2.mbusiness2.length;
    private int mQuestionLength10 = mbusiness7.mbusiness7.length;
    private int mQuestionLength11= mbusiness12.mbusiness12.length;
    private int mQuestionLength12 = mbusiness17.mbusiness17.length;
    private int mQuestionLength13 = mcivil3.mcivil3.length;
    private int mQuestionLength14 = mcivil8.mcivil8.length;
    private int mQuestionLength15 = mcivil13.mcivil13.length;
    private int mQuestionLength16 = mcivil18.mcivil18.length;
    private  int mQuestionLength17 = mcre4.mcre4.length;
    private  int mQuestionLength18 = mcre9.mcre9.length;
    private  int mQuestionLength19 = mcre14.mcre14.length;
    private  int mQuestionLength20 = mcre19.mcre19.length;
    Random r;


    private int mQuestionNumber= 0;


    boolean doubleTap = false;
    public float[] department = new float[30];
    private int j=0;
    private int m=1;
    public float tech,med,bus,civ,cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);
        r=new Random();
        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);
        question = (TextView) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);
        if (m==1)
        updateQuestion1(r.nextInt(mQuestionLength1));
        else if (m==2)
        updateQuestion5(r.nextInt(mQuestionLength5));
        else if (m==3)
        updateQuestion9(r.nextInt(mQuestionLength9));
        else if (m==4)
        updateQuestion13(r.nextInt(mQuestionLength13));
        else if (m==5)
        updateQuestion17(r.nextInt(mQuestionLength17));
        else if (m==6)
        updateQuestion2(r.nextInt(mQuestionLength2));
        else if (m==7)
        updateQuestion6(r.nextInt(mQuestionLength6));
        else if (m==8)
        updateQuestion10(r.nextInt(mQuestionLength10));
        else if (m==9)
        updateQuestion14(r.nextInt(mQuestionLength14));
        else if (m==10)
        updateQuestion18(r.nextInt(mQuestionLength18));
        else if (m==11)
        updateQuestion3(r.nextInt(mQuestionLength3));
        else if (m==12)
        updateQuestion7(r.nextInt(mQuestionLength7));
        else if (m==13)
        updateQuestion11(r.nextInt(mQuestionLength11));
        else if (m==14)
        updateQuestion15(r.nextInt(mQuestionLength15));
        else if (m==15)
        updateQuestion19(r.nextInt(mQuestionLength19));
        else if (m==16)
        updateQuestion4(r.nextInt(mQuestionLength4));
        else if (m==17)
        updateQuestion8(r.nextInt(mQuestionLength8));
        else if (m==18)
        updateQuestion12(r.nextInt(mQuestionLength12));
        else if (m==19)
        updateQuestion16(r.nextInt(mQuestionLength16));
        else if (m==20)
        updateQuestion20(r.nextInt(mQuestionLength20));

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option1.getText() == "Very Intrested") {
                    updatePoints();
                    mScore++;
                    updateScore(mScore);
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                         med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);
                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));


                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);
                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));


                    }

                }

                        }
                    });

        option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (option2.getText() == "Intrested") {
                          updatePoints1();
                                mScore++;
                                updateScore(mScore);
                                if (mQuestionNumber == 20) {
                                    tech = (department[0] + department[5] + department[10] + department[15]);
                                    med = (department[1] + department[6] + department[11] + department[16]);
                                    bus = (department[2] + department[7] + department[12] + department[17]);
                                    civ = (department[3] + department[8] + department[13] + department[18]);
                                    cre = (department[4] + department[9] + department[14] + department[19]);
                                    String neww = Float.toString(tech);
                                    float newww = Float.parseFloat(neww);
                                    String neww1 = Float.toString(med);
                                    float newww1 = Float.parseFloat(neww1);
                                    String neww2 = Float.toString(bus);
                                    float newww2 = Float.parseFloat(neww2);
                                    String neww3= Float.toString(civ);
                                    float newww3 = Float.parseFloat(neww3);
                                    String neww4 = Float.toString(cre);
                                    float newww4 = Float.parseFloat(neww4);
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    i.putExtra("technology",newww);
                                    i.putExtra("medicine",newww1);
                                    i.putExtra("business",newww2);
                                    i.putExtra("civil_services",newww3);
                                    i.putExtra("creativity",newww4);
                                    quizpage.this.finish();
                                    startActivity(i);
                                } else {
                                    if (m==1)
                                        updateQuestion1(r.nextInt(mQuestionLength1));
                                    else if (m==2)
                                        updateQuestion5(r.nextInt(mQuestionLength5));
                                    else if (m==3)
                                        updateQuestion9(r.nextInt(mQuestionLength9));
                                    else if (m==4)
                                        updateQuestion13(r.nextInt(mQuestionLength13));
                                    else if (m==5)
                                        updateQuestion17(r.nextInt(mQuestionLength17));
                                    else if (m==6)
                                        updateQuestion2(r.nextInt(mQuestionLength2));
                                    else if (m==7)
                                        updateQuestion6(r.nextInt(mQuestionLength6));
                                    else if (m==8)
                                        updateQuestion10(r.nextInt(mQuestionLength10));
                                    else if (m==9)
                                        updateQuestion14(r.nextInt(mQuestionLength14));
                                    else if (m==10)
                                        updateQuestion18(r.nextInt(mQuestionLength18));
                                    else if (m==11)
                                        updateQuestion3(r.nextInt(mQuestionLength3));
                                    else if (m==12)
                                        updateQuestion7(r.nextInt(mQuestionLength7));
                                    else if (m==13)
                                        updateQuestion11(r.nextInt(mQuestionLength11));
                                    else if (m==14)
                                        updateQuestion15(r.nextInt(mQuestionLength15));
                                    else if (m==15)
                                        updateQuestion19(r.nextInt(mQuestionLength19));
                                    else if (m==16)
                                        updateQuestion4(r.nextInt(mQuestionLength4));
                                    else if (m==17)
                                        updateQuestion8(r.nextInt(mQuestionLength8));
                                    else if (m==18)
                                        updateQuestion12(r.nextInt(mQuestionLength12));
                                    else if (m==19)
                                        updateQuestion16(r.nextInt(mQuestionLength16));
                                    else if (m==20)
                                        updateQuestion20(r.nextInt(mQuestionLength20));


                                }
                            } else {
                                if (mQuestionNumber == 20) {
                                    tech = (department[0] + department[5] + department[10] + department[15]);
                                    med = (department[1] + department[6] + department[11] + department[16]);
                                    bus = (department[2] + department[7] + department[12] + department[17]);
                                    civ = (department[3] + department[8] + department[13] + department[18]);
                                    cre = (department[4] + department[9] + department[14] + department[19]);
                                    String neww = Float.toString(tech);
                                    float newww = Float.parseFloat(neww);
                                    String neww1 = Float.toString(med);
                                    float newww1 = Float.parseFloat(neww1);
                                    String neww2 = Float.toString(bus);
                                    float newww2 = Float.parseFloat(neww2);
                                    String neww3= Float.toString(civ);
                                    float newww3 = Float.parseFloat(neww3);
                                    String neww4 = Float.toString(cre);
                                    float newww4 = Float.parseFloat(neww4);
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    i.putExtra("technology",newww);
                                    i.putExtra("medicine",newww1);
                                    i.putExtra("business",newww2);
                                    i.putExtra("civil_services",newww3);
                                    i.putExtra("creativity",newww4);
                                    quizpage.this.finish();
                                    startActivity(i);

                                } else {
                                    if (m==1)
                                        updateQuestion1(r.nextInt(mQuestionLength1));
                                    else if (m==2)
                                        updateQuestion5(r.nextInt(mQuestionLength5));
                                    else if (m==3)
                                        updateQuestion9(r.nextInt(mQuestionLength9));
                                    else if (m==4)
                                        updateQuestion13(r.nextInt(mQuestionLength13));
                                    else if (m==5)
                                        updateQuestion17(r.nextInt(mQuestionLength17));
                                    else if (m==6)
                                        updateQuestion2(r.nextInt(mQuestionLength2));
                                    else if (m==7)
                                        updateQuestion6(r.nextInt(mQuestionLength6));
                                    else if (m==8)
                                        updateQuestion10(r.nextInt(mQuestionLength10));
                                    else if (m==9)
                                        updateQuestion14(r.nextInt(mQuestionLength14));
                                    else if (m==10)
                                        updateQuestion18(r.nextInt(mQuestionLength18));
                                    else if (m==11)
                                        updateQuestion3(r.nextInt(mQuestionLength3));
                                    else if (m==12)
                                        updateQuestion7(r.nextInt(mQuestionLength7));
                                    else if (m==13)
                                        updateQuestion11(r.nextInt(mQuestionLength11));
                                    else if (m==14)
                                        updateQuestion15(r.nextInt(mQuestionLength15));
                                    else if (m==15)
                                        updateQuestion19(r.nextInt(mQuestionLength19));
                                    else if (m==16)
                                        updateQuestion4(r.nextInt(mQuestionLength4));
                                    else if (m==17)
                                        updateQuestion8(r.nextInt(mQuestionLength8));
                                    else if (m==18)
                                        updateQuestion12(r.nextInt(mQuestionLength12));
                                    else if (m==19)
                                        updateQuestion16(r.nextInt(mQuestionLength16));
                                    else if (m==20)
                                        updateQuestion20(r.nextInt(mQuestionLength20));


                                }

                            }
                        }
                    });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option3.getText()=="Slightly Intrested"){

                    updatePoints2();
                    mScore++;
                    updateScore(mScore);

                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));

                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));


                    }

                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option4.getText()=="Not Intrested"){
                    updatePoints3();
                    mScore++;
                    updateScore(mScore);
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));


                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Float.toString(tech);
                        float newww = Float.parseFloat(neww);
                        String neww1 = Float.toString(med);
                        float newww1 = Float.parseFloat(neww1);
                        String neww2 = Float.toString(bus);
                        float newww2 = Float.parseFloat(neww2);
                        String neww3= Float.toString(civ);
                        float newww3 = Float.parseFloat(neww3);
                        String neww4 = Float.toString(cre);
                        float newww4 = Float.parseFloat(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        if (m==1)
                            updateQuestion1(r.nextInt(mQuestionLength1));
                        else if (m==2)
                            updateQuestion5(r.nextInt(mQuestionLength5));
                        else if (m==3)
                            updateQuestion9(r.nextInt(mQuestionLength9));
                        else if (m==4)
                            updateQuestion13(r.nextInt(mQuestionLength13));
                        else if (m==5)
                            updateQuestion17(r.nextInt(mQuestionLength17));
                        else if (m==6)
                            updateQuestion2(r.nextInt(mQuestionLength2));
                        else if (m==7)
                            updateQuestion6(r.nextInt(mQuestionLength6));
                        else if (m==8)
                            updateQuestion10(r.nextInt(mQuestionLength10));
                        else if (m==9)
                            updateQuestion14(r.nextInt(mQuestionLength14));
                        else if (m==10)
                            updateQuestion18(r.nextInt(mQuestionLength18));
                        else if (m==11)
                            updateQuestion3(r.nextInt(mQuestionLength3));
                        else if (m==12)
                            updateQuestion7(r.nextInt(mQuestionLength7));
                        else if (m==13)
                            updateQuestion11(r.nextInt(mQuestionLength11));
                        else if (m==14)
                            updateQuestion15(r.nextInt(mQuestionLength15));
                        else if (m==15)
                            updateQuestion19(r.nextInt(mQuestionLength19));
                        else if (m==16)
                            updateQuestion4(r.nextInt(mQuestionLength4));
                        else if (m==17)
                            updateQuestion8(r.nextInt(mQuestionLength8));
                        else if (m==18)
                            updateQuestion12(r.nextInt(mQuestionLength12));
                        else if (m==19)
                            updateQuestion16(r.nextInt(mQuestionLength16));
                        else if (m==20)
                            updateQuestion20(r.nextInt(mQuestionLength20));

                    }

                }
            }
        });


    }

        public void updatePoints(){
            department[j] = 24.13f;
            j++;

        }public void updatePoints1(){
        department[j] = 18.67f;
        j++;

    }
    public void updatePoints2(){
        department[j] = 14.03f;
        j++;

    }
    public void updatePoints3(){
        department[j] = 8.89f;
        j++;

    }

      public void updateScore(int p){
    if (mScore<20)
          score.setText(mScore+"/20");
      }

        public void updateQuestion1(int num) {
            question.setText(mtechnology0.gettechnology0(num));
            option1.setText(mtechnology0.getChoice1());
            option2.setText(mtechnology0.getChoice2());
            option3.setText(mtechnology0.getChoice3());
            option4.setText(mtechnology0.getChoice4());
            m++;
            mQuestionNumber++;
        }
    public void updateQuestion2(int num) {
        question.setText(mtechnology5.gettechnology5(num));
        option1.setText(mtechnology5.getChoice1());
        option2.setText(mtechnology5.getChoice2());
        option3.setText(mtechnology5.getChoice3());
        option4.setText(mtechnology5.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion3(int num) {
        question.setText(mtechnology10.gettechnology10(num));
        option1.setText(mtechnology10.getChoice1());
        option2.setText(mtechnology10.getChoice2());
        option3.setText(mtechnology10.getChoice3());
        option4.setText(mtechnology10.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion4(int num) {
        question.setText(mtechnology15.gettechnology15(num));
        option1.setText(mtechnology15.getChoice1());
        option2.setText(mtechnology15.getChoice2());
        option3.setText(mtechnology15.getChoice3());
        option4.setText(mtechnology15.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion5(int num) {
        question.setText(mmedicine1.getmedicine1(num));
        option1.setText(mmedicine1.getChoice1());
        option2.setText(mmedicine1.getChoice2());
        option3.setText(mmedicine1.getChoice3());
        option4.setText(mmedicine1.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion6(int num) {
        question.setText(mmedicine6.getmedicine6(num));
        option1.setText(mmedicine6.getChoice1());
        option2.setText(mmedicine6.getChoice2());
        option3.setText(mmedicine6.getChoice3());
        option4.setText(mmedicine6.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion7(int num) {
        question.setText(mmedicine11.getmedicine11(num));
        option1.setText(mmedicine11.getChoice1());
        option2.setText(mmedicine11.getChoice2());
        option3.setText(mmedicine11.getChoice3());
        option4.setText(mmedicine11.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion8(int num) {
        question.setText(mmedicine16.getmedicine16(num));
        option1.setText(mmedicine16.getChoice1());
        option2.setText(mmedicine16.getChoice2());
        option3.setText(mmedicine16.getChoice3());
        option4.setText(mmedicine16.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion9(int num) {
        question.setText(mbusiness2.getbusiness2(num));
        option1.setText(mbusiness2.getChoice1());
        option2.setText(mbusiness2.getChoice2());
        option3.setText(mbusiness2.getChoice3());
        option4.setText(mbusiness2.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion10(int num) {
        question.setText(mbusiness7.getbusiness7(num));
        option1.setText(mbusiness7.getChoice1());
        option2.setText(mbusiness7.getChoice2());
        option3.setText(mbusiness7.getChoice3());
        option4.setText(mbusiness7.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion11(int num) {
        question.setText(mbusiness12.getbusiness12(num));
        option1.setText(mbusiness12.getChoice1());
        option2.setText(mbusiness12.getChoice2());
        option3.setText(mbusiness12.getChoice3());
        option4.setText(mbusiness12.getChoice4());
        m++;
        mQuestionNumber++;

    }   public void updateQuestion12(int num) {
        question.setText(mbusiness17.getbusiness17(num));
        option1.setText(mbusiness17.getChoice1());
        option2.setText(mbusiness17.getChoice2());
        option3.setText(mbusiness17.getChoice3());
        option4.setText(mbusiness17.getChoice4());
        m++;
        mQuestionNumber++;

    }   public void updateQuestion13(int num) {
        question.setText(mcivil3.getcivil3(num));
        option1.setText(mcivil3.getChoice1());
        option2.setText(mcivil3.getChoice2());
        option3.setText(mcivil3.getChoice3());
        option4.setText(mcivil3.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion14(int num) {
        question.setText(mcivil8.getcivil8(num));
        option1.setText(mcivil8.getChoice1());
        option2.setText(mcivil8.getChoice2());
        option3.setText(mcivil8.getChoice3());
        option4.setText(mcivil8.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion15(int num) {
        question.setText(mcivil13.getcivil13(num));
        option1.setText(mcivil13.getChoice1());
        option2.setText(mcivil13.getChoice2());
        option3.setText(mcivil13.getChoice3());
        option4.setText(mcivil13.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion16(int num) {
        question.setText(mcivil18.getcivil18(num));
        option1.setText(mcivil18.getChoice1());
        option2.setText(mcivil18.getChoice2());
        option3.setText(mcivil18.getChoice3());
        option4.setText(mcivil18.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion17(int num) {
        question.setText(mcre4. getcre4(num));
        option1.setText(mcre4.getChoice1());
        option2.setText(mcre4.getChoice2());
        option3.setText(mcre4.getChoice3());
        option4.setText(mcre4.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion18(int num) {
        question.setText(mcre9. getcre9(num));
        option1.setText(mcre9.getChoice1());
        option2.setText(mcre9.getChoice2());
        option3.setText(mcre9.getChoice3());
        option4.setText(mcre9.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion19(int num) {
        question.setText(mcre14. getcre14(num));
        option1.setText(mcre14.getChoice1());
        option2.setText(mcre14.getChoice2());
        option3.setText(mcre14.getChoice3());
        option4.setText(mcre14.getChoice4());
        m++;
        mQuestionNumber++;

    }
    public void updateQuestion20(int num) {
        question.setText(mcre19. getcre19(num));
        option1.setText(mcre19.getChoice1());
        option2.setText(mcre19.getChoice2());
        option3.setText(mcre19.getChoice3());
        option4.setText(mcre19.getChoice4());
        m++;
        mQuestionNumber++;

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
