package com.example.jp.muistutusappi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
    }


}
