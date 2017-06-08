package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.R;

public class LessonTenLevelTwoActivity extends AppCompatActivity {
    EditText txtNombre;
    Button btnTerminarNivel0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_ten_level_two);

        txtNombre = (EditText)findViewById(R.id.txtLeccion10);
        btnTerminarNivel0 = (Button)findViewById(R.id.btnCalificarLeccion10);

        btnTerminarNivel0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString().trim();

                if(nombre.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Debes ingresar tu nombre",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(LessonTenLevelTwoActivity.this,FinalLevelTwoActivity.class);
                    intent.putExtra(":nombre",nombre);
                    startActivity(intent);
                }

            }
        });
    }
}
