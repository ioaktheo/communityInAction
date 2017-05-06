/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municipality;

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

/**
 *
 * @author ThePs
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label problemsLabel;
    @FXML
    private ListView problems;
    
    ObservableList<String> items =FXCollections.observableArrayList ();

    private Connection connection;
    private Statement statement;
    private ResultSet result;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/community", "monty", "some_pass");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex);
        }

        
        try {
        String query = "select * from problem";
        result = statement.executeQuery(query);
        
        while (result.next()) {
        String description = result.getString("description");
        items.add(description);
        }
        } catch (SQLException ex) {
        System.out.println(ex);
        }
        
        problems.setItems(items);
    }

}
