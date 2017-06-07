package com.code.ebarrios.kakchilingo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LessonSevenActivity extends AppCompatActivity implements View.OnClickListener{
    EditText txtRespuestaLeccion7;
    Button btnCalificarLeccion7;
    String R7 = "yo soy una mujer";

    TextView txtNino, txtHombre, txtMujer, txtSenora, txtMadre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_seven);

        showToolbar("LECCION 7",false);

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
        showToolbar("LECCION 7",false);

        txtRespuestaLeccion7 = (EditText)findViewById(R.id.txtLeccion7);
        btnCalificarLeccion7 = (Button)findViewById(R.id.btnCalificarLeccion7);

        btnCalificarLeccion7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion7 = txtRespuestaLeccion7.getText().toString().toLowerCase();

                if(inputRespuestaLeccion7.equals(R7))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSevenActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 7")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonSevenActivity.this, LessonHeigthActivity.class));
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
                txtRespuestaLeccion7.setText("Yo soy una "+txtNino.getText().toString());
                break;

            case R.id.mujer:
                txtRespuestaLeccion7.setText("Yo soy una "+txtMujer.getText().toString());
                break;

            case R.id.hombre:
                txtRespuestaLeccion7.setText("Yo soy una "+txtHombre.getText().toString());
                break;

            case R.id.senora:
                txtRespuestaLeccion7.setText("Yo soy una "+txtSenora.getText().toString());
                break;

            case R.id.madre:
                txtRespuestaLeccion7.setText("Yo soy una "+txtMadre.getText().toString());
                break;
        }
    }
}
