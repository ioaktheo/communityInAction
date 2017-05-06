/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.database;

import citizen.communication.DbLinker;
import citizen.communication.Problem;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Xristos Aslamagidis
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ChoiceBox ChoiceBoxType;

    @FXML
    private TextField TextFieldRoad;

    @FXML
    private TextField TextFieldRoadNumber;

    @FXML
    private TextField TextFieldArea;

    @FXML
    private TextField TextFieldDescription;

    @FXML
    private Button Submit;

    @FXML
    private Button Clear;

    private Connection con;
    private Statement st;
    private ResultSet rs;

    Problem problem = new Problem();
    DbLinker dblinker = new DbLinker();

    @FXML
    public void Submit(ActionEvent event) {
        problem.setRoad(TextFieldRoad.getText().trim());
        problem.setNumberOfRoad(TextFieldRoadNumber.getText().trim());
        problem.setArea(TextFieldArea.getText().trim());
        problem.setDescription(TextFieldDescription.getText().trim());
       

        try {

            problem.InsertProblem(dblinker);
           
        } catch (Exception ex) {
            System.out.println(ex);

        }

        
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }

}
