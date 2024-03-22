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
        db.execSQL("CREATE TABLE questionsGeom (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");





        db.execSQL("CREATE TABLE questionsDeriv (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsDeriv (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsDeriv (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");





        db.execSQL("CREATE TABLE questionsFunc (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsFunc (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsLog (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsLog (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");





        db.execSQL("CREATE TABLE questionsTrig (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsTrig (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");




        db.execSQL("CREATE TABLE questionsVar (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, " +
                "correct_answer INTEGER);");
        db.execSQL("INSERT INTO questionsVar (question, answer1, answer2, answer3, answer4, correct_answer) " +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");
        db.execSQL("INSERT INTO questionsArithm (question, answer1, answer2, answer3, answer4, correct_answer)" +
                "VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

