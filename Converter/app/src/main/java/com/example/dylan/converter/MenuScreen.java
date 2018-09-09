package com.example.dylan.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }
    public void onLengthClicked(View view) {
        Intent i = new Intent(getBaseContext(), LengthConverter.class);
        startActivity(i);
    }
    public void onWeightClicked(View view) {
        Intent i = new Intent(getBaseContext(), WeightConverter.class);
        startActivity(i);
    }
    public void onTemperatureClicked(View view) {
        Intent i = new Intent(getBaseContext(), TemperatureConverter.class);
        startActivity(i);
    }
}
