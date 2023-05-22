package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class AdminPanelController {

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

}

