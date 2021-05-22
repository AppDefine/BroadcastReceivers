package com.androidlover.broadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastreceivers(View view) {
        Intent intent = new Intent();
        intent.setAction("com.broadcast.receiver.example");
        intent.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(intent);
    }
}