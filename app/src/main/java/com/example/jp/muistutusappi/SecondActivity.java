package com.example.jp.muistutusappi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by JP on 11/15/2018.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
    }


}
