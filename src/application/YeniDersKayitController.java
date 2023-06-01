package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class YeniDersKayitController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kaydet;

    @FXML
    private ComboBox<Integer> combo_akts;

    @FXML
    private ComboBox<Integer> combo_kredi;

    @FXML
    private ComboBox<Integer> combo_labSaat;

    @FXML
    private ComboBox<String> combo_ogretimUyesi;

    @FXML
    private ComboBox<Integer> combo_sinif;

    @FXML
    private ComboBox<Integer> combo_teoSaat;

    @FXML
    private ComboBox<Integer> combo_uygSaat;

    @FXML
    private ComboBox<String> combo_zorunlulul;

    @FXML
    private TextField txt_DersAdi;

    @FXML
    private TextField txt_dersKodu;

    @FXML
    private TextField txt_derslik;

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	
    	// alınan degerler veritabanına gönderilecek

    }

    @FXML
    void initialize() {
        assert btn_kaydet != null : "fx:id=\"btn_kaydet\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_akts != null : "fx:id=\"combo_akts\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_kredi != null : "fx:id=\"combo_kredi\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_labSaat != null : "fx:id=\"combo_labSaat\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_ogretimUyesi != null : "fx:id=\"combo_ogretimUyesi\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_sinif != null : "fx:id=\"combo_sinif\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_teoSaat != null : "fx:id=\"combo_teoSaat\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_uygSaat != null : "fx:id=\"combo_uygSaat\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert combo_zorunlulul != null : "fx:id=\"combo_zorunlulul\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert txt_DersAdi != null : "fx:id=\"txt_DersAdi\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert txt_dersKodu != null : "fx:id=\"txt_dersKodu\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        assert txt_derslik != null : "fx:id=\"txt_derslik\" was not injected: check your FXML file 'YeniDersKayit.fxml'.";
        
        for(int i=1;i<21;i++) {
        	combo_akts.getItems().add(i);
        	
        	if (i<11) {
				combo_kredi.getItems().add(i);
				combo_labSaat.getItems().add(i);
				combo_teoSaat.getItems().add(i);
				combo_uygSaat.getItems().add(i);
			}
        	
        	if (i<6) {
				combo_sinif.getItems().add(i);
			}
        }
        
        combo_zorunlulul.getItems().addAll("Z","S");
        
     // veritabanından ogretim üyesi ad soyad ve id çekilecek  ad soyad birleştirilip ogretim uyesi comboboxına atanacak
        combo_ogretimUyesi.getItems().add("Göktuğ Kaya");
        combo_ogretimUyesi.getItems().add("Ömer İmre");
        combo_ogretimUyesi.getItems().add("Ömer Doğan");
        
    }
    
    
    

}
