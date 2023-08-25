package com.martinbordon.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Inmueble> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView() {
        ArrayAdapter<Inmueble> adapter = new AdapterList(this, R.layout.item, list, getLayoutInflater());
        ListView lv = findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos() {
        list.add(new Inmueble(R.drawable.casa1, "Juana Koslay", 80000.9 ));
        list.add(new Inmueble(R.drawable.casa2, "Los Paraisos", 60000.0 ));
        list.add(new Inmueble(R.drawable.casa3, "La Punta", 15000.12 ));
    }
}