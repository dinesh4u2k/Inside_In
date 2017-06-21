package com.dinesh.project_x;


import java.util.Random;

public class Questions {




    public String mQuestions[] = {



            "question form technology1",
            "question form Medical1",
            "question form Business1",
            "question form Civil1",
            "question form Creative1",
            "question form technology2",
            "question form Medical2",
            "question form Business2",
            "question form Civil2",
            "question form Creative2",
            "question form technology3",
            "question form Medical3",
            "question form Business3",
            "question form Civil3",
            "question form Creative3",
            "question form technology4",
            "question form Medical4",
            "question form Business4",
            "question form Civil4",
            "question form Creative4"

















    };

    private String mChoice[][] = {
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"}




    };


    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(){
        String choice0 = mChoice[0][0];
        return choice0;
    }

    public String getChoice2(){
        String choice1 = mChoice[0][1];
        return choice1;
    }
    public String getChoice3(){
        String choice2 = mChoice[0][2];
        return choice2;
    }
    public String getChoice4(){
        String choice3 = mChoice[0][3];
        return choice3;
    }


}
