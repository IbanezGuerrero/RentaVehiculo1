package com.example.RentadeCarros;

public class datos {

    private  String nombre_paisaje;
    private String descripcion;
    private  int imagen;

    public static datos getPaisaje() {
        return paisaje;
    }


    public String getNombre_paisaje() {
        return nombre_paisaje;
    }

    public void setNombre_paisaje(String nombre_paisaje) {
        this.nombre_paisaje = nombre_paisaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    private final static datos paisaje=new datos();
}



