package com.example.mymathematicianproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quiz_database";
    private static final int DATABASE_VERSION = 1;

    public QuestionDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE quizDeriv (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");





        db.execSQL("CREATE TABLE quizFunc (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");



        db.execSQL("CREATE TABLE quizGeom (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");


        db.execSQL("CREATE TABLE quizLog (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");





        db.execSQL("CREATE TABLE quizTrig (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");




        db.execSQL("CREATE TABLE quizVar (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('What is the capital of France?', 'Rome', 'Paris', 'Madrid', 'Berlin', 2)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS quizGeom");
        db.execSQL("DROP TABLE IF EXISTS quizDeriv");
        db.execSQL("DROP TABLE IF EXISTS quizFunc");
        db.execSQL("DROP TABLE IF EXISTS quizLog");
        db.execSQL("DROP TABLE IF EXISTS quizTrig");
        db.execSQL("DROP TABLE IF EXISTS quizVar");
        onCreate(db);
    }
}

