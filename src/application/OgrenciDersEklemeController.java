package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgrenciDersEklemeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<DersEklemeVeriTuru> tbl_onaybek;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_DersAdı;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_dersKodu;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_ogretimUyesi;

    @FXML
    private TableView<DersEklemeVeriTuru> tbl_onaylanmamıs;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersAdı;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersKodu;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersSec;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_ogretimUyesi;
    
    private ObservableList<DersEklemeVeriTuru> a;
    private ObservableList<DersEklemeVeriTuru> b;
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();    
    private int ogrenci_id;
    @FXML
    void btn_gonder_Click(ActionEvent event) {
    	
    	try {
    		 for (DersEklemeVeriTuru onay : b) {
    				if (onay.getSecili().isSelected()) {
    					
    					baglanti.Update("update ogrenci_ders set ders_durumu=2 where ogrenci_id=? and ders_id=?", ogrenci_id, baglanti.id_Getir("select id from dersler where ders_ad=?", onay.getDers_Adı()));
    					
    				}
    			}
    		 Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("İşlem Başarılı");
				alert.setTitle("Der Onaylandı");
				alert.setContentText("Ders Onaylanması İçin Danışman Öğretmene Gönderildi.");
				alert.showAndWait();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
     
    }
    
    
    @FXML
    void initialize() {
        assert tbl_onaybek != null : "fx:id=\"tbl_onaybek\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_DersAdı != null : "fx:id=\"tbl_onaybek_DersAdı\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_dersKodu != null : "fx:id=\"tbl_onaybek_dersKodu\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_ogretimUyesi != null : "fx:id=\"tbl_onaybek_ogretimUyesi\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs != null : "fx:id=\"tbl_onaylanmamıs\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersAdı != null : "fx:id=\"tbl_onaylanmamıs_dersAdı\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersKodu != null : "fx:id=\"tbl_onaylanmamıs_dersKodu\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersSec != null : "fx:id=\"tbl_onaylanmamıs_dersSec\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_ogretimUyesi != null : "fx:id=\"tbl_onaylanmamıs_ogretimUyesi\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        
        tbl_onaybek_DersAdı.setCellValueFactory(new PropertyValueFactory<>("Ders_Adı"));
        tbl_onaybek_dersKodu.setCellValueFactory(new PropertyValueFactory<>("Ders_kodu"));
        tbl_onaybek_ogretimUyesi.setCellValueFactory(new PropertyValueFactory<>("Ogretim_adi"));
        tbl_onaylanmamıs_dersAdı.setCellValueFactory(new PropertyValueFactory<>("Ders_Adı"));
        tbl_onaylanmamıs_dersKodu.setCellValueFactory(new PropertyValueFactory<>("Ders_kodu"));
        tbl_onaylanmamıs_dersSec.setCellValueFactory(new PropertyValueFactory<>("secili"));
        tbl_onaylanmamıs_ogretimUyesi.setCellValueFactory(new PropertyValueFactory<>("Ogretim_adi"));
       
    }
    

    
    public void ogr_id (int id) {
    	
    	this.ogrenci_id=id;
    	 a=FXCollections.observableArrayList();
         b=FXCollections.observableArrayList();
         try {
         	ResultSet durum1 = baglanti.VeriGetir("SELECT ders_kodu,ders_ad,ogretim_uyesi.ad,ogretim_uyesi.soyad from dersler,ogretim_uyesi,ogrenci_ders WHERE  ogrenci_ders.ders_id=dersler.id AND dersler.ogretim_uyesi_id=ogretim_uyesi.id and ogrenci_ders.ders_durumu=2 AND ogrenci_ders.ogrenci_id="+ogrenci_id);
          	ResultSet durum2 = baglanti.VeriGetir("SELECT ders_kodu,ders_ad,ogretim_uyesi.ad,ogretim_uyesi.soyad from dersler,ogretim_uyesi,ogrenci_ders WHERE  ogrenci_ders.ders_id=dersler.id AND dersler.ogretim_uyesi_id=ogretim_uyesi.id and ogrenci_ders.ders_durumu=1 AND ogrenci_ders.ogrenci_id="+ogrenci_id);
             while(durum1.next()) {
             	a.add(new DersEklemeVeriTuru(durum1.getString("ders_kodu"), durum1.getString("ders_ad"), durum1.getString("ad")+durum1.getString("soyad")));
             }
             while(durum2.next()) {
             	b.add(new DersEklemeVeriTuru(durum2.getString("ders_kodu"), durum2.getString("ders_ad"), durum2.getString("ad")+durum2.getString("soyad")));
             }
 		} catch (Exception e) {
 			System.out.println(e.getMessage().toString());
 		}
         
         
        tbl_onaybek.getItems().addAll(a);
        tbl_onaylanmamıs.getItems().addAll(b);
        
    }
    

}
