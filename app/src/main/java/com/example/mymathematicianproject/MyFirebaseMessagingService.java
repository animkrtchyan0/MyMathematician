package com.example.mymathematicianproject;

import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;

import android.content.Intent;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @SuppressLint("MissingPermission")
    @Override
   public void onMessageReceived(@NonNull RemoteMessage remoteMessage){
        String category =DataHolder.category;
        String question = DataHolder.question;
        String answer1 = DataHolder.answer1;
        String answer2 = DataHolder.answer2;
        String answer3 = DataHolder.answer3;
        String answer4 = DataHolder.answer4;
        int correctNum = DataHolder.correctNum;
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, "channel_id")
                .setContentTitle("New Request")
                .setContentText(category + "," + question + "," + answer1 + ","+ answer2 + ","+ answer3 + ","+ answer4 + ","+ correctNum)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        Intent acceptIntent = new Intent(this,AcceptActionReceiver.class);
        PendingIntent acceptPendingIntent = PendingIntent.getBroadcast(this, 0,acceptIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        Intent rejectIntent = new Intent(this,RejectActionReceiver.class);
        PendingIntent rejectPendingIntent = PendingIntent.getBroadcast(this, 0,rejectIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        notificationBuilder.addAction(R.drawable.ic_accept, "Accept", acceptPendingIntent);
        notificationBuilder.addAction(R.drawable.ic_reject, "Accept", rejectPendingIntent);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(1,notificationBuilder.build());
   }


    @Override
    public void onNewToken(@NonNull String token){
        super.onNewToken(token);

        SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();

        editor.putString("admin_token", token);
        editor.apply();
    }
}
