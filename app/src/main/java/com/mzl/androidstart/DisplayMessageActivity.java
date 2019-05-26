package com.mzl.androidstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.mzl.androidstart.DISPLAYMESSAGE";
    private static final String TAG = "Dialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

    }
    public void sendMessage(View view ) {
        // trigger intent activity
        Log.i(TAG," DisplayMessageActivity send message begin !!!!!");
        Intent intent2 = new Intent();
        intent2.setAction("triggerTestIntent");
        intent2.putExtra(EXTRA_MESSAGE, "inner produced message!");
        startActivity(intent2);
        Log.i(TAG," DisplayMessageActivity send message end !!!!!");
    }
}
