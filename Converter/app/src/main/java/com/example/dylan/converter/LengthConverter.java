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

        final Switch toggle = findViewById(R.id.convertSwitch);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                TextView inputUnit =  findViewById(R.id.inputUnit);
                TextView solutionUnit =  findViewById(R.id.solutionUnit);
                TextView solutionText = findViewById(R.id.solution);
                if (isChecked) {
                    // The toggle is enabled
                    toggle.setText("Inches");
                    inputUnit.setText("in");
                    solutionUnit.setText("cm");
                    solutionText.setText("");
                } else {
                    // The toggle is disabled
                    toggle.setText("Centimeters");
                    inputUnit.setText("cm");
                    solutionUnit.setText("in");
                    solutionText.setText("");
                }
            }
        });
    }


    public void onConvertButton(View view) {

        Switch unitToggle = findViewById(R.id.convertSwitch);
        boolean convertCentimeters = unitToggle.isChecked();
        TextView inputText = findViewById(R.id.inputText);
        TextView result = findViewById(R.id.results);
        TextView solutionText = findViewById(R.id.solution);
        TextView solutionUnit =  findViewById(R.id.solutionUnit);
        Double input = Double.parseDouble(inputText.getText().toString());
        Double solution = 0.0;
        if(convertCentimeters) //How you convert centimeters to inches
        {
            solution = Math.floor(input * 2.54 * 100) / 100;
        }
        else { //How you convert inches to centimeters
            solution = Math.floor(input * 0.3937 * 100) / 100;
        }
        result.setVisibility(View.VISIBLE);
        solutionUnit.setVisibility(View.VISIBLE);
        solutionText.setText(Double.toString(solution));


    }

}
