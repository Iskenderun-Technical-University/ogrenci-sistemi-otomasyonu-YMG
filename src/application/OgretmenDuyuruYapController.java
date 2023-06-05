package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
    
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    @FXML
    void btn_duyuru_yap_Click(ActionEvent event) {
     
    	if (baglanti.Var_mı("select * from duyuru where bolum=?", combo_bolum.getSelectionModel().getSelectedItem())) {
    		baglanti.Update("update duyuru set bolum=?,baslik=?,icerik=?", combo_bolum.getSelectionModel().getSelectedItem(), txt_baslik.getText(), txt_area.getText());
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("İşlem Başarılı");
			alert.setTitle("Duyuru Yapıldı");
			alert.setContentText("Duyuru Başarıyla Güncellendi");
			alert.showAndWait();
		}
    	else {
			baglanti.Insert("insert into duyuru (bolum,baslik,icerik) values (?,?,?)", combo_bolum.getSelectionModel().getSelectedItem(), txt_baslik.getText(), txt_area.getText());
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("İşlem Başarılı");
			alert.setTitle("Duyuru Yapıldı");
			alert.setContentText("yeni Duyuru Yayınlandı.");
			alert.showAndWait();
		}
    }


    @FXML
    void initialize() {
        assert combo_bolum != null : "fx:id=\"combo_bolum\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        assert txt_area != null : "fx:id=\"txt_area\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        assert txt_baslik != null : "fx:id=\"txt_baslik\" was not injected: check your FXML file 'OgretmenDuyuruYap.fxml'.";
        try {
			ResultSet bolumler = baglanti.VeriGetir("select bolum_ad from bolum");
			while(bolumler.next()) {
				combo_bolum.getItems().add(bolumler.getString("bolum_ad"));
			}
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

}
