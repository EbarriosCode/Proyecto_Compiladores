package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.R;

public class LessonSixLevelTwoActivity extends AppCompatActivity {
    RadioGroup grupo;
    Button btnCalificarLeccion6;
    Boolean respuesta = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_six_level_two);

        showToolbar("LECCION 6",false);

        grupo = (RadioGroup)findViewById(R.id.grupo);
        btnCalificarLeccion6 = (Button)findViewById(R.id.btnCalificarLeccion6);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId)
                {
                    case R.id.radioButton:
                        //Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
                        respuesta = false;
                        break;

                    case R.id.radioButton2:
                        respuesta = true;
                        break;
                }
            }
        });

        btnCalificarLeccion6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuesta){
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSixLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien la oración significa Eres un hombre?");
                    ventana.setTitle("LECCIÓN 6")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonSixLevelTwoActivity.this, LessonSevenLevelTwoActivity.class));
                                }
                            });
                    ventana.show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrecto intenta de nuevo y aprende",Toast.LENGTH_SHORT).show();
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
