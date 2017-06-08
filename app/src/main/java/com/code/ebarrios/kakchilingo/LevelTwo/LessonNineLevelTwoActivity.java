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

public class LessonNineLevelTwoActivity extends AppCompatActivity {
    EditText txtRespuestaLeccion9;
    Button btnCalificarLeccion9;
    String R9a = "mexico";
    String R9b = "méxico";
    String R9c = "mèxico";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_nine_level_two);

        showToolbar("LECCION 9",false);

        txtRespuestaLeccion9 = (EditText)findViewById(R.id.txtLeccion9);
        btnCalificarLeccion9 = (Button)findViewById(R.id.btnCalificarLeccion9);

        btnCalificarLeccion9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoInput = txtRespuestaLeccion9.getText().toString().toLowerCase().trim();

                if(textoInput.equals(R9a) || textoInput.equals(R9b) || textoInput.equals(R9c))
                {
                    //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder ventana = new AlertDialog.Builder(LessonNineLevelTwoActivity.this);
                    ventana.setMessage("Felicidades traduciste muy bien. México = mexico");
                    ventana.setTitle("LECCIÓN 9")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(LessonNineLevelTwoActivity.this, LessonTenLevelTwoActivity.class));
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
