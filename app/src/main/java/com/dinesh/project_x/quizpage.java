package com.dinesh.project_x;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




public class quizpage extends AppCompatActivity {

    Button option1,option2,option3,option4;
    TextView question,technology1,medicine1,business1,civil_services1, creative1;
    private Questions mQuestions = new Questions();

    private int mQuestionNumber= 0;

    boolean doubleTap = false;

    int dep[];
    int i=0;
  /*  int tech =0;
    int med = 0;
    int bus = 0;
    int civ = 0;
    int cre = 0;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);



        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);
        question = (TextView) findViewById(R.id.question);
        technology1 = (TextView) findViewById(R.id.technology1);
        medicine1 = (TextView) findViewById(R.id.medicine1);
        business1 = (TextView) findViewById(R.id.business1);
        civil_services1 = (TextView) findViewById(R.id.civil_services1);
        creative1 = (TextView) findViewById(R.id.creative1);

        updateQuestion();


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dep[i]=4;
                i++;
                updateQuestion();

            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dep[i]=3;
                i++;
                updateQuestion();

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dep[i]=2;
                i++;
                updateQuestion();

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dep[i]=1;
                i++;
                updateQuestion();

            }

        });
       /*technology();
        medecine();
        business();
        civil_services();
        creative();*/
    }

        public void updateQuestion() {
            question.setText(mQuestions.getQuestion(mQuestionNumber));
            option1.setText(mQuestions.getoption1(mQuestionNumber));
            option2.setText(mQuestions.getoption2(mQuestionNumber));
            option3.setText(mQuestions.getoption3(mQuestionNumber));
            option4.setText(mQuestions.getoption4(mQuestionNumber));
            mQuestionNumber++;
        }


    /*public void technology(){
        tech = dep[1] + dep[6] + dep[11] + dep[16];
        technology1.setText(tech);
    }
    public void medecine(){
        med = dep[2] + dep[7] + dep[12] + dep[17];
        medicine1.setText( med);
    }
    public void business(){
        bus = dep[3] + dep[8] + dep[13] + dep[18];
        business1.setText(bus);

    }
    public void civil_services(){
        civ = dep[4] + dep[9] + dep[14] + dep[19];
        civil_services1.setText(civ);
    }
    public void creative(){
        cre = dep[5] + dep[10] + dep[15] + dep[20];
        creative1.setText(cre);
    }*/



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
