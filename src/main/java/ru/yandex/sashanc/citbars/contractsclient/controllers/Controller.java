package ru.yandex.sashanc.citbars.contractsclient.controllers;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ru.yandex.sashanc.citbars.contractsclient.models.Contract;
import ru.yandex.sashanc.citbars.contractsclient.services.ContractServiceImpl;
import ru.yandex.sashanc.citbars.contractsclient.services.IContractService;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class Controller {
    private ObservableList<Contract> contractObsList = FXCollections.observableArrayList();

    @FXML
    private Label welcomeText;

    @FXML
    private Button getContractsButton;

    @FXML
    private TableView<Contract> contractTableView;

    @FXML
    void initialize(){
        welcomeText.setText("Welcome to JavaFX Application! - initialize()");
        setCellTypeValues();
    }

    @FXML
    protected void onGetContractsButtonClick(){
        contractTableView.getItems().clear();
        IContractService contractService = new ContractServiceImpl();
        contractObsList.addAll(contractService.getContractList());
        contractTableView.setItems(contractObsList);
    }

    private void setCellTypeValues() {
        Field[] fields = Contract.class.getDeclaredFields();
        for (Field field : fields) {
            TableColumn tableColumn = new TableColumn();
                tableColumn.setId(field.getName());
                tableColumn.setText(Contract.getFieldName(field.getName()));
                tableColumn.setPrefWidth(150);
                tableColumn.setEditable(true);
                tableColumn.setCellValueFactory(new PropertyValueFactory<>(field.getName()));
            contractTableView.getColumns().add(tableColumn);
        }
    }
}
