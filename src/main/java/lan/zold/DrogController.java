/*
* File: DrogController.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-08
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;
/* Import sorok */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

/* A DrogController osztály */

public class DrogController {

    //Itt tároljuk a táblákat
    @FXML
    private TableView<Drog> drogTable;

    @FXML
    private TableColumn<Drog, Integer> idCol;

    @FXML
    private TableColumn<Drog, String> nameCol;

    @FXML
    private TableColumn<Drog, Double> priceCol;

    @FXML
    private TableColumn<Drog, Integer> quantityCol;

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField quantityField;

    @FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @FXML
    void onClickBakcButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickAddButton(ActionEvent event) {
        a();
    }

    @FXML
    void onClickDeleteButton(ActionEvent event) {
        System.out.println("Nincs megvalósítva!");
    }

    @FXML
    void onClickModifyButton(ActionEvent event) {
        System.out.println("Nincs megvalósítva!");
    }

    @FXML
    void onMouseClickDrogtable(MouseEvent event) {
        if(
            event.getButton().equals(MouseButton.PRIMARY) && 
            event.getClickCount() == 2) {
            
            int index = drogTable.getSelectionModel().getSelectedIndex();
            if(index != -1) {
                Drog drog = drogTable.getSelectionModel().getSelectedItem();
                idField.setText(String.valueOf(drog.id));
                nameField.setText(drog.name);
                priceField.setText(String.valueOf(drog.price));
                quantityField.setText(String.valueOf(drog.quantity));    
            }
            
            
        }
    }    

    private void a() {
        Drog drog = new Drog();
        drog.id = Integer.parseInt(idField.getText());
        drog.name = nameField.getText();
        drog.price = Double.parseDouble(priceField.getText());
        drog.quantity = Integer.parseInt(quantityField.getText());
        drogTable.getItems().add(drog);
        em.writeDrog(drog);

        idField.clear();
        nameField.clear();
        priceField.clear();
        quantityField.clear();
    }

}
