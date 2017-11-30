/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobinvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 * FXML Controller class
 *
 * @author krupa
 */
public class S2Controller implements Initializable {

    @FXML
    TextField Idtf;
     @FXML
    TextField Nametf;
      @FXML
    TextField Qtytf;
       @FXML
    TextField Pricsetf;
        @FXML
        DatePicker datetf;
        @FXML
        TextField droptf;
        @FXML
        AnchorPane mp;
        @FXML
        ImageView img;
        
        public Image myimg;

        public  FXMLDocumentController obj = new FXMLDocumentController();
  
     public void Getvalues(ActionEvent event) throws IOException{
//      FileChooser fileChooser = new FileChooser();
//FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//fileChooser.getExtensionFilters().add(extFilter);
//File file = fileChooser.showOpenDialog(primaryStage);
//System.out.println(file);
try{
    if(Idtf.getText()!= null&&Nametf.getText()!=null&&Qtytf.getText()!=null&&Pricsetf.getText()!=null &&datetf.getValue().toString()!=null && droptf.getText()!=null){      
        obj.addData(Idtf.getText(),Nametf.getText(),Qtytf.getText(),Pricsetf.getText(),datetf.getValue().toString(),droptf.getText());
        
         Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }
}
    catch(Exception e){
            Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle("Information Dialog");
alert.setHeaderText("Invalid");
alert.setContentText("Inputs are Invalid Try Again!");

  alert.showAndWait();
    }
  
         
    }
     public void chooseImage(){
     FileChooser fc = new FileChooser();
     fc.getExtensionFilters().addAll(
    new FileChooser.ExtensionFilter("All Images", "*.*"),
    new FileChooser.ExtensionFilter("JPG", "*.jpg"),
    new FileChooser.ExtensionFilter("GIF", "*.gif"),
    new FileChooser.ExtensionFilter("BMP", "*.bmp"),
    new FileChooser.ExtensionFilter("PNG", "*.png")
);
     File selectedfile = fc.showOpenDialog( null);
     selectedfile = new File(selectedfile.getAbsolutePath());
     if(selectedfile != null){
         
        Image image = new Image(selectedfile.toURI().toString());
        img.setImage(image);
     }
     }
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   System.out.println("ddd");
      //  final Image image2 = new Image("");
       // img.setImage(image2);
   // File file = new File("file:image.jpg");
     //   Image image = new Image("file:image.jpg");
 
    }       
}
