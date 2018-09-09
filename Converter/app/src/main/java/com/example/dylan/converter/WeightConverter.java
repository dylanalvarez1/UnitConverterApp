package com.example.dylan.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class WeightConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_converter);

        final Switch toggle = findViewById(R.id.convertSwitch);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                TextView inputUnit =  findViewById(R.id.inputUnit);
                TextView solutionUnit =  findViewById(R.id.solutionUnit);
                TextView solutionText = findViewById(R.id.solution);
                if (isChecked) {
                    // The toggle is enabled
                    toggle.setText("Pounds");
                    inputUnit.setText("lbs");
                    solutionUnit.setText("kg");
                    solutionText.setText("");
                } else {
                    // The toggle is disabled
                    toggle.setText("Kilograms");
                    inputUnit.setText("kg");
                    solutionUnit.setText("lbs");
                    solutionText.setText("");
                }
            }
        });
    }
    public void onConvertButton(View view) {

        Switch unitToggle = findViewById(R.id.convertSwitch);
        boolean convertKilograms = unitToggle.isChecked();
        TextView inputText = findViewById(R.id.inputText);
        TextView result = findViewById(R.id.results);
        TextView solutionText = findViewById(R.id.solution);
        TextView solutionUnit =  findViewById(R.id.solutionUnit);
        Double input = Double.parseDouble(inputText.getText().toString());
        Double solution = 0.0;
        if(convertKilograms) //How you convert pounds to kilograms
        {
            solution = Math.floor(input * 0.45359237 * 10) / 10;
        }
        else { //How you convert kilograms to pounds
            solution = Math.floor(input * 2.20462262185 * 10) / 10;
        }
        result.setVisibility(View.VISIBLE);
        solutionUnit.setVisibility(View.VISIBLE);
        solutionText.setText(Double.toString(solution));


    }
}
