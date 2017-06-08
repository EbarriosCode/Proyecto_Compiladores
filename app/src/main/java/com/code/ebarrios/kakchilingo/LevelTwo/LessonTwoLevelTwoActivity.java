package com.code.ebarrios.kakchilingo.LevelTwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.code.ebarrios.kakchilingo.LevelTwo.AdaptersLevelTwo.OpcionesAdapterTwoLevelTwo;
import com.code.ebarrios.kakchilingo.Models.Opciones;
import com.code.ebarrios.kakchilingo.R;

import java.util.ArrayList;

public class LessonTwoLevelTwoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private ArrayList<Opciones> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two_level_two);

        // mostrando showToolbar
        showToolbar("LECCION 2", false);

        datos = new ArrayList<Opciones>();

        datos.add(new Opciones(R.drawable.auto, "Saqer"));
        datos.add(new Opciones(R.drawable.mexico, "Mexico"));
        datos.add(new Opciones(R.drawable.guatemala,"Armita"));
        datos.add(new Opciones(R.drawable.mujer, "Ixöq"));


        recyclerView = (RecyclerView) findViewById(R.id.recicladorOpcionesTwoLevelTwo);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new OpcionesAdapterTwoLevelTwo(datos, this);

        recyclerView.setAdapter(adapter);
    }

    public void showToolbar(String title, boolean btnRegreso) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
    }
}