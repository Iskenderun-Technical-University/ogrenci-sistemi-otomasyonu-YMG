package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import com.Mysql.VeritabaniBaglanti;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class OgretmenSifreDegistirController {
	
	
	
	 
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
    private int ogr_id;
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    private MD5_Sifrele sifrele =  new MD5_Sifrele();


    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	
    	
    	
    	   eskisifre_yeni=txt_eskisifre.getText();
           yenisifre=txt_yenisifre.getText();
           yenisfretekrar=txt_yenisifretekrar.getText();
           
        
           
           if (eskisifre_yeni.equals("") || yenisifre.equals("") || yenisfretekrar.equals("")) {
         	  Alert alert =new Alert(AlertType.ERROR);
     		  alert.setTitle("Dikkat");
               alert.setHeaderText("Boş Değer Girilemez.");
               alert.setContentText("Şifre Alanları Boş Bırakılamaz.");
               alert.showAndWait();
 		}
           else {
         	  if (yenisifre.equals(yenisfretekrar)) {
             	  if (sifrele.getMd5(eskisifre_yeni).equals(eskisifre)) {
     				
             		  if (!eskisifre_yeni.equals(yenisifre)) {
     					
             			  // sorgu ile çağırılıp buradaki değerler atanacak
             			  baglanti.Update("update ogretim_uyesi set sifre=? where id=?", sifrele.getMd5(yenisifre), ogr_id);
                			 Alert alert =new Alert(AlertType.INFORMATION);
                   		  alert.setTitle("Başarılı");
                             alert.setHeaderText("Şifre Değiştirildi");
                             alert.setContentText("Şifreniz başarılı Bir Şekilde Değşiştirildi.");
                             alert.showAndWait();
             			  
             			  
             			  
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
        assert btn_kaydet != null : "fx:id=\"btn_kaydet\" was not injected: check your FXML file 'OgretmenSifreDegistir.fxml'.";
        assert chk_kontrol != null : "fx:id=\"chk_kontrol\" was not injected: check your FXML file 'OgretmenSifreDegistir.fxml'.";
        assert txt_eskisifre != null : "fx:id=\"txt_eskisifre\" was not injected: check your FXML file 'OgretmenSifreDegistir.fxml'.";
        assert txt_yenisifre != null : "fx:id=\"txt_yenisifre\" was not injected: check your FXML file 'OgretmenSifreDegistir.fxml'.";
        assert txt_yenisifretekrar != null : "fx:id=\"txt_yenisifretekrar\" was not injected: check your FXML file 'OgretmenSifreDegistir.fxml'.";
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
    
    public void id_Ata(int id) {
    	this.ogr_id=id;
    	
    	 try {
 			ResultSet sifre_getir = baglanti.VeriGetir("Select sifre from ogretim_uyesi where id="+ogr_id);
 			if (sifre_getir.next()) {
 				eskisifre=sifre_getir.getString("sifre");
 			}
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
    	
    	
    	 
    }
    
 
   

}
