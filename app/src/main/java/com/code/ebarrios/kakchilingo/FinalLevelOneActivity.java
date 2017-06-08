package com.code.ebarrios.kakchilingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.code.ebarrios.kakchilingo.LevelTwo.MainLevelTwoActivity;

public class FinalLevelOneActivity extends AppCompatActivity {
    Button btnContinuar,btnEmpezarDeNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_level_one);

        btnContinuar = (Button)findViewById(R.id.btnContinuar);
        btnEmpezarDeNuevo = (Button)findViewById(R.id.btnEmpezarDeNuevo);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalLevelOneActivity.this,MainLevelTwoActivity.class));
            }
        });

        btnEmpezarDeNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalLevelOneActivity.this,AprenderActivity.class));
            }
        });
    }
}
