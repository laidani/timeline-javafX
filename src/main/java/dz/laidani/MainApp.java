package dz.laidani;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author laidani.youcef
 */
public class MainApp extends Application {

    private static List<TimeLineUnit> listeTimeLine;
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        //This will fill the Time Line Unit in your Gui
        VBox vbox = new VBox();
        for (TimeLineUnit timeUnit : listeTimeLine) {
            //For each unit create a new instance
            UnitController unitController = new UnitController();
            unitController.getTitle().setText(timeUnit.getTitle());
            unitController.getDetails().setText(timeUnit.getDetails());
            unitController.getTime().setText(
                    timeUnit.getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
            );
            unitController.setIdTimeLine(timeUnit.getId());
            vbox.getChildren().add(unitController);
        }

        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToHeight(true);

        BorderPane root = new BorderPane(scrollPane);
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        primaryStage.setTitle("Time Line Example using JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        //Fill your Time Line here
        listeTimeLine = new LinkedList<>();
        listeTimeLine.add(
                TimeLineUnit.builder().id(1).title("Install tools")
                        .details("Install JDK 1.8, Netbeans 8.2, Scene Builder")
                        .dateTime(LocalDateTime.parse("2018-02-06T13:45:00")).build()
        );
        listeTimeLine.add(
                TimeLineUnit.builder().id(2).title("Create An application")
                        .details("Create new Maven JavaFx Applicaton")
                        .dateTime(LocalDateTime.parse("2018-02-06T14:10:00")).build()
        );
        listeTimeLine.add(
                TimeLineUnit.builder().id(3).title("Gui design")
                        .details("Create a Simple unity of your Timeline, use your imagination ;)")
                        .dateTime(LocalDateTime.parse("2018-02-06T14:40:00")).build()
        );
        listeTimeLine.add(
                TimeLineUnit.builder().id(4).title("Take a break")
                        .details("To refresh your brain, Take a break, move, take a coffé")
                        .dateTime(LocalDateTime.parse("2018-02-06T15:00:00")).build()
        );
        listeTimeLine.add(
                TimeLineUnit.builder().id(5).title("Controller")
                        .details("Create a controller for your GUI")
                        .dateTime(LocalDateTime.parse("2018-02-06T15:30:00")).build()
        );
        listeTimeLine.add(
                TimeLineUnit.builder().id(6).title("The END")
                        .details("Edit this class and fill this timeline")
                        .dateTime(LocalDateTime.parse("2018-02-06T16:00:00")).build()
        );
        
        //Then launch your application
        launch(args);
    }

}
