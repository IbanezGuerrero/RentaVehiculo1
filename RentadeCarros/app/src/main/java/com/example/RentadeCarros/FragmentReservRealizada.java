package com.example.RentadeCarros;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentReservRealizada extends Fragment {

    Button cancelar1,confirmar1,salir1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View n = inflater.inflate(R.layout.fragment_fragment_reserv_realizada, container, false);

        confirmar1 = n.findViewById(R.id.btnConfirmar1);
        salir1 = n.findViewById(R.id.btnSali1);
        cancelar1 = n.findViewById(R.id.btnCancelar1);

      confirmar1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              FragmentManager fragmentManager = getFragmentManager();
              fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentItems()).commit();

          }
      });

     salir1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             getActivity().finish();


         }
     });
       cancelar1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentManager fragmentManager = getFragmentManager();
               fragmentManager.beginTransaction().replace(R.id.contenedor1, new FragmentItems()).commit();


           }
       });

        return n ;
    }


}
