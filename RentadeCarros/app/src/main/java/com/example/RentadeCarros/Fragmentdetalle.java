package com.example.RentadeCarros;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class Fragmentdetalle extends Fragment {

    ImageView imagen;
    TextView nombrepaisaje;
    TextView descripcion;

    Button regresar,siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmentdetalle, container, false);

        View n=inflater.inflate(R.layout.fragment_fragmentdetalle, container, false);
        imagen=n.findViewById(R.id.img_paisaje);

        nombrepaisaje=n.findViewById(R.id.txtNomPaisaje);
        imagen.setImageResource(datos.getPaisaje().getImagen());
        descripcion = n.findViewById(R.id.txtDescripcion);
        nombrepaisaje.setText(datos.getPaisaje().getNombre_paisaje());
        descripcion.setText(datos.getPaisaje().getDescripcion());
        regresar = n.findViewById(R.id.btnRegresar);
        siguiente = n.findViewById(R.id.btnSiguiente);



        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getActivity().finish();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentItems()).commit();

            }

        });

     siguiente.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             FragmentManager fragmentManager = getFragmentManager();
             fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentConfirm()).commit();
         }

     });



        return n ;



    }



}
