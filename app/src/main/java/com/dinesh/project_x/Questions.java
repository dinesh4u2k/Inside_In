package com.dinesh.project_x;


import java.util.Random;

public class Questions {



//    private String mTechnology[] = {
//            "question form tech1",
//            "question form tech2",
//            "question form tech3",
//            "question form tech4"
//
//    };
//    private String mMedicine[] = {
//            "question form med1",
//            "question form med2",
//            "question form med3",
//            "question form med4"
//
//    };
//    private String mBusiness[] = {
//            "question form Bus1",
//            "question form Bus2",
//            "question form Bus3",
//            "question form Bus4"
//
//    };
//    private String mCivil_Services[] = {
//            "question form civ1",
//            "question form civ2",
//            "question form civ3",
//            "question form civ4"
//
//    };
//    private String mCreativity[] = {
//            "question form cre1",
//            "question form cre2",
//            "question form cre3",
//            "question form cre4"
//
//    };

//    private int mTechnologyLength = mTechnology.length;
//    private int mMedicineLength = mMedicine.length;
//    private int mBusinessLength = mBusiness.length;
//    private int mCivil_ServicesLength = mCivil_Services.length;
//    private int mCreativeLength = mCreativity.length;
//
//
//    Random r= new Random();


    public String mQuestions[] = {
//           mTechnology[0],
//            mMedicine[0],
//            mBusiness[0],
//            mCivil_Services[0],
//            mCreativity[0],
//            mTechnology[1],
//            mMedicine[1],
//            mBusiness[1],
//            mCivil_Services[1],
//            mCreativity[1],
//            mTechnology[2],
//            mMedicine[2],
//            mBusiness[2],
//            mCivil_Services[2],
//            mCreativity[2],
//            mTechnology[3],
//            mMedicine[3],
//            mBusiness[3],
//            mCivil_Services[3],
//            mCreativity[3],
//            mTechnology[4],
//            mMedicine[4],
//            mBusiness[4],
//            mCivil_Services[4],
//            mCreativity[4]


            "question form tech1",
            "question form tech2",
            "question form tech3",
            "question form tech4",
            "question form med1",
            "question form med2",
            "question form med3",
            "question form med4",
            "question form Bus1",
            "question form Bus2",
            "question form Bus3",
            "question form Bus4",
            "question form civ1",
            "question form civ2",
            "question form civ3",
            "question form civ4",
            "question form cre1",
            "question form cre2",
            "question form cre3",
            "question form cre4"




    };

    private String mChoice[][] = {
            {"Very Intrested","Intrested","Slightly Intrested","Not Intrested"}


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

//    private String mCorrectAnswers[]={"mercury","venus","earth","mars","jupiter","saturn"};

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

//    public String getCorrectAnswer(int a){
//        String answer = mCorrectAnswers[a];
//        return answer;
//    }
}
