package com.example.nanark.shared;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by nanark on 11/22/16.
 */


public class MainActivity2 extends AppCompatActivity {

    TextView tv_shared_preference;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv_shared_preference = (TextView) findViewById(R.id.tv_shared_preference);

        //this for retrieve value from shared preferences

        SharedPreferences get_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);

        tv_shared_preference.setText(get_shared_preference.getString("token_authentication", ""));

    }
}