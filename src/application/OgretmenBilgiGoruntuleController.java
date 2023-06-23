package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OgretmenBilgiGoruntuleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl_Ad;

    @FXML
    private Label lbl_Adres;

    @FXML
    private Label lbl_Bol;

    @FXML
    private Label lbl_Fak;

    @FXML
    private Label lbl_Kul_Ad;

    @FXML
    private Label lbl_Mail;

    @FXML
    private Label lbl_Soyad;

    @FXML
    void initialize() {
        assert lbl_Ad != null : "fx:id=\"lbl_Ad\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Adres != null : "fx:id=\"lbl_Adres\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Bol != null : "fx:id=\"lbl_Bol\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Fak != null : "fx:id=\"lbl_Fak\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Kul_Ad != null : "fx:id=\"lbl_Kul_Ad\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Mail != null : "fx:id=\"lbl_Mail\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";
        assert lbl_Soyad != null : "fx:id=\"lbl_Soyad\" was not injected: check your FXML file 'OgretmenBilgiGoruntule.fxml'.";

    }
    
    public void  bilgi_yaz(OgretmenBilgi bilgiler) {
    	 this.lbl_Ad.setText(bilgiler.getAd());
    	 this.lbl_Soyad.setText(bilgiler.getSoyad());
    	 this.lbl_Kul_Ad.setText(bilgiler.getKu_ad());
    	 this.lbl_Bol.setText(bilgiler.getBolum());
    	 this.lbl_Fak.setText(bilgiler.getFakulte());
    	 this.lbl_Mail.setText(bilgiler.getMail());
    	 this.lbl_Adres.setText(bilgiler.getAdres());
    }

}
