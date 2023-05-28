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

public class OgrenciSifreDegistirController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kaydet;

    @FXML
    private CheckBox chk_kontrol;

    @FXML
    private TextField txt_eskisifre;

    @FXML
    private TextField txt_yenisifre;

    @FXML
    private TextField txt_yenisifretekrar;
    
    private String eskisifre_yeni;
    private String eskisifre;
    private String yenisifre;
    private String yenisfretekrar;
    
    
    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	
          eskisifre_yeni=txt_eskisifre.getText();
          yenisifre=txt_yenisifre.getText();
          yenisfretekrar=txt_yenisifretekrar.getText();
          
          System.out.println(txt_yenisifre.getText());
          System.out.println(txt_yenisifretekrar.getText());
          
          if (eskisifre_yeni.equals("") || yenisifre.equals("") || yenisfretekrar.equals("")) {
        	  Alert alert =new Alert(AlertType.ERROR);
    		  alert.setTitle("Dikkat");
              alert.setHeaderText("Boş Değer Girilemez.");
              alert.setContentText("Şifre Alanları Boş Bırakılamaz.");
              alert.showAndWait();
		}
          else {
        	  if (yenisifre.equals(yenisfretekrar)) {
            	  if (eskisifre_yeni.equals(eskisifre)) {
    				
            		  if (!eskisifre_yeni.equals(yenisifre)) {
    					
            			  // sorgu ile çağırılıp buradaki değerler atanacak
            			  
            			  
            			  
    				}
            		  else {
            			  Alert alert =new Alert(AlertType.ERROR);
                		  alert.setTitle("Dikkat");
                          alert.setHeaderText("Şifre Aynı");
                          alert.setContentText("Eski Şifreniz İle Yeni Şifreniz Aynı Olamaz.");
                          alert.showAndWait();
            		  }
            		  
    			}
            	  else {
            		  Alert alert =new Alert(AlertType.ERROR);
            		  alert.setTitle("Dikkat");
                      alert.setHeaderText("Şifre Uyuşmazlığı");
                      alert.setContentText("Eski Şifrenizi Yanlış girdiniz. ");
                      alert.showAndWait();
            	  }
            	  
    		}
              else {
            	  Alert alert =new Alert(AlertType.ERROR);
             	 
                  alert.setTitle("Dikkat");
                  alert.setHeaderText("Şifre Uyuşmazlığı");
                  alert.setContentText("Yeni Şifeniz ve Tekrarı Birbiriyle Uyuşmuyor !! ");
                  alert.showAndWait();
                  
              }
        	  
          }
          
          
          
    }
    
  

    @FXML
    void initialize() {
        assert btn_kaydet != null : "fx:id=\"btn_kaydet\" was not injected: check your FXML file 'OgrenciSifreDegistir.fxml'.";
        assert chk_kontrol != null : "fx:id=\"chk_kontrol\" was not injected: check your FXML file 'OgrenciSifreDegistir.fxml'.";
        assert txt_eskisifre != null : "fx:id=\"txt_eskisifre\" was not injected: check your FXML file 'OgrenciSifreDegistir.fxml'.";
        assert txt_yenisifre != null : "fx:id=\"txt_yenisifre\" was not injected: check your FXML file 'OgrenciSifreDegistir.fxml'.";
        assert txt_yenisifretekrar != null : "fx:id=\"txt_yenisifretekrar\" was not injected: check your FXML file 'OgrenciSifreDegistir.fxml'.";
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
        eski_sifre("a");
        
    }
    
    public void eski_sifre(String sifre) {
    	this.eskisifre=new String(sifre);
    }
    
    

}
