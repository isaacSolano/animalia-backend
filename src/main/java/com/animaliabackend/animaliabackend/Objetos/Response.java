package com.animaliabackend.animaliabackend.Objetos;

public class Response {
    private int codigo;
    private String mensaje;

    public Response(int codigo, String mensaje){
        setCodigo(codigo);
        setMensaje(mensaje);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
