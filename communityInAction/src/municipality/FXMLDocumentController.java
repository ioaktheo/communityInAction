/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municipality;

import citizen.database.Problem;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author ThePs
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label problemsLabel;
    @FXML
    private ListView problems;
    @FXML
    ObservableList<String> items = FXCollections.observableArrayList();
    @FXML
    TextArea textArea;
    @FXML 
    Label titleLabel;
    @FXML
    Label roadLabel;
    @FXML
    Label streetLabel;
    
    

    Problem problem = new Problem();

    private Connection connection;
    private Statement statement;
    private ResultSet result;

    @FXML
    public void catchSelection(MouseEvent event) {
        textArea.clear();
        String currentItem = problems.getSelectionModel().getSelectedItem().toString();

        try {
            String query = "select * from problem where title like '" + currentItem + "'";
            result = statement.executeQuery(query);

            while (result.next()) {
                textArea.setText(result.getString("description"));
                titleLabel.setText(result.getString("title"));
                roadLabel.setText(result.getString("road"));
                streetLabel.setText(result.getString("street_number"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @FXML
    public void refreshList(ActionEvent event) throws IOException {

        problems.getItems().clear();

        try {
            String query = "select * from problem";
            result = statement.executeQuery(query);

            while (result.next()) {
                String description = result.getString("title");
                items.add(description);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/community", "monty", "some_pass");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }

        try {
            String query = "select * from problem";
            result = statement.executeQuery(query);

            while (result.next()) {
                String description = result.getString("title");
                items.add(description);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        problems.setItems(items);
        problems.getFocusModel().focus(0);
    }

}
