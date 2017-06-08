package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.R;

public class LessonThreeLevelTwoActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtRespuestaLeccion3;
    Button btnCalificarLeccion3;
    String R3a = "un niño de guatemala";
    String R3b = "una niña de guatemala";

    TextView txtNino, txtUn, txtGuatemala, txtDe, txtMexico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three_level_two);
        //opciones para responder
        txtNino = (TextView)findViewById(R.id.nino);
        txtDe = (TextView)findViewById(R.id.de);
        txtGuatemala = (TextView)findViewById(R.id.guatemala);
        txtUn = (TextView)findViewById(R.id.un);
        txtMexico = (TextView)findViewById(R.id.mexico);

        //habilitando los textviews para ser clickeables
        txtNino.setOnClickListener(this);
        txtDe.setOnClickListener(this);
        txtGuatemala.setOnClickListener(this);
        txtUn.setOnClickListener(this);
        txtMexico.setOnClickListener(this);

        // llamando al toolbar
        showToolbar("LECCION 3",false);

        txtRespuestaLeccion3 = (EditText)findViewById(R.id.txtLeccion3);
        btnCalificarLeccion3 = (Button)findViewById(R.id.btnCalificarLeccion3);

        btnCalificarLeccion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion3 = txtRespuestaLeccion3.getText().toString().toLowerCase().trim();

                if(inputRespuestaLeccion3.equals(R3a) || inputRespuestaLeccion3.equals(R3b))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonThreeLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 3")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonThreeLevelTwoActivity.this, LessonFourLevelTwoActivity.class));
                                }
                            });
                    ventana.show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrecto vuelve a intentarlo",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void showToolbar(String title, boolean btnRegreso)
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
    }

    @Override
    public void onClick(View v) {
        String mantenerValor = txtRespuestaLeccion3.getText().toString();

        switch (v.getId())
        {
            case R.id.nino:
                txtRespuestaLeccion3.setText(mantenerValor+" "+txtNino.getText().toString());
                break;

            case R.id.un:
                txtRespuestaLeccion3.setText(mantenerValor+" "+txtUn.getText().toString());
                break;

            case R.id.guatemala:
                txtRespuestaLeccion3.setText(mantenerValor+" "+txtGuatemala.getText().toString());
                break;

            case R.id.de:
                txtRespuestaLeccion3.setText(mantenerValor+" "+txtDe.getText().toString());
                break;

            case R.id.mexico:
                txtRespuestaLeccion3.setText(mantenerValor+" "+txtMexico.getText().toString());
                break;
        }
    }
}
