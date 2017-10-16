package com.rosinante24.firebasechatapp;

import android.location.OnNmeaMessageListener;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Rosinante24 on 08/10/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFMService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "FCM Message ID : " + remoteMessage.getMessageId());
        Log.d(TAG, "FCM Notification Message : " + remoteMessage.getNotification());
        Log.d(TAG, "FCM Data Message : " + remoteMessage.getData());
    }
}
