package com.rosinante24.firebasechatapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by Rosinante24 on 08/10/17.
 */


public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";
    private static final String FRIENDLY_ENGAGE_TOPICS = "friendly_engage";

    @Override
    public void onTokenRefresh() {

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "FCM Token : " + token);

        FirebaseMessaging.getInstance().subscribeToTopic(FRIENDLY_ENGAGE_TOPICS);
    }
}