package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class partMenuController {

    Stage stage;
    Parent scene;

    @FXML
    private RadioButton inHouseBtn;

    @FXML
    private ToggleGroup partSourceToggle;

    @FXML
    private RadioButton outsourcedBtn;

    @FXML
    private Label partSourceLabel;

    @FXML
    private TextField partNameTxt;

    @FXML
    private TextField partStockTxt;

    @FXML
    private TextField partPriceTxt;

    @FXML
    private TextField partMaxTxt;

    @FXML
    private TextField partSourceTxt;

    @FXML
    private TextField partMinTxt;

    @FXML
    private Button partMenuSaveBtn;

    @FXML
    private Button partMenuCancelBtn;

    @FXML
    void onClickInHouse(MouseEvent event) {

    }

    @FXML
    void onClickOutsourced(MouseEvent event) {

    }

    @FXML
    void onClickPartMenuCancel(MouseEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/mainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onClickPartMenuSave(MouseEvent event) {

    }
}