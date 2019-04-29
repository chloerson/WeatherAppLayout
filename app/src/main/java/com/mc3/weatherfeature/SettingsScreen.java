package com.mc3.weatherfeature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);
    }

    public void goBackButton(View view){
        Intent backButton = new Intent(this, MainActivity.class);
        startActivity(backButton);

    }
}
