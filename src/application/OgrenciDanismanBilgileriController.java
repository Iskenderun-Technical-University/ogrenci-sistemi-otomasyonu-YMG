package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OgrenciDanismanBilgileriController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl_ad1;

    @FXML
    private Label lbl_ad2;

    @FXML
    private Label lbl_bolum1;

    @FXML
    private Label lbl_bolum2;

    @FXML
    private Label lbl_fakulte2;

    @FXML
    private Label lbl_fakülte1;

    @FXML
    private Label lbl_mail1;

    @FXML
    private Label lbl_mail2;

    @FXML
    private Label lbl_soyad1;

    @FXML
    private Label lbl_soyad2;

    @FXML
    void initialize() {
        assert lbl_ad1 != null : "fx:id=\"lbl_ad1\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_ad2 != null : "fx:id=\"lbl_ad2\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_bolum1 != null : "fx:id=\"lbl_bolum1\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_bolum2 != null : "fx:id=\"lbl_bolum2\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_fakulte2 != null : "fx:id=\"lbl_fakulte2\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_fakülte1 != null : "fx:id=\"lbl_fakülte1\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_mail1 != null : "fx:id=\"lbl_mail1\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_mail2 != null : "fx:id=\"lbl_mail2\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_soyad1 != null : "fx:id=\"lbl_soyad1\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";
        assert lbl_soyad2 != null : "fx:id=\"lbl_soyad2\" was not injected: check your FXML file 'OgrenciDanısmanBilgileri.fxml'.";

    }
    
    public void Danısman1_Yazdır(String ad, String soyad , String fakulte , String bolum ,String mail) {
    	
    	this.lbl_ad1.setText(ad);
    	this.lbl_soyad1.setText(soyad);
    	this.lbl_fakülte1.setText(fakulte);
    	this.lbl_bolum1.setText(bolum);
    	this.lbl_mail1.setText(mail);
    }
    
   public void Danısman2_Yazdır(String ad, String soyad , String fakulte , String bolum ,String mail) {
    	
    	this.lbl_ad2.setText(ad);
    	this.lbl_soyad2.setText(soyad);
    	this.lbl_fakulte2.setText(fakulte);
    	this.lbl_bolum2.setText(bolum);
    	this.lbl_mail2.setText(mail);
    }
    

}
