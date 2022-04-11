package com.examcreatot.material.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Telha_Thermoacustica extends AppCompatActivity {

    private RadioGroup radioGroup;
    TextInputLayout compr_thermo,qatd_thermo,area_thermo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telha_thermoacustica);

        radioGroup = findViewById(R.id.radioGroup);
        compr_thermo = findViewById(R.id.comp_thermo);
        qatd_thermo = findViewById(R.id.qtd_thermo);
        area_thermo = findViewById(R.id.area_thermo);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedButtonId) {
                switch (checkedButtonId) {
                    case R.id.metodo_linear:
                        compr_thermo.setVisibility(compr_thermo.VISIBLE);
                        qatd_thermo.setVisibility(qatd_thermo.VISIBLE);
                        area_thermo.setVisibility(qatd_thermo.GONE);
                        break;
                    case R.id.metodo_area:
                        area_thermo.setVisibility(qatd_thermo.VISIBLE);
                        compr_thermo.setVisibility(compr_thermo.GONE);
                        qatd_thermo.setVisibility(qatd_thermo.GONE);
                        break;
                }
            }
        });


    }



}