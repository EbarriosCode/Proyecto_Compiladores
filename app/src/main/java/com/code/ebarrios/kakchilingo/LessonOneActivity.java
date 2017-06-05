package com.code.ebarrios.kakchilingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.Adapters.OpcionesAdapter;
import com.code.ebarrios.kakchilingo.Models.Opciones;

import java.util.ArrayList;

public class LessonOneActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private ArrayList<Opciones> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        // mostrando showToolbar
        showToolbar("LECCION UNO",false);

        datos = new ArrayList<Opciones>();
        datos.add(new Opciones(R.drawable.ni_a,"Ak’wal"));
        datos.add(new Opciones(R.drawable.auto,"Saqer"));
        datos.add(new Opciones(R.drawable.mujer,"Ixöq"));
        datos.add(new Opciones(R.drawable.lapiz,"umül"));

        recyclerView = (RecyclerView)findViewById(R.id.recicladorOpciones);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new OpcionesAdapter(datos);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"reycler view",Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public void showToolbar(String title, boolean btnRegreso)
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
    }
}
