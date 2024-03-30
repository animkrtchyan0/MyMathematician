package com.example.mymathematicianproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quiz_db";
    private static final int DATABASE_VERSION = 1;

    public QuestionDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE quizDeriv (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2(5X-3)-3(2X-1)=9', 'X=9', 'X=2', 'X=4', 'X=3', 4)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 4/X=X', 'X=2', 'X=1', 'X=2 and X=-2', 'X=2 and X=4', 3)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 7(X-3)/(x-1)=2', '41/13', '19/5', '-19/5', '23/7', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('5(A-X)=2-6X, find the A when X=3', '3', '-0.2', '-2', '-6.1', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2X(x-1)=3(X-1)', '1,5', '1', '1 and 3.5', '1 and 1.5', 4)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (3X-5)/(7X+5)=1/4', '5', '-1', '0', '3', 1)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X-2)(X-2)/(|X-2|)=1', '3', '1', '1 and 3', '1 and 2', 3)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: |5-X|=|X-5|', '5', '0', 'No solution', '-5', 2)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X/2)+(X/3)+(X/6)=1', '1', '0', '1/2', '2', 1)");
        db.execSQL("INSERT INTO quizDeriv (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: X/2=2/(X-3)', '1/2 and 8', '2 and 5', '-1 and 4', '-4 and 1', 4)");




        db.execSQL("CREATE TABLE quizFunc (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2(5X-3)-3(2X-1)=9', 'X=9', 'X=2', 'X=4', 'X=3', 4)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 4/X=X', 'X=2', 'X=1', 'X=2 and X=-2', 'X=2 and X=4', 3)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 7(X-3)/(x-1)=2', '41/13', '19/5', '-19/5', '23/7', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('5(A-X)=2-6X, find the A when X=3', '3', '-0.2', '-2', '-6.1', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2X(x-1)=3(X-1)', '1,5', '1', '1 and 3.5', '1 and 1.5', 4)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (3X-5)/(7X+5)=1/4', '5', '-1', '0', '3', 1)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X-2)(X-2)/(|X-2|)=1', '3', '1', '1 and 3', '1 and 2', 3)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: |5-X|=|X-5|', '5', '0', 'No solution', '-5', 2)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X/2)+(X/3)+(X/6)=1', '1', '0', '1/2', '2', 1)");
        db.execSQL("INSERT INTO quizFunc (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: X/2=2/(X-3)', '1/2 and 8', '2 and 5', '-1 and 4', '-4 and 1', 4)");



        db.execSQL("CREATE TABLE quizGeom (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2(5X-3)-3(2X-1)=9', 'X=9', 'X=2', 'X=4', 'X=3', 4)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 4/X=X', 'X=2', 'X=1', 'X=2 and X=-2', 'X=2 and X=4', 3)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 7(X-3)/(x-1)=2', '41/13', '19/5', '-19/5', '23/7', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('5(A-X)=2-6X, find the A when X=3', '3', '-0.2', '-2', '-6.1', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2X(x-1)=3(X-1)', '1,5', '1', '1 and 3.5', '1 and 1.5', 4)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (3X-5)/(7X+5)=1/4', '5', '-1', '0', '3', 1)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X-2)(X-2)/(|X-2|)=1', '3', '1', '1 and 3', '1 and 2', 3)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: |5-X|=|X-5|', '5', '0', 'No solution', '-5', 2)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X/2)+(X/3)+(X/6)=1', '1', '0', '1/2', '2', 1)");
        db.execSQL("INSERT INTO quizGeom (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: X/2=2/(X-3)', '1/2 and 8', '2 and 5', '-1 and 4', '-4 and 1', 4)");


        db.execSQL("CREATE TABLE quizLog (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2(5X-3)-3(2X-1)=9', 'X=9', 'X=2', 'X=4', 'X=3', 4)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 4/X=X', 'X=2', 'X=1', 'X=2 and X=-2', 'X=2 and X=4', 3)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 7(X-3)/(x-1)=2', '41/13', '19/5', '-19/5', '23/7', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('5(A-X)=2-6X, find the A when X=3', '3', '-0.2', '-2', '-6.1', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2X(x-1)=3(X-1)', '1,5', '1', '1 and 3.5', '1 and 1.5', 4)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (3X-5)/(7X+5)=1/4', '5', '-1', '0', '3', 1)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X-2)(X-2)/(|X-2|)=1', '3', '1', '1 and 3', '1 and 2', 3)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: |5-X|=|X-5|', '5', '0', 'No solution', '-5', 2)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X/2)+(X/3)+(X/6)=1', '1', '0', '1/2', '2', 1)");
        db.execSQL("INSERT INTO quizLog (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: X/2=2/(X-3)', '1/2 and 8', '2 and 5', '-1 and 4', '-4 and 1', 4)");





        db.execSQL("CREATE TABLE quizTrig (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find the value: tan(-135)', '1', '-1', '1/2', '0', 1)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find the value: sin(75)*sin(15)', '1', '1/2', '1/4', '0', 3)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Simplify the expression: (sin(2X))/(sin(X))', 'cos(X)', '2cos(X)', 'sin(X)', '2sin(X)', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find the value: 4*sin(105)*cos(105)', '1', '1/2', '0', '-1', 4)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Simplify the expression: (cos(X)-sin(X))/(1-tan(X))', 'cos(X)', 'sin(X)', 'tan(X)', '1-cos(X)', 1)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Simplify the expression: (sinX/1+cosX)+(1+cosX/sinX)', 'sec(X)', '2csc(X)', 'cot(x)', 'tan(2X)', 2)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find the value: (cosX*cosX)/(1-sinX)+sinX', 'sinX', '0', '1', 'cosX', 3)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find false equation.', 'sin(150)+sin(30)=1', 'sin(90)+cos(90)=1', 'sin(33)+cos(57)=1', 'sin(30)+cos(300)=1', 3)");
        db.execSQL("INSERT INTO quizTrig (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Find the value: 4*cos(60)+tan(15)*cot(15)', 'X=-4', 'X=5', 'X=4', 'X=3', 4)");




        db.execSQL("CREATE TABLE quizVar (id INTEGER PRIMARY KEY, question TEXT, answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correct_answer INTEGER);");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2(5X-3)-3(2X-1)=9', 'X=9', 'X=2', 'X=4', 'X=3', 4)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 4/X=X', 'X=2', 'X=1', 'X=2 and X=-2', 'X=2 and X=4', 3)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 7(X-3)/(x-1)=2', '41/13', '19/5', '-19/5', '23/7', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('5(A-X)=2-6X, find the A when X=3', '3', '-0.2', '-2', '-6.1', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: 2X(x-1)=3(X-1)', '1,5', '1', '1 and 3.5', '1 and 1.5', 4)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (3X-5)/(7X+5)=1/4', '5', '-1', '0', '3', 1)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X-2)(X-2)/(|X-2|)=1', '3', '1', '1 and 3', '1 and 2', 3)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: |5-X|=|X-5|', '5', '0', 'No solution', '-5', 2)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: (X/2)+(X/3)+(X/6)=1', '1', '0', '1/2', '2', 1)");
        db.execSQL("INSERT INTO quizVar (question, answer1, answer2, answer3, answer4, correct_answer) VALUES ('Solve the equation: X/2=2/(X-3)', '1/2 and 8', '2 and 5', '-1 and 4', '-4 and 1', 4)");

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

