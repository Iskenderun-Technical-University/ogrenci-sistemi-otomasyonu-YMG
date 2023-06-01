package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class OgretmenDuyuruYapController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> combo_bolum;

    @FXML
    private TextArea txt_area;

    @FXML
    private TextField txt_baslik;
    
    @FXML
    private Button btn_duyuru_yap;
    
    String text="";
    @FXML
    void btn_duyuru_yap_Click(ActionEvent event) {
     
    	// sorgu ile duyuru menüsüne gönderilecek
    }


    @FXML
    void initialize() {
        assert combo_bolum != null : "fx:id=\"combo_bolum\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        assert txt_area != null : "fx:id=\"txt_area\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        assert txt_baslik != null : "fx:id=\"txt_baslik\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        
        combo_bolum.getItems().add("Bilgisayar Mühendisliği");
        combo_bolum.getItems().add("Makine Mühendisliği");
        combo_bolum.getItems().add("Uçak Mühendisliği");
        combo_bolum.getItems().add("Gemi Mühendisliği");
        
    }

}
