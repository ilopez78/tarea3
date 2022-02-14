package com.example.tarea3;

public class list {
    private String nombres, apellidos, edad, correo, direcccion;

    public list(){

    }
    public list(String nombres, String apellidos, String edad, String correo, String direcccion){
        this.nombres =nombres;
        this.apellidos =apellidos;
        this.edad =edad;
        this.correo =correo;
        this.direcccion =direcccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDirecccion() {
        return direcccion;
    }
}
