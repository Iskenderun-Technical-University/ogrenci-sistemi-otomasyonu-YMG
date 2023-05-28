package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class OgrenciMailDegistirController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kaydet;

    @FXML
    private CheckBox chk_kontrol;

    @FXML
    private TextField txt_eskimail_yeni;

    @FXML
    private TextField txt_yenimail;

    @FXML
    private TextField txt_yenimailtekrar;
    
    private String eskimail_yeni;
    private String yeni_mail;
    private String yenimail_tekrar;
    private String eskimail="a";
    

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	eskimail_yeni =txt_eskimail_yeni.getText();
    	yeni_mail=txt_yenimail.getText();
    	yenimail_tekrar=txt_yenimailtekrar.getText();
    	
    	 if (eskimail_yeni.equals("") || yeni_mail.equals("") || yenimail_tekrar.equals("")) {
       	  Alert alert =new Alert(AlertType.ERROR);
   		  alert.setTitle("Dikkat");
             alert.setHeaderText("Boş Değer Girilemez.");
             alert.setContentText("Mail Alanları Boş Bırakılamaz.");
             alert.showAndWait();
		}
         else {
       	  if (yeni_mail.equals(yenimail_tekrar)) {
           	  if (eskimail_yeni.equals(eskimail)) {
   				
           		  if (!eskimail_yeni.equals(yeni_mail)) {
   					
           			  // sorgu ile çağırılıp buradaki değerler atanacak
           			  
           			  
           			  
   				}
           		  else {
           			  Alert alert =new Alert(AlertType.ERROR);
               		  alert.setTitle("Dikkat");
                         alert.setHeaderText("Mail Aynı");
                         alert.setContentText("Eski Mailiniz İle Yeni Mailiniz Aynı Olamaz.");
                         alert.showAndWait();
           		  }
           		  
   			}
           	  else {
           		  Alert alert =new Alert(AlertType.ERROR);
           		  alert.setTitle("Dikkat");
                     alert.setHeaderText("Mail Uyuşmazlığı");
                     alert.setContentText("Eski Mailinizi Yanlış girdiniz. ");
                     alert.showAndWait();
           	  }
           	  
   		}
             else {
           	  Alert alert =new Alert(AlertType.ERROR);
            	 
                 alert.setTitle("Dikkat");
                 alert.setHeaderText("Mail Uyuşmazlığı");
                 alert.setContentText("Yeni Mailiniz ve Tekrarı Birbiriyle Uyuşmuyor !! ");
                 alert.showAndWait();
                 
             }
       	  
         }
    	

    }

    @FXML
    void initialize() {
      
      
         chk_kontrol.selectedProperty().addListener(new ChangeListener<Boolean>() {
        	 @Override
        	public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
        		 if (arg2==true) {
         			btn_kaydet.setDisable(false);
 					
 				}
         		else {
         			btn_kaydet.setDisable(true);
         		}
         		
         	}
        		
        	
		});
    }

}
