module it.softwaredocotor.javafxemotionapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.softwaredocotor.javafxemotionapplication to javafx.fxml;
    exports it.softwaredocotor.javafxemotionapplication;
}