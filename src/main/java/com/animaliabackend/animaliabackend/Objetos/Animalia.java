package com.animaliabackend.animaliabackend.Objetos;

public class Animalia {
    private String nombre;
    private String reino;
    private int cantExtremidades;

    public Animalia(String nombre, String reino, int cantExtremidades){
        setNombre(nombre);
        setReino(reino);
        setCantExtremidades(cantExtremidades);
    }

    public String toString(){
        return "El animal " + getNombre() + " pertenece al reino " + getReino() + ", y tiene " + getCantExtremidades() + " extremidades";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public int getCantExtremidades() {
        return cantExtremidades;
    }

    public void setCantExtremidades(int cantExtremidades) {
        this.cantExtremidades = cantExtremidades;
    }
}
