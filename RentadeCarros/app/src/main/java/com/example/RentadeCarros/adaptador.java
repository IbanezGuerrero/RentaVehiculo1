package com.example.RentadeCarros;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class adaptador extends ArrayAdapter {

    private Context context;
    public int[] imagen;
    public String[] nombres;
    public  String [] descripcion;

    public View fila;

    public adaptador(@NonNull Context context, int[] imagen, String[] nombres, String[] descripcion) {
        super(context, R.layout.activity_item_paisaje, nombres);
        this.context = context;
        this.imagen = imagen;
        this.nombres = nombres;
        this.descripcion = descripcion;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        fila =  inflater.inflate(R.layout.activity_item_paisaje, parent, false);
        ImageView img = (ImageView) fila.findViewById(R.id.img_paisaje);
        TextView nam = (TextView) fila.findViewById(R.id.txtNomPaisaje);
        img.setImageResource(imagen[position]);
        nam.setText(nombres[position]);
        return fila;
    }




}
