package biteprog;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BiteController {
    public Label BiteMe;

    public void sayBiteMe(ActionEvent actionEvent) {
        BiteMe.setText("Bite You!");
    }
}
