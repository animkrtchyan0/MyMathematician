package com.example.mymathematicianproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quiz.db";
    private static final int DATABASE_VERSION = 1;

    public QuestionDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create question table
        db.execSQL("CREATE TABLE questionsArithm1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsArithm1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsArithm2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsArithm2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsComplex1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsComplex1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsComplex2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsComplex2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsDeriv1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsDeriv1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsDeriv2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsDeriv2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsFunc1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsFunc1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsFunc2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsFunc2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsLog1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsLog1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsLog2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsLog2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsReal1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsReal1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsReal2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsReal2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsTrig1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsTrig1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsTrig2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsTrig2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsVar1 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsVar1 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

        db.execSQL("CREATE TABLE questionsVar2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsVar2 (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // handle database upgrades if needed
    }
}

