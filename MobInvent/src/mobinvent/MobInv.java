/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobinvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.image.Image;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author krupa
 */
public class MobInv  {
    
        public SimpleStringProperty id ;//= new SimpleLongProperty();
        public SimpleStringProperty name;// = new SimpleStringProperty();
        public SimpleStringProperty qty;// = new SimpleIntegerProperty();
        public SimpleStringProperty price;// = new SimpleStringProperty();
        public SimpleStringProperty Year;
        public SimpleStringProperty Company;
      

        
        public MobInv(String iid,String nname,String qqty,String pprice,String YYear,String CCompany){
            
        id = new SimpleStringProperty(iid);
        name = new SimpleStringProperty(nname);
        qty = new SimpleStringProperty(qqty);
        price = new SimpleStringProperty(pprice);
         Year = new SimpleStringProperty(YYear);
          Company = new SimpleStringProperty(CCompany);

        }

    //Get method for year 
    public String getYear() {
        return Year.get();
    }

    //get method for company
    public String getCompany() {
        return Company.get();
    }

    //get method for Id
    public String getId() {
        return id.get();
    }
    
    //get method for Name 
    public String getName() {
        return name.get();
    }
    
    //get method for Quantity
    public String getQty() {
        return qty.get();
    }
    
    //get method for Price 
    public String getPrice() {
        return price.get();
    }
        
        
    
}
