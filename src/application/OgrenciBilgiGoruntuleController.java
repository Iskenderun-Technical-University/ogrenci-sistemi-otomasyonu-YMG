package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OgrenciBilgiGoruntuleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl_ogrenciad; //

    @FXML
    private Label lbl_ogrenciadres;

    @FXML
    private Label lbl_ogrencimail;

    @FXML
    private Label lbl_ogrencino; //

    @FXML
    private Label lbl_ogrencisinif;

    @FXML
    private Label lbl_ogrencisoyad; //

    @FXML
    private Label lbl_ogrencitc; //

    @FXML
    void initialize() {
        assert lbl_ogrenciad != null : "fx:id=\"lbl_ogrenciad\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrenciadres != null : "fx:id=\"lbl_ogrenciadres\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrencimail != null : "fx:id=\"lbl_ogrencimail\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrencino != null : "fx:id=\"lbl_ogrencino\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrencisinif != null : "fx:id=\"lbl_ogrencisinif\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrencisoyad != null : "fx:id=\"lbl_ogrencisoyad\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";
        assert lbl_ogrencitc != null : "fx:id=\"lbl_ogrencitc\" was not injected: check your FXML file 'OgrenciBilgiGoruntule.fxml'.";

    }
    
    public void bilgi_getir(OgrenciBilgiGoruntule bilgi) {
    	this.lbl_ogrenciad.setText(bilgi.getOgrenci_ad());
    	this.lbl_ogrencisoyad.setText(bilgi.getOgrenci_soyad());
    	this.lbl_ogrencino.setText(String.valueOf(bilgi.getNo()));
    	this.lbl_ogrencitc.setText(bilgi.getTc());
    	this.lbl_ogrencimail.setText(bilgi.getMail());
    	this.lbl_ogrenciadres.setText(bilgi.getAdres());
    	this.lbl_ogrencisinif.setText(String.valueOf(bilgi.getSinif()));
    	
    	
    }

}
