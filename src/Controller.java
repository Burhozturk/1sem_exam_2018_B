import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;

import java.awt.*;

public class Controller
{
    public TextArea textFlow1;
    Media nyMedia=new Media();

    public void test(ActionEvent actionEvent)
    {
        textFlow1.setText("julekalender.jpg"+"julekalender.txt"+"julemand.jpg"+"julemand.txt"+"mosemanden.jpg"+"mosemanden.txt"+"video1.mp4");
    }
}
