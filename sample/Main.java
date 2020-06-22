package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.InHouse;
import model.Inventory;
import model.Outsource;

import java.io.IOException;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1150, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {

        Outsource part1 = new Outsource(1, "Radeon RX580", 164.99, 10, 32, 1, "AMD");
        Outsource part2 = new Outsource(2, "RTX 5500", 299.99, 12, 35, 1, "NVIDIA");
        InHouse part3 = new InHouse(11, "Ryzen 5 2900X", 180.00, 14, 45, 1, 626);
        InHouse part4 = new InHouse(12, "i5-9500T", 210.00, 9, 40,1, 827);

        Inventory.addPart(part3);

        launch(args);
    }

}
