package view;

import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class SecondController {
    public void checkBoxClicked (MouseEvent mouseEvent) {
        CheckBox checkBox = (CheckBox) mouseEvent.getSource();
        System.out.println(checkBox.isSelected());
    }
}
