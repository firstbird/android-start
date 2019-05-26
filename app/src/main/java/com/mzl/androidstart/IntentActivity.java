package com.mzl.androidstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    private static final String TAG = "Dialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"IntentActivity on create start !!!!!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.intentText);
        textView.setText(message);
    }
}
