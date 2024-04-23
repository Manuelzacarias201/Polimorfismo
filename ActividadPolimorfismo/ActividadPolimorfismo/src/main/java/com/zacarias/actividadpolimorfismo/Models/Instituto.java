package com.zacarias.actividadpolimorfismo.Models;

public class Instituto {
    BaseDatos dataBase = new BaseDatos();
    BaseDatosLocal dataBaseLocal = new BaseDatosLocal();
    BaseDatosNube dataBaseNube = new BaseDatosNube();

    public BaseDatos getDataBase() {
        return dataBase;
    }

    public BaseDatosLocal getDataBaseLocal() {
        return dataBaseLocal;
    }

    public BaseDatosNube getDataBaseNube() {
        return dataBaseNube;
    }

    public void agregarStudent(Student student){
        dataBase.agregarStudent(student);
        dataBaseLocal.agregarStudent(student);
        dataBaseNube.agregarStudent(student);
    }

    public void actualizarStudent(String editar,String nombre,String id){
        dataBase.actualizarStudent(editar,nombre,id);
        dataBaseLocal.actualizarStudent(editar,nombre,id);
        dataBaseNube.actualizarStudent(editar,nombre,id);
    }
}
