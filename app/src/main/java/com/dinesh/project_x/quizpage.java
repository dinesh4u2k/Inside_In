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
    private int mQuestionsLength = mQuestions.mQuestions.length;


    boolean doubleTap = false;
    public int[] department = new int[30];
    private int i=0;
    private int m=0;





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
                if(option1.getText()=="Very Intrested"){
//                    mScore = mScore+1;
//                    updateScore(mScore);
                    updatePoints();
                    mScore = mScore + department[m];
                    m++;
                    updateScore(mScore);

                                if (mQuestionNumber == 19) {
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("FINAL", mScore);
                                    i.putExtras(bundle);
                                    quizpage.this.finish();
                                    startActivity(i);

                                } else {
                                    updateQuestion();
                                }
                            } else {
                                if (mQuestionNumber == 19) {
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("FINAL", mScore);
                                    i.putExtras(bundle);
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
//                    mScore = mScore+1;
//                    updateScore(mScore);
                                updatePoints1();
                                mScore = mScore + department[m];
                                m++;
                                updateScore(mScore);
                                if (mQuestionNumber == 19) {
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("FINAL", mScore);
                                    i.putExtras(bundle);
                                    quizpage.this.finish();
                                    startActivity(i);

                                } else {
                                    updateQuestion();
                                }
                            } else {
                                if (mQuestionNumber == 19) {
                                    Intent i = new Intent(quizpage.this, Result.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("FINAL", mScore);
                                    i.putExtras(bundle);
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
//                    mScore = mScore+1;
//                    updateScore(mScore);
                    updatePoints2();
                    mScore = mScore + department[m];
                    m++;
                    updateScore(mScore);

                    if (mQuestionNumber == 19) {
                        Intent i = new Intent(quizpage.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FINAL", mScore);
                        i.putExtras(bundle);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == 19) {
                        Intent i = new Intent(quizpage.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FINAL", mScore);
                        i.putExtras(bundle);
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
//                    mScore = mScore+1;
//                    updateScore(mScore);
                    updatePoints3();
                    mScore = mScore + department[m];
                    m++;
                    updateScore(mScore);
                    if (mQuestionNumber == 19) {
                        Intent i = new Intent(quizpage.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FINAL", mScore);
                        i.putExtras(bundle);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }
                } else {
                    if (mQuestionNumber == 19) {
                        Intent i = new Intent(quizpage.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("FINAL", mScore);
                        i.putExtras(bundle);
                        quizpage.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();
                    }

                }
            }
        });


    }

        private void updatePoints(){
            department[i] = 4;
            i++;

        }
    private void updatePoints1(){
        department[i] = 3;
        i++;

    }
    private void updatePoints2(){
        department[i] = 2;
        i++;

    }
    private void updatePoints3(){
        department[i] = 1;
        i++;

    }

      private void updateScore(int p){

          score.setText(""+mScore);
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
