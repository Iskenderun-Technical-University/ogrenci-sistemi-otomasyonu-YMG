package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import com.Mysql.VeritabaniBaglanti;

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
    private ComboBox<String> combo_bolum;
    
    private ObservableList<Danisman> danismanlar;
    private ObservableList<Bolum> bolumler;
    
    private VeritabaniBaglanti baglanti =new VeritabaniBaglanti();

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
    	
    	if (txt_DersAdi.getText()=="" || txt_dersKodu.getText()=="" ||  txt_derslik.getText()=="") {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgilendirme");
    		alert.setHeaderText("Boş Değer bırakılamaz");
    		alert.setContentText("Lütfen Ders Bilgileri Boş Bırakmayınız.");
    		alert.showAndWait();
			
		}
    	else {
			if (combo_akts.getSelectionModel().getSelectedItem()== null || combo_kredi.getSelectionModel().getSelectedItem()==null || combo_labSaat.getSelectionModel().getSelectedItem()==null || combo_ogretimUyesi.getSelectionModel().getSelectedItem()==null || combo_sinif.getSelectionModel().getSelectedItem()==null || combo_teoSaat.getSelectionModel().getSelectedItem()==null || combo_uygSaat.getSelectionModel().getSelectedItem()==null || combo_zorunlulul.getSelectionModel().getSelectedItem()==null) {
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Bilgilendirme");
	    		alert.setHeaderText("Boş Değer bırakılamaz");
	    		alert.setContentText("Lütfen Seçilmesi Gereken Yerleri Boş Bırakmayınız.");
	    		alert.showAndWait();
			}
			else {
				String[] ad_soyad = combo_ogretimUyesi.getSelectionModel().getSelectedItem().split(" ");
				String ad = ad_soyad[0];
				String soyad = ad_soyad[1];
				int  id = 0;
				int bol_id=0;
				
				for(int i=0;i<danismanlar.size();i++) {
					if (danismanlar.get(i).getDanısman_Ad().equals(ad) && danismanlar.get(i).getDanısman_SoyAd().equals(soyad)) {
						id = danismanlar.get(i).getId();
					}
				}
				
				for(int i=0;i<bolumler.size();i++) {
					if (bolumler.get(i).getBolum_ad().equals(combo_bolum.getSelectionModel().getSelectedItem())) {
						bol_id = bolumler.get(i).getId();
					}
				}
				
				
				String  sql = "insert into dersler (ders_kodu,derslik,ders_ad,sinif,uyg_saat,lab_saat,teo_saat,zorunlu ,kredi,akts,ogretim_uyesi_id,bolum_id) values (?,?,?,?,?,?,?,?,?,?,?,?) ";
				baglanti.Insert(sql, txt_dersKodu.getText(), txt_derslik.getText(), txt_DersAdi.getText(), combo_sinif.getSelectionModel().getSelectedItem(), combo_uygSaat.getSelectionModel().getSelectedItem(), combo_labSaat.getSelectionModel().getSelectedItem(), combo_teoSaat.getSelectionModel().getSelectedItem(), combo_zorunlulul.getSelectionModel().getSelectedItem(), combo_kredi.getSelectionModel().getSelectedItem(), combo_akts.getSelectionModel().getSelectedItem(), id,bol_id);
			}
			Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgilendirme");
    		alert.setHeaderText("Başarılı");
    		alert.setContentText("Ders Başarıyla Kaydedildi.");
    		alert.showAndWait();
		}

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
        bolumler = FXCollections.observableArrayList();
        for(int i=1;i<21;i++) {
        	combo_akts.getItems().add(i);
        	
        	if (i<11) {
				combo_kredi.getItems().add(i);
				
			}
        	if (i<12) {
        		combo_labSaat.getItems().add(i-1);
				combo_teoSaat.getItems().add(i-1);
				combo_uygSaat.getItems().add(i-1);
			}
        	
        	if (i<6) {
				combo_sinif.getItems().add(i);
			}
        }
        
        combo_zorunlulul.getItems().addAll("Z","S");
        
     // veritabanından ogretim üyesi ad soyad ve id çekilecek  ad soyad birleştirilip ogretim uyesi comboboxına atanacak
        
        this.danismanlar=FXCollections.observableArrayList();
        
        
        try {
        	VeritabaniBaglanti baglan = new VeritabaniBaglanti();
            ResultSet danisman = baglan.VeriGetir("select id,ad,soyad from ogretim_uyesi");
            while(danisman.next()) {
            	danismanlar.add(new Danisman(danisman.getInt("id"), danisman.getString("ad"), danisman.getString("soyad")));
            }
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        
        for (Danisman danisman : danismanlar) {
        	combo_ogretimUyesi.getItems().add(danisman.getDanısman_Ad()+" "+danisman.getDanısman_SoyAd());
		}
    	 
        try {
			
        	
        	
        	 VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
           	 ResultSet veritabani_bolumler = baglanti.VeriGetir("select *from Bolum");
           	 while(veritabani_bolumler.next()) {
           		 bolumler.add(new Bolum(veritabani_bolumler.getInt("id"), veritabani_bolumler.getString("bolum_ad")));
           	 }
           	for(Bolum bol : bolumler) {
              	 combo_bolum.getItems().add(bol.getBolum_ad());
               }
        	
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        
    }
    
   /* public void danısman_ata(ObservableList<Danisman> danismanlar) {
    	combo_ogretimUyesi=new ComboBox<>();
    	this.danismanlar=FXCollections.observableArrayList();
    	this.danismanlar=danismanlar;
    	  for(Danisman dan : danismanlar) {
         	combo_ogretimUyesi.getItems().add(dan.getDanısman_Ad()+" "+dan.getDanısman_SoyAd());
         	 
         	 
          }
    }
    */

}
