package com.code.ebarrios.kakchilingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.code.ebarrios.kakchilingo.Adapters.OpcionesAdapterTwo;
import com.code.ebarrios.kakchilingo.Models.Opciones;

import java.util.ArrayList;

public class LessonTwoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private ArrayList<Opciones> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        // llamando al toolbar
        showToolbar("LECCION 2",false);

        datos = new ArrayList<Opciones>();
        datos.add(new Opciones(R.drawable.pescado,"Kär"));
        datos.add(new Opciones(R.drawable.arbol,"Che’"));
        datos.add(new Opciones(R.drawable.pajaro,"Tz’ikïn"));
        datos.add(new Opciones(R.drawable.ni_o,"Ak’wal"));

        recyclerView = (RecyclerView)findViewById(R.id.recicladorOpcionesTwo);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new OpcionesAdapterTwo(datos,this);

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
