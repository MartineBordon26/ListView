package com.martinbordon.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterList extends ArrayAdapter<Inmueble> {
    private Context context;
    private List<Inmueble> list;
    private LayoutInflater li;
    public AdapterList(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) { // position = indice; View el item en si;  ViweGROUP = el contenerdor padre.

        View itemView = convertView; // lo que vamos a retornar

        if (itemView == null) {
            itemView = li.inflate(R.layout.item, parent, false);
        }

        Inmueble inmueble = list.get(position); // valor entero que resprestan de la imagen, string textView, double precio
        ImageView foto = itemView.findViewById(R.id.foto);
        foto.setImageResource(inmueble.getFoto());

        TextView direccion = itemView.findViewById(R.id.direccion);
        direccion.setText(inmueble.getDireccion());

        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText(inmueble.getPrecio() + "");

        return itemView;
    }
}
