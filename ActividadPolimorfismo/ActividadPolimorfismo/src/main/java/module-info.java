module com.angel.actividadpolimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.zacarias.actividadpolimorfismo to javafx.fxml;
    exports com.zacarias.actividadpolimorfismo;
    opens com.zacarias.actividadpolimorfismo.Models to javafx.fxml;
    exports com.zacarias.actividadpolimorfismo.Models;
    exports com.zacarias.actividadpolimorfismo.Controller;
    opens com.zacarias.actividadpolimorfismo.Controller to javafx.fxml;
}