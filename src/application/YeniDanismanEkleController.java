package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class YeniDanismanEkleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kaydet;

    @FXML
    private ComboBox<String> combo_Bolum;

    @FXML
    private ComboBox<String> combo_Fakulte;

    @FXML
    private TextField txt_ad;

    @FXML
    private TextArea txt_area_adres;

    @FXML
    private TextField txt_kul_ad;

    @FXML
    private TextField txt_mail;

    @FXML
    private TextField txt_sifre;

    @FXML
    private TextField txt_soyad;

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	
    	//veritabanına alınan değerler atanacak

    }
    
    

    @FXML
    void initialize() {
        assert btn_kaydet != null : "fx:id=\"btn_kaydet\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert combo_Bolum != null : "fx:id=\"combo_Bolum\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert combo_Fakulte != null : "fx:id=\"combo_Fakulte\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_ad != null : "fx:id=\"txt_ad\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_area_adres != null : "fx:id=\"txt_area_adres\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_kul_ad != null : "fx:id=\"txt_kul_ad\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_mail != null : "fx:id=\"txt_mail\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_sifre != null : "fx:id=\"txt_sifre\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";
        assert txt_soyad != null : "fx:id=\"txt_soyad\" was not injected: check your FXML file 'YeniDanismanEkle.fxml'.";

    }
    
    
    public void fak_ata(ObservableList<Fakulte> fakulteler) {
    	
    	 for (Fakulte fak : fakulteler) {
 			combo_Fakulte.getItems().add(fak.getFak_ad());
 		}
    }
    
    public void bolum_ata(ObservableList<Bolum> bolumler) {
    	
    	for(Bolum bol : bolumler) {
       	 combo_Bolum.getItems().add(bol.getBolum_ad());
        }
    }

}
