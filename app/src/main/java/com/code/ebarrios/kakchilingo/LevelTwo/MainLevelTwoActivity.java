package com.code.ebarrios.kakchilingo.LevelTwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.AcercaDeActivity;
import com.code.ebarrios.kakchilingo.AntesDeEmpezarActivity;
import com.code.ebarrios.kakchilingo.R;

public class MainLevelTwoActivity extends AppCompatActivity {
    Button btnEmpezarNivel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_level_two);

        showToolbar("COMPILADORES-UMG",false);

        btnEmpezarNivel2 = (Button)findViewById(R.id.btnEmpezarNivel2);
        btnEmpezarNivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainLevelTwoActivity.this,LessonOneLevelTwoActivity.class));
            }
        });
    }

    public void showToolbar(String title, boolean btnRegreso)
    {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(btnRegreso);
        getSupportActionBar().openOptionsMenu();
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
                startActivity(new Intent(MainLevelTwoActivity.this, AntesDeEmpezarActivity.class));
                return true;

            case R.id.acercaDe:
                //Toast.makeText(getApplicationContext(),"Acerca de ",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainLevelTwoActivity.this, AcercaDeActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
