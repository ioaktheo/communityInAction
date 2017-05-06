/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.communityinaction_citizen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Xristos Aslamagidis
 */
public class FXMLHomePageController implements Initializable {

    @FXML
    private Button ButtonProblem ;
    
    
    @FXML
    private void ReportProblem(ActionEvent event) throws IOException{
    Parent home_page_parent=FXMLLoader.load(getClass().getResource("communityinaction-citizen.fxml"));
    Scene home_page_scene=new Scene(home_page_parent);
    Stage app_stage= (Stage) (((Node) event.getSource()).getScene().getWindow());
    app_stage.setScene(home_page_scene);
    app_stage.show();

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
