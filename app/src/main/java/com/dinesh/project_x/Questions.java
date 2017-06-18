package com.dinesh.project_x;




public class Questions {

    public String mQuestions[] = {
//           "Question from technology",
//            "Question from Medicine",
//            "Question from business",
//            "Question from civil_service",
//            "Question from creativity",
//            "Question from technology",
//            "Question from Medicine",
//            "Question from civil_service",
//            "Question from business",
//            "Question from creativity",
//            "Question from technology",
//            "Question from Medicine",
//            "Question from business",
//            "Question from civil_service",
//            "Question from creativity",
//            "Question from technology",
//            "Question from Medicine",
//            "Question from business",
//            "Question from civil_service",
//            "Question from creativity"
            "1st planet in solor system",
            "2st planet in solor system",
            "3st planet in solor system",
            "4st planet in solor system",
            "5st planet in solor system",
            "6st planet in solor system"



    };

    private String mChoice[][] = {
            {"earth","pluto","mars","mercury"},
            {"earth","venus","mars","mercury"},
            {"earth","pluto","mars","mercury"},
            {"earth","pluto","mars","mercury"},
            {"earth","pluto","mars","jupiter"},
            {"earth","saturn","mars","mercury"}

//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"},
//            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"}


    };

    private String mCorrectAnswers[]={"mercury","venus","earth","mars","jupiter","saturn"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoice[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoice[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
