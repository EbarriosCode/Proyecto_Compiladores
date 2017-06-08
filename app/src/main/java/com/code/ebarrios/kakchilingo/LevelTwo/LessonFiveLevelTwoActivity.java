package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.R;

public class LessonFiveLevelTwoActivity extends AppCompatActivity {

    EditText txtRespuestaLeccion5;
    Button btnCalificarLeccion5;
    String R5a = "eres una niña";
    String R5b = "eres un niño";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five_level_two);
        // llamando a toolbar
        showToolbar("LECCION 5", false);

        txtRespuestaLeccion5 = (EditText) findViewById(R.id.txtLeccion5);
        btnCalificarLeccion5 = (Button) findViewById(R.id.btnCalificarLeccion5);

        btnCalificarLeccion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoInput = txtRespuestaLeccion5.getText().toString().toLowerCase().trim();

                if (textoInput.equals(R5a) || textoInput.equals(R5b)) {
                    //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonFiveLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 5")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonFiveLevelTwoActivity.this, LessonSixLevelTwoActivity.class));
                                }
                            });
                    ventana.show();
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrecto vuelve a intentarlo y aprende", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void showToolbar(String title, boolean btnRegreso) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
    }
}