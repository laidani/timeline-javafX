package dz.laidani;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author laidani.youcef
 */
public class UnitController extends AnchorPane{

    @FXML private @Getter @Setter JFXButton showDetailBtn;
    @FXML private @Getter @Setter Label time;
    @FXML private @Getter @Setter Label title;
    @FXML private @Getter @Setter Label details;
    
    private @Getter @Setter int idTimeLine;
    
    @FXML void showDetail(ActionEvent event) {
        System.out.println("Id of time line = " + idTimeLine);
    }
    
    public UnitController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Unite.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
}
