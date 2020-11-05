package com.animaliabackend.animaliabackend.Gestor;

import com.animaliabackend.animaliabackend.Objetos.Animalia;
import com.animaliabackend.animaliabackend.Objetos.Response;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Animalia> arrAnimalia;

    public Gestor(){
        this.arrAnimalia = new ArrayList<>();
    }

    public ArrayList<String> obtenerInfoAnimalia(){
        ArrayList<String> arrInfoAnimalia = new ArrayList<>();

        for (Animalia animalia : this.arrAnimalia) {
            arrInfoAnimalia.add( obtenerDatosAnimalia(animalia) );
        }

        return arrInfoAnimalia;
    }

    public Response crearAnimal(String nombre, String reino, int cantExtremidades){
        Response resp;
        if(nombre.equals("") || reino.equals(""))
            resp = crearResponse(500, "No se pudo crear la instancia, alguno de los parametros es invalido o es inexistente");
        else{
            resp = crearResponse(200, "El animal se ha registrado exitosamente");
            agregarAnimalia( new Animalia(nombre, reino, cantExtremidades) );
        }

        return resp;
    }

    private Response crearResponse(int codigo, String mensaje){
        return new Response(codigo, mensaje);
    }

    private void agregarAnimalia(Animalia animalia){
        this.arrAnimalia.add( animalia );
    }

    private String obtenerDatosAnimalia(Animalia animalia){
        return animalia.toString();
    }
}
