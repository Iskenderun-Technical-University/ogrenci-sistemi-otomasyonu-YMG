package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgretmenDanismanGetirController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<OgretmenDanismanGetir, String> column_ograd;

    @FXML
    private TableColumn<OgretmenDanismanGetir, String> column_ogrbolum;

    @FXML
    private TableColumn<OgretmenDanismanGetir, String> column_ogrmail;

    @FXML
    private TableColumn<OgretmenDanismanGetir, Integer> column_ogrnum;

    @FXML
    private TableColumn<OgretmenDanismanGetir, Integer> column_ogrogretim;

    @FXML
    private TableColumn<OgretmenDanismanGetir, Integer> column_ogrsinif;

    @FXML
    private TableColumn<OgretmenDanismanGetir, String> column_ogrsoyad;

    @FXML
    private TableView<OgretmenDanismanGetir> tbl_ogrenciler;
    
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    private ObservableList<OgretmenDanismanGetir> ogrenciler;

    @FXML
    void initialize() {
        assert column_ograd != null : "fx:id=\"column_ograd\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrbolum != null : "fx:id=\"column_ogrbolum\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrmail != null : "fx:id=\"column_ogrmail\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrnum != null : "fx:id=\"column_ogrnum\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrogretim != null : "fx:id=\"column_ogrogretim\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrsinif != null : "fx:id=\"column_ogrsinif\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert column_ogrsoyad != null : "fx:id=\"column_ogrsoyad\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        assert tbl_ogrenciler != null : "fx:id=\"tbl_ogrenciler\" was not injected: check your FXML file 'OgretmenDanismanGetir.fxml'.";
        
        
        column_ograd.setCellValueFactory(new PropertyValueFactory<>("ogrenci_ad"));
        column_ogrsoyad.setCellValueFactory(new PropertyValueFactory<>("ogrenci_soyad"));
        column_ogrnum.setCellValueFactory(new PropertyValueFactory<>("no"));
        column_ogrbolum.setCellValueFactory(new PropertyValueFactory<>("bolum"));
        column_ogrmail.setCellValueFactory(new PropertyValueFactory<>("mail"));
        column_ogrogretim.setCellValueFactory(new PropertyValueFactory<>("ogretim"));
        column_ogrsinif.setCellValueFactory(new PropertyValueFactory<>("sinif"));
    }
    
    public void deger_Ata(int ogretmen_id) {
    	ogrenciler=FXCollections.observableArrayList();
    	try {
			ResultSet degerler = baglanti.VeriGetir("select numara,ad,soyad,bolum,sınıf,ogretim,mail from ogrenci_bilgi where danisman_id1="+String.valueOf(ogretmen_id));
			while(degerler.next()) {
				ogrenciler.add(new OgretmenDanismanGetir(degerler.getString("ad"), degerler.getString("soyad"), degerler.getInt("numara"), null, degerler.getString("mail"), null, degerler.getInt("sınıf"), degerler.getString("bolum"), degerler.getInt("ogretim")));
			}
			tbl_ogrenciler.getItems().addAll(ogrenciler);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

}
