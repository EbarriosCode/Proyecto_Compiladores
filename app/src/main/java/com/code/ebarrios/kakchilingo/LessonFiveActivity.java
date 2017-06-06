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

public class LessonFiveActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtRespuestaLeccion5;
    Button btnCalificarLeccion5;
    String R5 = "yo soy un hombre";

    TextView txtNino, txtHombre, txtMujer, txtSenora, txtMadre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);

        //llamada a toolbar
        showToolbar("LECCION 5",false);
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
        showToolbar("LECCION 5",false);

        txtRespuestaLeccion5 = (EditText)findViewById(R.id.txtLeccion5);
        btnCalificarLeccion5 = (Button)findViewById(R.id.btnCalificarLeccion5);

        btnCalificarLeccion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion4 = txtRespuestaLeccion5.getText().toString().toLowerCase();

                if(inputRespuestaLeccion4.equals(R5))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonFiveActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 5")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonFiveActivity.this, LessonSixActivity.class));
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
                txtRespuestaLeccion5.setText("Yo soy un "+txtNino.getText().toString());
                break;

            case R.id.mujer:
                txtRespuestaLeccion5.setText("Yo soy un "+txtMujer.getText().toString());
                break;

            case R.id.hombre:
                txtRespuestaLeccion5.setText("Yo soy un "+txtHombre.getText().toString());
                break;

            case R.id.senora:
                txtRespuestaLeccion5.setText("Yo soy un "+txtSenora.getText().toString());
                break;

            case R.id.madre:
                txtRespuestaLeccion5.setText("Yo soy un "+txtMadre.getText().toString());
                break;
        }
    }
}
