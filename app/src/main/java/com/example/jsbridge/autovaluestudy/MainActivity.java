package com.example.jsbridge.autovaluestudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = User.newInstance(11, "asher");

        String json = new Gson().toJson(user);
        Log.d(TAG, "onCreate: " + json);
    }
}
