package com.ticher.ecashformonopoly;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.ticher.ecashformonopoly.Servicio.ControlJuego;
import com.ticher.ecashformonopoly.ui.main.SectionsPagerAdapter;
import com.ticher.ecashformonopoly.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
    }
    public void unirseJuego(View view){
        Intent intent=new Intent(this,Jugar.class);
        EditText editText= (EditText) findViewById(R.id.editTextTextPersonName2);
        String nombre=editText.getText().toString();
        int n=editText.getN;
        ControlJuego cj= new ControlJuego();
        cj.crearJugador(nombre,);
        startActivity(intent);
    }
    public void crearJuego(View view){
        Intent intent=new Intent(this,Jugar.class);
        ControlJuego cj= new ControlJuego();
        cj.crearJuego();

        startActivity(intent);
    }
}