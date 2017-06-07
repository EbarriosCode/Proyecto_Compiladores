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

public class LessonTenActivity extends AppCompatActivity implements View.OnClickListener{
    EditText txtRespuestaLeccion10;
    Button btnCalificarLeccion10;
    String R10 = "un hombre una mujer";

    TextView txtUn, txtHombre, txtMujer, txtSenora, txtUna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_ten);

        //opciones para responder
        txtUn = (TextView)findViewById(R.id.un);
        txtMujer = (TextView)findViewById(R.id.mujer);
        txtHombre = (TextView)findViewById(R.id.hombre);
        txtSenora = (TextView)findViewById(R.id.senora);
        txtUna = (TextView)findViewById(R.id.una);

        //habilitando los textviews para ser clickeables
        txtUn.setOnClickListener(this);
        txtMujer.setOnClickListener(this);
        txtHombre.setOnClickListener(this);
        txtSenora.setOnClickListener(this);
        txtUna.setOnClickListener(this);

        // llamando al toolbar
        showToolbar("LECCION 4",false);

        txtRespuestaLeccion10 = (EditText)findViewById(R.id.txtLeccion10);
        btnCalificarLeccion10 = (Button)findViewById(R.id.btnCalificarLeccion10);

        btnCalificarLeccion10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion10 = txtRespuestaLeccion10.getText().toString().toLowerCase().trim();

                if(inputRespuestaLeccion10.equals(R10))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonTenActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 10")
                            .setPositiveButton("TERMINAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonTenActivity.this, FinalLevelOneActivity.class));
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
        // recoger lo que ya hay dentro del input
        String valorAnterior = txtRespuestaLeccion10.getText().toString();

        switch (v.getId())
        {
            case R.id.un:
                txtRespuestaLeccion10.setText(valorAnterior+" "+txtUn.getText().toString());
                break;

            case R.id.mujer:
                txtRespuestaLeccion10.setText(valorAnterior+" "+txtMujer.getText().toString());
                break;

            case R.id.hombre:
                txtRespuestaLeccion10.setText(valorAnterior+" "+txtHombre.getText().toString());
                break;

            case R.id.senora:
                txtRespuestaLeccion10.setText(valorAnterior+" "+txtSenora.getText().toString());
                break;

            case R.id.una:
                txtRespuestaLeccion10.setText(valorAnterior+" "+txtUna.getText().toString());
                break;
        }
    }
}
