/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.event.ActionEvent;
import mobinvent.FXMLDocumentController;
import mobinvent.S2Controller;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author was
 */
public class JUnitTestClass {
    
    FXMLDocumentController obj = new FXMLDocumentController();
    S2Controller obj2 = new S2Controller();
    
    public JUnitTestClass() {
        try{
        obj.addData("a", "b", "c", "d", "e", "f");
        ActionEvent e=null;
        obj.changeScreenButtonPushed(e);
        obj2.chooseImage();
        obj2.Getvalues(e);
        }
        catch(Exception e){}
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
