package com.example.RentadeCarros;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentConfirm extends Fragment {


    Button confirmar,cancelar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View n = inflater.inflate(R.layout.fragment_fragment_confirm, container, false);

      confirmar = n.findViewById(R.id.btnReservar);
       cancelar = n.findViewById(R.id.btnCancelar);

       cancelar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentManager fragmentManager = getFragmentManager();
               fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentItems()).commit();

               cancelar.setTextColor(Color.parseColor("#9E9E9E"));

           }
       });

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentReservRealizada()).commit();
            }
        });

        return n ;
    }

}