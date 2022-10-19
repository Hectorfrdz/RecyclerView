package com.example.recyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

import com.example.recyclerview.adaptadores.personaAdaptador;

import java.util.ArrayList;
import java.util.List;

import modelos.Persona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Persona> persons = new ArrayList<Persona>();

        persons.add(new Persona("Hector","8721371167"));
        persons.add(new Persona("Perla","8721689583"));
        persons.add(new Persona("Pablo","8721465541"));
        persons.add(new Persona("Juan","8729746523"));
        persons.add(new Persona("Merlin","8729846213"));
        persons.add(new Persona("Juana","8724598126"));
        persons.add(new Persona("Alonso","8728465129"));
        persons.add(new Persona("Pepe","8728564299"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        personaAdaptador adapter = new personaAdaptador(persons);
        recyclerView.setAdapter(adapter);
    }

}