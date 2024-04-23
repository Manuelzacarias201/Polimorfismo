package com.zacarias.actividadpolimorfismo.Controller;

import com.zacarias.actividadpolimorfismo.App;
import com.zacarias.actividadpolimorfismo.Models.Instituto;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ActualizarController {

    @FXML
    private TextField matriculaTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField newMatriculaTxt;

    @FXML
    void actualizarClick() {
        Instituto instituto = App.getInstituto();

        String buscar = matriculaTxt.getText();
        String id = newMatriculaTxt.getText();
        String nombre = nameTxt.getText();

        instituto.actualizarStudent(buscar,nombre,id);
    }
    @FXML
    void salirClick(MouseEvent event){
        App.nuevaVentana(event,"VistaInicio","Instituto Descartes");
    }

}
