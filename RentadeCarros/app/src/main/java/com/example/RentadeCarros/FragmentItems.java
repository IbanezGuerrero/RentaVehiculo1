package com.example.RentadeCarros;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import static com.example.RentadeCarros.datos.getPaisaje;


public class FragmentItems extends Fragment implements AdapterView.OnItemClickListener  {

    ListView lista1;
    adaptador adaptador1;

    String[] nombrepaisajes;
    String[] descripcionpaisajes;
FragmentManager fragmentManager;

    int [] img = new int[]{
            R.drawable.carro1,
            R.drawable.carro2,
            R.drawable.carro3,
            R.drawable.carro4,
            R.drawable.carro5,
            R.drawable.carro6,
            R.drawable.carro7,
            R.drawable.carro8,
            R.drawable.carro9,
            R.drawable.carro10


    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       nombrepaisajes = getResources().getStringArray(R.array.Lugar);
       descripcionpaisajes = getResources().getStringArray(R.array.descripLugar);
        View n=inflater.inflate(R.layout.fragment_fragment_items, container, false);

        lista1=n.findViewById(R.id.listLugares);
        adaptador1=new adaptador(getContext(),img,nombrepaisajes,descripcionpaisajes);
        lista1.setAdapter(adaptador1);
        lista1.setOnItemClickListener(this);




        return n ;


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.contenedor1,new Fragmentdetalle()).commit();;


            getPaisaje().setImagen(img[position]);
            getPaisaje().setNombre_paisaje(nombrepaisajes[position]);
            getPaisaje().setDescripcion(descripcionpaisajes[position]);



    }



}
