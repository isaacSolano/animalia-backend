package com.animaliabackend.animaliabackend.Routes.Animalia;

import com.animaliabackend.animaliabackend.Gestor.Gestor;
import com.animaliabackend.animaliabackend.Objetos.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class AnimaliaRoutes {
    private Gestor gestor;

    public AnimaliaRoutes(){
        this.gestor = new Gestor();
    }

    /**
     * @return ArrayList() => Lista con la informacion de los animales creados
     */
    @GetMapping("/api/getAllAnimalia")
    public ArrayList getAllAnimalia(){
        return this.gestor.obtenerInfoAnimalia();
    }

    /**
     * @param params => Paramatros de la consulta en formato HashMap; facilita la extraccion de los datos por medio del `key` de cada parametro
     * @return resp => Respuesta de la solicitud; facilita la comunicacion del estado de la solicitud, se indica cualquier error y la razon del mismo, si lo hay
     */
    @PostMapping(value = "/api/addAnimal", consumes = "application/json", produces = "application/json")
    public Response addAnimal(@RequestBody HashMap params){
        return this.gestor.crearAnimal( String.valueOf(params.get("nombre")), String.valueOf(params.get("reino")), Integer.valueOf(params.get("cantExtremidades").toString()));
    }
}
