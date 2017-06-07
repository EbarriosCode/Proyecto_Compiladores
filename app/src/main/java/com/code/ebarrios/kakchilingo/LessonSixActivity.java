package com.code.ebarrios.kakchilingo;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LessonSixActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMujer,btnMujerTraduccion;
    Button btnHombre,btnHombreTraduccion;
    Button btnNino, btnNinoTraduccion;
    Button btnCalificarLeccionSix;

    TextView txtOne,txtTwo,txtThree,txtFour,txtFive,txtSix;

    // Respuestas
        String mujer = "mujer";
        String mujerTraduccion = "ixöq";
        String hombre = "hombre";
        String hombreTraduccion = "achi";
        String nino = "niño";
        String ninoTraduccion = "ak´wal";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_six);

        //llamando a toolbar
        showToolbar("LECCION 6",false);

        // mapeando los textView para las respuestas traidas de los botones
        txtOne = (TextView)findViewById(R.id.uno);
        txtTwo = (TextView)findViewById(R.id.dos);
        txtThree = (TextView)findViewById(R.id.tres);
        txtFour = (TextView)findViewById(R.id.cuatro);
        txtFive = (TextView)findViewById(R.id.cinco);
        txtSix = (TextView)findViewById(R.id.seis);


        // mapeando todos los botones de las respuestas
        btnMujer = (Button)findViewById(R.id.btnMujer);
        btnMujerTraduccion = (Button)findViewById(R.id.btnMujerTraduccion);
        btnHombre = (Button)findViewById(R.id.btnHombre);
        btnHombreTraduccion = (Button)findViewById(R.id.btnHombreTraduccion);
        btnNino = (Button)findViewById(R.id.btnNino);
        btnNinoTraduccion = (Button)findViewById(R.id.btnNinoTraduccion);

        //boton de calificar
        btnCalificarLeccionSix = (Button)findViewById(R.id.btnCalificarLeccion6);

        // habilitando los botones para escuchar el evento click
        btnMujer.setOnClickListener(this);
        btnMujerTraduccion.setOnClickListener(this);
        btnHombreTraduccion.setOnClickListener(this);
        btnHombre.setOnClickListener(this);
        btnNinoTraduccion.setOnClickListener(this);
        btnNino.setOnClickListener(this);
        btnCalificarLeccionSix.setOnClickListener(this);
    }

    public void showToolbar(String title, boolean btnRegreso)
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
    }

    public void validarResultado()
    {
        // valores string despues de haber presionado los botones
        String lblUno = txtOne.getText().toString().toLowerCase();
        String lblDos = txtTwo.getText().toString().toLowerCase();
        String lblTres = txtThree.getText().toString().toLowerCase();
        String lblCuatro = txtFour.getText().toString().toLowerCase();
        String lblCinco = txtFive.getText().toString().toLowerCase();
        String lblSeis = txtSix.getText().toString().toLowerCase();


        if((lblUno.equals(mujer) && lblDos.equals(mujerTraduccion)) || (lblTres.equals(mujer) && lblCuatro.equals(mujerTraduccion)) || (lblCinco.equals(mujer) && lblSeis.equals(mujerTraduccion))
          || (lblUno.equals(mujerTraduccion) && lblDos.equals(mujer)) || (lblTres.equals(mujerTraduccion) && lblCuatro.equals(mujer)) || (lblCinco.equals(mujerTraduccion) && lblSeis.equals(mujer)))
        {
            //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSixActivity.this);
            ventana.setMessage("Felicidades uniste los pares muy bien");
            ventana.setTitle("LECCIÓN 6")
                    .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(LessonSixActivity.this, LessonSevenActivity.class));
                        }
                    });
            ventana.show();
        }

        else if((lblUno.equals(hombre) && lblDos.equals(hombreTraduccion)) || (lblTres.equals(hombre) && lblCuatro.equals(hombreTraduccion)) || (lblCinco.equals(hombre) && lblSeis.equals(hombreTraduccion))
                || (lblUno.equals(hombreTraduccion) && lblDos.equals(hombre)) || (lblTres.equals(hombreTraduccion) && lblCuatro.equals(hombre)) || (lblCinco.equals(hombreTraduccion) && lblSeis.equals(hombre)))
        {
            //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSixActivity.this);
            ventana.setMessage("Felicidades uniste los pares muy bien");
            ventana.setTitle("LECCIÓN 6")
                    .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(LessonSixActivity.this, LessonSevenActivity.class));
                        }
                    });
            ventana.show();
        }

        else if((lblUno.equals(nino) && lblDos.equals(ninoTraduccion)) || (lblTres.equals(nino) && lblCuatro.equals(ninoTraduccion)) || (lblCinco.equals(nino) && lblSeis.equals(ninoTraduccion))
                || (lblUno.equals(ninoTraduccion) && lblDos.equals(nino)) || (lblTres.equals(ninoTraduccion) && lblCuatro.equals(nino)) || (lblCinco.equals(ninoTraduccion) && lblSeis.equals(nino)))
        {
            //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder ventana = new AlertDialog.Builder(LessonSixActivity.this);
            ventana.setMessage("Felicidades uniste los pares muy bien");
            ventana.setTitle("LECCIÓN 6")
                    .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(LessonSixActivity.this, LessonSevenActivity.class));
                        }
                    });
            ventana.show();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"Incorrecto vuelve a intentarlo y aprende",Toast.LENGTH_SHORT).show();

            txtOne.setText("");
            txtTwo.setText("");
            txtThree.setText("");
            txtFour.setText("");
            txtFive.setText("");
            txtSix.setText("");

            btnMujer.setEnabled(true);
            btnMujerTraduccion.setEnabled(true);
            btnHombre.setEnabled(true);
            btnHombreTraduccion.setEnabled(true);
            btnNino.setEnabled(true);
            btnNinoTraduccion.setEnabled(true);

            /*btnMujer.setBackgroundColor(Color.MAGENTA);
            btnMujerTraduccion.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            btnHombre.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            btnHombreTraduccion.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            btnNino.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            btnNinoTraduccion.setBackgroundColor(getResources().getColor(R.color.colorAccent));*/
        }
    }

    @Override
    public void onClick(View v) {
        // guardando los valores que tienen los textViews para las respuestas
        String one = txtOne.getText().toString().toLowerCase();
        String two = txtTwo.getText().toString().toLowerCase();
        String three = txtThree.getText().toString().toLowerCase();
        String four = txtFour.getText().toString().toLowerCase();
        String five = txtFive.getText().toString().toLowerCase();
        String six = txtSix.getText().toString().toLowerCase();

        switch (v.getId())
        {
            case R.id.btnMujer:
                if(one.equals("") )
                {
                    txtOne.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals("") )
                {
                    txtTwo.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals("") )
                {
                    txtThree.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals("") )
                {
                    txtFour.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals("") )
                {
                    txtFive.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals("") )
                {
                    txtSix.setText("Mujer");
                    btnMujer.setEnabled(false);
                    btnMujer.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnMujerTraduccion:
                if(one.equals(""))
                {
                    txtOne.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals(""))
                {
                    txtTwo.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals(""))
                {
                    txtThree.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals(""))
                {
                    txtFour.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals(""))
                {
                    txtFive.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals(""))
                {
                    txtSix.setText("Ixöq");
                    btnMujerTraduccion.setEnabled(false);
                    btnMujerTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnHombre:
                if(one.equals(""))
                {
                    txtOne.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals(""))
                {
                    txtTwo.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals(""))
                {
                    txtThree.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals(""))
                {
                    txtFour.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals(""))
                {
                    txtFive.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals(""))
                {
                    txtSix.setText("Hombre");
                    btnHombre.setEnabled(false);
                    btnHombre.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnHombreTraduccion:
                if(one.equals(""))
                {
                    txtOne.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals(""))
                {
                    txtTwo.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals(""))
                {
                    txtThree.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals(""))
                {
                    txtFour.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals(""))
                {
                    txtFive.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals(""))
                {
                    txtSix.setText("Achi");
                    btnHombreTraduccion.setEnabled(false);
                    btnHombreTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnNino:
                if(one.equals(""))
                {
                    txtOne.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals(""))
                {
                    txtTwo.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals(""))
                {
                    txtThree.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals(""))
                {
                    txtFour.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals(""))
                {
                    txtFive.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals(""))
                {
                    txtSix.setText("Niño");
                    btnNino.setEnabled(false);
                    btnNino.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnNinoTraduccion:
                if(one.equals(""))
                {
                    txtOne.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(two.equals(""))
                {
                    txtTwo.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(three.equals(""))
                {
                    txtThree.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(four.equals(""))
                {
                    txtFour.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(five.equals(""))
                {
                    txtFive.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }
                if(six.equals(""))
                {
                    txtSix.setText("Ak´wal");
                    btnNinoTraduccion.setEnabled(false);
                    btnNinoTraduccion.setBackgroundColor(Color.GRAY);
                    break;
                }

            case R.id.btnCalificarLeccion6:
                //startActivity(new Intent(LessonSixActivity.this,LessonSixActivity.class));
                validarResultado();
                break;
        }
    }
}
