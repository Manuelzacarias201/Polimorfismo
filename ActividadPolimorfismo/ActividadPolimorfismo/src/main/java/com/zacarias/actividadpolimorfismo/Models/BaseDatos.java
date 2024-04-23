package com.zacarias.actividadpolimorfismo.Models;


import java.util.ArrayList;

public class BaseDatos implements DataBase {
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Student> getStudents(){return students;}

    @Override
    public void agregarStudent(Student student) {
        students.add(student);
    }
    @Override
    public void actualizarStudent(String editar, String nombre, String id) {
        for (Student i: students){
            if (editar.equals(i.getId())){
                i.setId(id);
                i.setNombre(nombre);
            }
        }
    }
}
