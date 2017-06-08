package com.code.ebarrios.kakchilingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpezar = (Button)findViewById(R.id.btnEmpezar);
        btnEmpezar.setOnClickListener(this);

        showToolbar("COMPILADORES-UMG",false);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnEmpezar)
        {
            startActivity(new Intent(MainActivity.this,AprenderActivity.class));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.antesDe:
                startActivity(new Intent(MainActivity.this,AntesDeEmpezarActivity.class));
                return true;

            case R.id.acercaDe:
                //Toast.makeText(getApplicationContext(),"Acerca de ",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,AcercaDeActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void showToolbar(String title, boolean btnRegreso)
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
        getSupportActionBar().openOptionsMenu();
    }
}
