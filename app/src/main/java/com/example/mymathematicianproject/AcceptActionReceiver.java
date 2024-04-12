package com.example.mymathematicianproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

public class AcceptActionReceiver extends BroadcastReceiver {
    private QuestionDbHelper dbHelper;

    @Override
    public void onReceive(Context context, Intent intent) {
        String category =DataHolder.category;
        String question = DataHolder.question;
        String answer1 = DataHolder.answer1;
        String answer2 = DataHolder.answer2;
        String answer3 = DataHolder.answer3;
        String answer4 = DataHolder.answer4;
        int correctNum = DataHolder.correctNum;
        String correct_answer = String.valueOf(correctNum);

        SQLiteDatabase database = dbHelper.getWritableDatabase();
        switch (category){
            case "Deriv":
                String query1 = "INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query1);
                database.close();
                break;
            case "Func":
                String query2 = "INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query2);
                database.close();
                break;
            case "Geom":
                String query3 = "INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query3);
                database.close();
                break;
            case "Log":
                String query4 = "INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query4);
                database.close();
                break;
            case "Trig":
                String query5 = "INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query5);
                database.close();
                break;
            case "Var":
                String query6 = "INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('" + question + "','" + answer1 + "','" + answer2 + "','" + answer3 + "','" + answer4 + "','" + correct_answer + "')";
                database.execSQL(query6);
                database.close();
                break;
        }

    }
}
