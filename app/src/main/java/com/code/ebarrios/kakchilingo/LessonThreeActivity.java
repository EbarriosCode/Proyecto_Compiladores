package com.code.ebarrios.kakchilingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.code.ebarrios.kakchilingo.Adapters.OpcionesAdapterThree;
import com.code.ebarrios.kakchilingo.Models.Opciones;

import java.util.ArrayList;

public class LessonThreeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private ArrayList<Opciones> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three);
        // llamando al toolbar
        showToolbar("LECCION 3",false);

        datos = new ArrayList<Opciones>();
        datos.add(new Opciones(R.drawable.escalera,"Molaj"));
        datos.add(new Opciones(R.drawable.hombre,"Achi"));
        datos.add(new Opciones(R.drawable.mundo,"Ruwach’ulew"));
        datos.add(new Opciones(R.drawable.moto,"Mo’s"));

        recyclerView = (RecyclerView)findViewById(R.id.recicladorOpcionesThree);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new OpcionesAdapterThree(datos,this);

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
