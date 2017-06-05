package com.code.ebarrios.kakchilingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AprenderActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagenKakchiquel,imagenPoqomchi,imagenKiche;
    TextView txtKakchiquel,txtPoqomchi,txtKiche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);

        imagenKakchiquel = (ImageView)findViewById(R.id.logoKakchiquel);
        imagenPoqomchi = (ImageView)findViewById(R.id.logoPoqomchi);
        imagenKiche = (ImageView)findViewById(R.id.logoKiche);

        txtKakchiquel = (TextView)findViewById(R.id.txtKakchiquel);
        txtPoqomchi = (TextView)findViewById(R.id.txtPoqomchi);
        txtKiche = (TextView)findViewById(R.id.txtKiche);

        imagenKakchiquel.setOnClickListener(this);
        imagenPoqomchi.setOnClickListener(this);
        imagenKiche.setOnClickListener(this);

        txtKakchiquel.setOnClickListener(this);
        txtPoqomchi.setOnClickListener(this);
        txtKiche.setOnClickListener(this);

        // llamando al toolbar
        showToolbar("QUIERO APRENDER",true);
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
        if(v.getId() == R.id.logoKakchiquel || v.getId() == R.id.txtKakchiquel)
        {
            startActivity(new Intent(AprenderActivity.this,LessonOneActivity.class));
        }

        else{
            Toast.makeText(this,"Curso no disponible aún :(",Toast.LENGTH_LONG).show();
        }
    }
}
