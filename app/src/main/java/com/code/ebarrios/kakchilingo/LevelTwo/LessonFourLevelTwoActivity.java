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
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.R;

public class LessonFourLevelTwoActivity extends AppCompatActivity {

    EditText txtRespuestaLeccion4;
    Button btnCalificarLeccion4;
    String R4a = "yo no soy de mexico";
    String R4b = "yo no soy de méxico";
    String R4c = "yo no soy de mèxico";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four_level_two);

        // llamando a toolbar
        showToolbar("LECCION 4", false);

        txtRespuestaLeccion4 = (EditText) findViewById(R.id.txtLeccion4);
        btnCalificarLeccion4 = (Button) findViewById(R.id.btnCalificarLeccion4);

        btnCalificarLeccion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoInput = txtRespuestaLeccion4.getText().toString().toLowerCase().trim();

                if (textoInput.equals(R4a) || textoInput.equals(R4b) || textoInput.equals(R4c)) {
                    //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonFourLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 4")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonFourLevelTwoActivity.this, LessonFiveLevelTwoActivity.class));
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