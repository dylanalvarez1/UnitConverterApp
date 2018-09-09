package com.example.dylan.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class TemperatureConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);
        final Switch toggle = findViewById(R.id.convertSwitch);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                TextView inputUnit =  findViewById(R.id.inputUnit);
                TextView solutionUnit =  findViewById(R.id.solutionUnit);
                TextView solutionText = findViewById(R.id.solution);
                if (isChecked) {
                    // The toggle is enabled
                    toggle.setText("Celsius");
                    inputUnit.setText("°C");
                    solutionUnit.setText("°F");
                    solutionText.setText("");
                } else {
                    // The toggle is disabled
                    toggle.setText("Farenheit");
                    inputUnit.setText("°F");
                    solutionUnit.setText("°C");
                    solutionText.setText("");
                }
            }
        });
    }
    public void onConvertButton(View view) {

        Switch unitToggle = findViewById(R.id.convertSwitch);
        boolean convertCelsius = unitToggle.isChecked();
        TextView inputText = findViewById(R.id.inputText);
        TextView result = findViewById(R.id.results);
        TextView solutionText = findViewById(R.id.solution);
        TextView solutionUnit =  findViewById(R.id.solutionUnit);
        Double input = Double.parseDouble(inputText.getText().toString());
        Double solution = 0.0;
        if(convertCelsius) //
        {


            solution = Math.floor(((input * (9/5.0) + 32.0) * 10)) / 10;
        }
        else
        {

            solution = Math.floor(((input - 32.0) * (5/9.0) * 10)) / 10;
        }
        result.setVisibility(View.VISIBLE);
        solutionUnit.setVisibility(View.VISIBLE);
        solutionText.setText(Double.toString(solution));


    }
}
