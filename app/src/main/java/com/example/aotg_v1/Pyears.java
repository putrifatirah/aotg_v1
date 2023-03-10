package com.example.aotg_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pyears extends AppCompatActivity {

    private Button move_pyears2pyearsspmrsm;
    private Button move_pyears2pyearsspm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyears);

        //from Pyears to PyearsSPMRSM
        move_pyears2pyearsspmrsm = findViewById(R.id.BtnSPMRSM);
        move_pyears2pyearsspmrsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pyears.this, Pyears_spmrsm.class);
                startActivity(intent);
            }
        });

        //from Pyears to PyearsSPM
        move_pyears2pyearsspm = findViewById(R.id.BtnSPM);
        move_pyears2pyearsspm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pyears.this, Pyears_spm.class);
                startActivity(intent);
            }
        });
    }
}