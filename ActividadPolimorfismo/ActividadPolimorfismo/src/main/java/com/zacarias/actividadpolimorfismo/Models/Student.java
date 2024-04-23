package com.zacarias.actividadpolimorfismo.Models;

public class Student {

public String nombre;
public String id;
    public Student(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String imprimirAlumn() {
        StringBuilder alumno = new StringBuilder();
        alumno.append("----------Alumno----------\n");
        alumno.append("Matricula: ").append(id).append("\n");
        alumno.append("Nombre: ").append(nombre).append("\n");

        return alumno.toString();
    }
}
