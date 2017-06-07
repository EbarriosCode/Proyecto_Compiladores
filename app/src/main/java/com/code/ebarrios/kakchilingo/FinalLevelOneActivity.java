package com.code.ebarrios.kakchilingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FinalLevelOneActivity extends AppCompatActivity {
    Button btnFinalLevelOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_level_one);

        btnFinalLevelOne = (Button)findViewById(R.id.btnFinalLevelOne);

        btnFinalLevelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalLevelOneActivity.this,MainActivity.class));
            }
        });
    }
}
