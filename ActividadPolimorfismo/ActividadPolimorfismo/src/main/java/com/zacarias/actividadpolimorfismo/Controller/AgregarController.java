package com.zacarias.actividadpolimorfismo.Controller;


import com.zacarias.actividadpolimorfismo.App;
import com.zacarias.actividadpolimorfismo.Models.Instituto;
import com.zacarias.actividadpolimorfismo.Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarController {


    @FXML
    private ListView<String> lista;

    @FXML
    private TextField matricula;

    @FXML
    private TextField name;

    @FXML
    void agregarClick() {
        Instituto instituto = App.getInstituto();
        String nombre = name.getText();
        String matt = matricula.getText();
        Student student = new Student(nombre,matt);

        instituto.agregarStudent(student);
        lista.getItems().add(student.imprimirAlumn());
    }

    @FXML
    void salirClick(MouseEvent event) {
        App.nuevaVentana(event,"VistaInicio","Instituto Descartes");
    }

    @FXML
    void initialize() {
        Instituto instituto = App.getInstituto();

        lista.getItems().clear();
        for (Student i:instituto.getDataBase().getStudents()){
            lista.getItems().add(i.imprimirAlumn());
        }
    }

}
