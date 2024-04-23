package com.zacarias.actividadpolimorfismo.Controller;

import com.zacarias.actividadpolimorfismo.App;
import com.zacarias.actividadpolimorfismo.Models.Instituto;
import com.zacarias.actividadpolimorfismo.Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VistaController {

    @FXML
    private Button salirBtn;

    @FXML
    private ListView<String> lista;

    @FXML
    void agregarClick(MouseEvent event) {
        App.nuevaVentana(event,"VistaAlumno","Agrega un alumno...");
    }

    @FXML
    void modificarClick(MouseEvent event) {
        App.nuevaVentana(event,"VistaModificar","Modifica un alumno...");
    }

    @FXML
    void salirClick() {
        Stage stage = (Stage) salirBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        Instituto instituto = App.getInstituto();

        lista.getItems().clear();
        for (Student i:instituto.getDataBase().students){
            lista.getItems().add(i.imprimirAlumn());
        }
    }

}
