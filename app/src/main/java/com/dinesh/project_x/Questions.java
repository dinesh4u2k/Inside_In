package com.dinesh.project_x;




public class Questions {

    public String mQuestions[] = {
           "Question from technology",
            "Question from Medicine",
            "Question from business",
            "Question from civil_service",
            "Question from creativity",
            "Question from technology",
            "Question from Medicine",
            "Question from civil_service",
            "Question from business",
            "Question from creativity",
            "Question from technology",
            "Question from Medicine",
            "Question from business",
            "Question from civil_service",
            "Question from creativity",
            "Question from technology",
            "Question from Medicine",
            "Question from business",
            "Question from civil_service",
            "Question from creativity"


    };

    private String mChoice[][] = {
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"}

    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getoption1(int a){
        String choice = mChoice[a][0];
        return choice;
    }

    public String getoption2(int a){
        String choice = mChoice[a][1];
        return choice;
    }
    public String getoption3(int a){
        String choice = mChoice[a][2];
        return choice;
    }
    public String getoption4(int a){
        String choice = mChoice[a][3];
        return choice;
    }
}
