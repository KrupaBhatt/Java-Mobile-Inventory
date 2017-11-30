/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobinvent;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.input.MouseButton;
//
import java.io.IOException;
import java.math.BigDecimal;
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
import javafx.scene.control.Alert;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author krupa
 */
public class FXMLDocumentController implements Initializable {
    
   // The table and columns
    @FXML
    TableView<MobInv> itemTbl;
  @FXML
    TextField SellID;
   @FXML
    TextField SellQty;
    @FXML
    TableColumn itemIdCol;
    @FXML
    TableColumn itemNameCol;
    @FXML
    TableColumn itemQtyCol;
    @FXML
    TableColumn itemPriceCol;
     @FXML
    TableColumn itemYearCol;
      @FXML
    TableColumn itemCompCol;
      @FXML 
      Label val;
       @FXML 
      Label Tsales;
        @FXML 
      Label Tprofit;
      
      public static  double value = 0; 
      public static  String GTsales = ""; 
      public static  String GTProfit = "";  
      
      // The table's data
      public static ObservableList<MobInv> data =  FXCollections.observableArrayList();
         MobInv item;
     @FXML
         public Button btn;
      @FXML
         public AnchorPane mainPain;
         public static  String a,b,c,d,e,f;
         public static int count =0;
    
      public void addData(String a, String b, String c, String d,String e, String f ) throws IOException{
       
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d; 
        this.e = e;
        this.f = f;
             value += Double.parseDouble(d);   
      }
      
    public void initialize(URL url, ResourceBundle rb) {
     itemIdCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("id")
        );
        itemNameCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("name")
        );
        itemQtyCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("qty")
        );
        itemPriceCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("price")
        );
        
         itemYearCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("Year")
        );
 
          itemCompCol.setCellValueFactory(
            new PropertyValueFactory<MobInv,String>("Company")
        );

         item = new MobInv(a,b,c,d,e,f);    
        data.add(item);
        itemTbl.setItems(data);
        //////////
         if(count ==0 )
        {
            generatDummydata();count++;
        }
         else
         {
        ////////////
       DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
       String numberAsString = decimalFormat.format(value);
        val.setText(numberAsString);
         }
        Tsales.setText(GTsales);
        Tprofit.setText(GTProfit);
        
        
   //      Tsales.setText("$0");
    }
    ////////////
    public void generatDummydata(){
      item = new MobInv("1","LG01","13","15","26/11/2017","LG");    
        data.add(item);
         item = new MobInv("2","LG02","13","7","26/11/2017","LG");    
        data.add(item);
         item = new MobInv("3","LG03","10","9","26/11/2017","OPPO");    
        data.add(item);
         item = new MobInv("4","F01","9","10","26/11/2017","HUAWIE");    
        data.add(item);
         item = new MobInv("5","F02","7","11","26/11/2017","INFINX");    
        data.add(item);
        itemTbl.setItems(data);
        itemTbl.refresh();
          DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
       String numberAsString = decimalFormat.format(543);
        val.setText(numberAsString); 
        
    }
    public String revertValue(String v){
        v = v.replace(",","");
// DecimalFormat decimalFormat = new DecimalFormat("#0.00");
  //     String numberAsString = decimalFormat.format(v);
      return v;
 }
    ////////////
 public String returnvalue(double v){
 DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
       String numberAsString = decimalFormat.format(v);
      return numberAsString;
 }
     public void changeScreenButtonPushed(ActionEvent event) throws IOException
    {
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("s2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }
    
     public void SellItem(){
         String id = SellID.getText();
       Double Qty = Double.parseDouble(SellQty.getText().toString());
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("Information Dialog");
       alert.setHeaderText("Invalid");
       for(int i=1;i<data.size();i++){
           
       if(data.get(i).id.getValue().equals(id)){
       double tprice =  Double.parseDouble(data.get(i).price.getValue().toString());
       double TotalSales = tprice*Qty;
     
       double ATotSales = Double.parseDouble((Tsales.getText().isEmpty()== true)?"0":revertValue(Tsales.getText().toString()))+TotalSales;
      GTsales = returnvalue(ATotSales);
       Tsales.setText(returnvalue(ATotSales));
       ////////////////////    
     //  String temp = val.getText().toString();
       double CurrentValue = Double.parseDouble(revertValue(val.getText().toString()));
     //  alert.setContentText(temp);
    //   alert.showAndWait();
       double TotalPreofit = ATotSales-CurrentValue; //(tprice*Qty);
       double profit = Double.parseDouble((Tprofit.getText().isEmpty()== true)?"0":revertValue(Tprofit.getText().toString()))+TotalPreofit;
        GTProfit = returnvalue(profit);
       Tprofit.setText(returnvalue(profit));
     //  double ATotSales = Double.parseDouble((Tsales.getText().isEmpty()== true)?"0":Tsales.getText().toString())+TotalSales;  
      
       Double UpdateQty = Double.parseDouble(data.get(i).qty.getValue())-Qty;
       data.get(i).qty.setValue(UpdateQty.toString());
        itemTbl.setItems(data);
        itemTbl.refresh();
       
       }  
       }
        
     }
}
