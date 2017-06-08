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


public class LessonSevenLevelTwoActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtJorge,txtYo1,txtHombre,txtMama,txtSoy1,txtBraulio,txtSoy2,txtYo2,txtNo;
    Button btnCalificarLeccion7;
    EditText txtRespuestaLeccion7;
    String R7 = "yo soy jorge yo no soy braulio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_seven_level_two);

        txtJorge = (TextView)findViewById(R.id.jorge);
        txtYo1 = (TextView)findViewById(R.id.yo1);
        txtYo2 =(TextView)findViewById(R.id.yo2);
        txtHombre = (TextView)findViewById(R.id.hombre);
        txtMama = (TextView)findViewById(R.id.mama);
        txtSoy1 = (TextView)findViewById(R.id.soy);
        txtSoy2 = (TextView)findViewById(R.id.soy2);
        txtBraulio = (TextView)findViewById(R.id.braulio);
        txtNo = (TextView)findViewById(R.id.no);

        // listener a textViews
        txtJorge.setOnClickListener(this);
        txtYo1.setOnClickListener(this);
        txtYo2.setOnClickListener(this);
        txtHombre.setOnClickListener(this);
        txtMama.setOnClickListener(this);
        txtSoy2.setOnClickListener(this);
        txtSoy1.setOnClickListener(this);
        txtBraulio.setOnClickListener(this);
        txtNo.setOnClickListener(this);

        // llamando al toolbar
        showToolbar("LECCION 7",false);

        txtRespuestaLeccion7 = (EditText)findViewById(R.id.txtLeccion7);
        btnCalificarLeccion7 = (Button)findViewById(R.id.btnCalificarLeccion7);

        btnCalificarLeccion7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputRespuestaLeccion7 = txtRespuestaLeccion7.getText().toString().toLowerCase().trim();

                if(inputRespuestaLeccion7.equals(R7))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSevenLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien la oración significa 'Yo soy jorge, yo no soy Braulio'");
                    ventana.setTitle("LECCIÓN 7")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonSevenLevelTwoActivity.this, LessonHeightLevelTwoActivity.class));
                                }
                            });
                    ventana.show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrecto vuelve a intentarlo",Toast.LENGTH_SHORT).show();
                    txtRespuestaLeccion7.setText("");

                    txtJorge.setText("Jorge");
                    txtHombre.setText("hombre");
                    txtYo1.setText("Yo");
                    txtYo2.setText("yo");
                    txtMama.setText("mamá");
                    txtSoy1.setText("soy");
                    txtSoy2.setText("soy");
                    txtBraulio.setText("Braulio");
                    txtNo.setText("no");
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
        String valorAnterior = txtRespuestaLeccion7.getText().toString();
        switch (v.getId())
        {
            case R.id.jorge:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtJorge.getText().toString());
                txtJorge.setText("");
                break;

            case R.id.yo1:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtYo1.getText().toString());
                txtYo1.setText("");
                break;

            case R.id.yo2:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtYo2.getText().toString());
                txtYo2.setText("");
                break;

            case R.id.soy:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtSoy1.getText().toString());
                txtSoy1.setText("");
                break;

            case R.id.soy2:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtSoy2.getText().toString());
                txtSoy2.setText("");
                break;

            case R.id.hombre:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtHombre.getText().toString());
                txtHombre.setText("");
                break;

            case R.id.braulio:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtBraulio.getText().toString());
                txtBraulio.setText("");
                break;

            case R.id.mama:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtMama.getText().toString());
                txtMama.setText("");
                break;

            case R.id.no:
                txtRespuestaLeccion7.setText(valorAnterior+" "+txtNo.getText().toString());
                txtNo.setText("");
                break;
        }
    }
}
