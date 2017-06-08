package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.code.ebarrios.kakchilingo.AprenderActivity;
import com.code.ebarrios.kakchilingo.R;

public class FinalLevelTwoActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtNombreRecibido;
    Button btnEmpezarDeNuevo, btnTerminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_level_two);

        txtNombreRecibido = (TextView)findViewById(R.id.txtNombreParticipante);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null)
        {
            String nombreRecibido = bundle.get(":nombre").toString();
            txtNombreRecibido.setText(nombreRecibido);
        }

        // mapeo de los botones con el xml
        btnEmpezarDeNuevo = (Button)findViewById(R.id.btnEmpezarDeNuevo);
        btnTerminar = (Button)findViewById(R.id.btnTerminar);

        btnEmpezarDeNuevo.setOnClickListener(this);
        btnTerminar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnEmpezarDeNuevo:
                startActivity(new Intent(FinalLevelTwoActivity.this,MainLevelTwoActivity.class));
                break;

            case R.id.btnTerminar:
                startActivity(new Intent(FinalLevelTwoActivity.this, AprenderActivity.class));
                break;
        }
    }
}
