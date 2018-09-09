package com.example.dylan.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class LengthConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);
        /*
        final Switch toggle = findViewById(R.id.convertSwitch);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                TextView inputUnit =  findViewById(R.id.inputUnit);
                TextView solutionUnit =  findViewById(R.id.solutionUnit);

                if (isChecked) {
                    // The toggle is enabled
                    toggle.setText("Farenheit");
                    inputUnit.setText("°F");
                    solutionUnit.setText("°C");
                } else {
                    // The toggle is disabled
                    toggle.setText("Celsius");
                    inputUnit.setText("°C");
                   solutionUnit.setText("°F");
                }
            }
        }); */
    }

    /*
    public void onConvertButton(View view) {

        Switch unitToggle = findViewById(R.id.convertSwitch);
        boolean convertCelsius = unitToggle.isChecked();
        TextView inputText = findViewById(R.id.inputText);
        TextView result = findViewById(R.id.results);
        TextView solutionText = findViewById(R.id.solution);
        TextView solutionUnit =  findViewById(R.id.solutionUnit);
        Double input = Double.parseDouble(inputText.getText().toString());
        Double solution = 0.0;
        if(convertCelsius)
        {
            solution = (input - 32.0) * (5/9);
        }
        else
        {
            solution = (input * (9/5)) + 32;
        }
        result.setVisibility(View.VISIBLE);
        solutionUnit.setVisibility(View.VISIBLE);
        solutionText.setText(Double.toString(solution));


    }
    */
}
