package ru.yandex.sashanc.citbars.contractsclient;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import org.apache.log4j.Logger;

import java.io.IOException;

public class Application extends javafx.application.Application {
//    private static final Logger logger = Logger.getLogger(Application.class);

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/views/contracts-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Договора");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        logger.info("Application.main() is started");
        launch();
    }
}
