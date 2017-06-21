package com.dinesh.project_x;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quizpage extends AppCompatActivity {

    private Questions mQuestions = new Questions();
    private Button option1,option2,option3,option4;
    private TextView question , score;
    private int mScore = 0;

    private int mQuestionNumber= 0;


    boolean doubleTap = false;
    public int[] department = new int[30];
    private int j=0;
    private int m=0;
    public int tech,med,bus,civ,cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);
        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);
        question = (TextView) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);
        updateQuestion();
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
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
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
                                    String neww = Integer.toString(tech);
                                    int newww = Integer.parseInt(neww);
                                    String neww1 = Integer.toString(med);
                                    int newww1 = Integer.parseInt(neww1);
                                    String neww2 = Integer.toString(bus);
                                    int newww2 = Integer.parseInt(neww2);
                                    String neww3= Integer.toString(civ);
                                    int newww3 = Integer.parseInt(neww3);
                                    String neww4 = Integer.toString(cre);
                                    int newww4 = Integer.parseInt(neww4);
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    i.putExtra("technology",newww);
                                    i.putExtra("medicine",newww1);
                                    i.putExtra("business",newww2);
                                    i.putExtra("civil_services",newww3);
                                    i.putExtra("creativity",newww4);
                                    quizpage.this.finish();
                                    startActivity(i);
                                } else {
                                    updateQuestion();
                                }
                            } else {
                                if (mQuestionNumber == 20) {
                                    tech = (department[0] + department[5] + department[10] + department[15]);
                                    med = (department[1] + department[6] + department[11] + department[16]);
                                    bus = (department[2] + department[7] + department[12] + department[17]);
                                    civ = (department[3] + department[8] + department[13] + department[18]);
                                    cre = (department[4] + department[9] + department[14] + department[19]);
                                    String neww = Integer.toString(tech);
                                    int newww = Integer.parseInt(neww);
                                    String neww1 = Integer.toString(med);
                                    int newww1 = Integer.parseInt(neww1);
                                    String neww2 = Integer.toString(bus);
                                    int newww2 = Integer.parseInt(neww2);
                                    String neww3= Integer.toString(civ);
                                    int newww3 = Integer.parseInt(neww3);
                                    String neww4 = Integer.toString(cre);
                                    int newww4 = Integer.parseInt(neww4);
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    i.putExtra("technology",newww);
                                    i.putExtra("medicine",newww1);
                                    i.putExtra("business",newww2);
                                    i.putExtra("civil_services",newww3);
                                    i.putExtra("creativity",newww4);
                                    quizpage.this.finish();
                                    startActivity(i);

                                } else {
                                    updateQuestion();
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
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
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
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == 20) {
                        tech = (department[0] + department[5] + department[10] + department[15]);
                        med = (department[1] + department[6] + department[11] + department[16]);
                        bus = (department[2] + department[7] + department[12] + department[17]);
                        civ = (department[3] + department[8] + department[13] + department[18]);
                        cre = (department[4] + department[9] + department[14] + department[19]);
                        String neww = Integer.toString(tech);
                        int newww = Integer.parseInt(neww);
                        String neww1 = Integer.toString(med);
                        int newww1 = Integer.parseInt(neww1);
                        String neww2 = Integer.toString(bus);
                        int newww2 = Integer.parseInt(neww2);
                        String neww3= Integer.toString(civ);
                        int newww3 = Integer.parseInt(neww3);
                        String neww4 = Integer.toString(cre);
                        int newww4 = Integer.parseInt(neww4);
                        Intent i = new Intent(quizpage.this, Result.class);
                        i.putExtra("technology",newww);
                        i.putExtra("medicine",newww1);
                        i.putExtra("business",newww2);
                        i.putExtra("civil_services",newww3);
                        i.putExtra("creativity",newww4);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }

                }
            }
        });


    }

        public void updatePoints(){
            department[j] = 4;
            j++;

        }
    public void updatePoints1(){
        department[j] = 3;
        j++;

    }
    public void updatePoints2(){
        department[j] = 2;
        j++;

    }
    public void updatePoints3(){
        department[j] = 1;
        j++;

    }

      public void updateScore(int p){
    if (mScore<20)
          score.setText(mScore+"/20");
      }

        public void updateQuestion() {

            question.setText(mQuestions.getQuestion(mQuestionNumber));
            option1.setText(mQuestions.getChoice1());
            option2.setText(mQuestions.getChoice2());
            option3.setText(mQuestions.getChoice3());
            option4.setText(mQuestions.getChoice4());

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
