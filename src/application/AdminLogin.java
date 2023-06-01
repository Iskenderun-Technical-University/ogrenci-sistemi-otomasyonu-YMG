package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class AdminLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private BorderPane border_pane;

    @FXML
    private Button btn_giris;

    @FXML
    private Button btn_iptal;

    @FXML
    private RadioButton rdio_kontrol;

    @FXML
    private TextField txt_kulad;
    
    @FXML
    private AnchorPane anchor_pane;
    
   

    @FXML
    private TextField txt_sifre;
    LoginController login =new LoginController();

    @FXML
    void btn_giris_Click(ActionEvent event) {
    	if (rdio_kontrol.isSelected()==true) {
    		
    		
    			try {
    	    		Stage stage1 = new Stage();
    				AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminPanel.fxml"));
    				Scene scene = new Scene(pane1); 
    				
    				stage1.setScene(scene);
    				
    				
    				stage1.show();
    				Stage suanki_stage = (Stage) btn_giris.getScene().getWindow();
    		    	suanki_stage.close();
    		    	
    				
    			} catch(Exception e) {
    				e.printStackTrace();
    			}
    			
    			
			
    		
			
		}
    	else {
    		Alert alert =new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("Bot Doğrulaması yapılamadı");
    		alert.setTitle("DİKKAT");
    		alert.setContentText("Lütfen Bot Doğrulamasını İşaretleyiniz.");
    		alert.showAndWait();
    	}

    }

    @FXML
    void btn_giris_OffMouse(MouseEvent event) {
            login.Scale_Transtition(1.1, 1, 0.5, btn_giris);
    }

    @FXML
    void btn_giris_OnMouse(MouseEvent event) {
    	
    	login.Scale_Transtition(1, 1.1, 0.5, btn_giris);
    }

    @FXML
    void btn_iptal_Click(ActionEvent event) {
    	
    	Stage stage = (Stage) btn_iptal.getScene().getWindow();
    	stage.close();
    	
    	try {
    		Stage stage1 = new Stage();
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(pane1); // boyut verilmez ise scene builder da tanımlı preference ölçülerde başlar
			stage1.setScene(scene);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
    	
        
       
       
    }

    @FXML
    void btn_iptal_OffMouse(MouseEvent event) {
             login.Scale_Transtition(1.1, 1, 0.5, btn_iptal);
             
    }

    @FXML
    void btn_iptal_OnMouse(MouseEvent event) {
              login.Scale_Transtition(1, 1.1, 0.5, btn_iptal);
    }

    @FXML
    void initialize() {
        assert btn_giris != null : "fx:id=\"btn_giris\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert btn_iptal != null : "fx:id=\"btn_iptal\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert rdio_kontrol != null : "fx:id=\"rdio_kontrol\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert txt_kulad != null : "fx:id=\"txt_kulad\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert txt_sifre != null : "fx:id=\"txt_sifre\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        
        login.Fade_Trantition(0, 1, 1, 0, border_pane);

    }
    
    public void stage_Kapat(Node node) {
    	Stage stage = (Stage) node.getScene().getWindow();
    	stage.close();
		
    	
    }

}

