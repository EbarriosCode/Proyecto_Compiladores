package com.code.ebarrios.kakchilingo;

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

public class LessonFourActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtRespuestaLeccion4;
    Button btnCalificarLeccion4;
    String R4 = "un niño";

    TextView txtNino, txtHombre, txtMujer, txtSenora, txtMadre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four);

        //opciones para responder
        txtNino = (TextView)findViewById(R.id.nino);
        txtMujer = (TextView)findViewById(R.id.mujer);
        txtHombre = (TextView)findViewById(R.id.hombre);
        txtSenora = (TextView)findViewById(R.id.senora);
        txtMadre = (TextView)findViewById(R.id.madre);

        //habilitando los textviews para ser clickeables
        txtNino.setOnClickListener(this);
        txtMujer.setOnClickListener(this);
        txtHombre.setOnClickListener(this);
        txtSenora.setOnClickListener(this);
        txtMadre.setOnClickListener(this);

        // llamando al toolbar
        showToolbar("LECCION 4",false);

        txtRespuestaLeccion4 = (EditText)findViewById(R.id.txtLeccion4);
        btnCalificarLeccion4 = (Button)findViewById(R.id.btnCalificarLeccion4);

        btnCalificarLeccion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion4 = txtRespuestaLeccion4.getText().toString().toLowerCase();

                if(inputRespuestaLeccion4.equals(R4))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonFourActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 4")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonFourActivity.this, LessonFiveActivity.class));
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
        switch (v.getId())
        {
            case R.id.nino:
                txtRespuestaLeccion4.setText("Un "+txtNino.getText().toString());
                break;

            case R.id.mujer:
                txtRespuestaLeccion4.setText("Un "+txtMujer.getText().toString());
                break;

            case R.id.hombre:
                txtRespuestaLeccion4.setText("Un "+txtHombre.getText().toString());
                break;

            case R.id.senora:
                txtRespuestaLeccion4.setText("Un "+txtSenora.getText().toString());
                break;

            case R.id.madre:
                txtRespuestaLeccion4.setText("Un "+txtMadre.getText().toString());
                break;
        }
    }
}
