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
import android.widget.Toast;

public class LessonHeigthActivity extends AppCompatActivity {

    EditText txtRespuestaLeccion8;
    Button btnCalificarLeccion8;
    String R8a = "ak´wal";
    String R8b = "ak`wal";
    String R8c = "ak'wal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_heigth);

        // llamando a toolbar
        showToolbar("LECCION 8",false);

        txtRespuestaLeccion8 = (EditText)findViewById(R.id.txtLeccion8);
        btnCalificarLeccion8 = (Button)findViewById(R.id.btnCalificarLeccion8);

        btnCalificarLeccion8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoInput = txtRespuestaLeccion8.getText().toString().toLowerCase();

                if(textoInput.equals(R8a) || textoInput.equals(R8b) || textoInput.equals(R8c))
                {
                    //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonHeigthActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien");
                    ventana.setTitle("LECCIÓN 8")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonHeigthActivity.this, LessonNineActivity.class));
                                }
                            });
                    ventana.show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrecto vuelve a intentarlo y aprende",Toast.LENGTH_SHORT).show();
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
}
