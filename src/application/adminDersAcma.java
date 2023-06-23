package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import com.Mysql.VeritabaniBaglanti;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class adminDersAcma {
	
	private String secilen_ders;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kayit;

    @FXML
    private ComboBox<String> combo_ders;
    
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();

    @FXML
    void btn_kayit_Click(ActionEvent event) {
       if (secilen_ders==null) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Ders şeçilmedi");
		alert.setHeaderText("Dikkat");
		alert.setContentText("Lütfen Bir Ders Seçiniz.");
		alert.showAndWait();
	}
       else {
    	   
    	   if (kayitKontrol() ) {
    		   Alert alert = new Alert(AlertType.INFORMATION);
         		alert.setTitle("Ders Kayıtlı");
         		alert.setHeaderText("Hata");
         		alert.setContentText("Ders Kayıdı Daha Önce Açılmış.");
         		alert.showAndWait();
		
		}
    	   else {
    		   String sql ="select ogrenci_bilgi.id,dersler.id from ogrenci_bilgi,dersler,bolum WHERE dersler.bolum_id=bolum.id AND ogrenci_bilgi.bolum=bolum.bolum_ad AND dersler.ders_ad='"+secilen_ders+"'";
        	   try {
    			ResultSet ogrenciler=baglanti.VeriGetir(sql);
    			while(ogrenciler.next()) {
    				baglanti.Insert("insert into ogrenci_ders (ogrenci_id,ders_id,ders_durumu) values (?,?,?)",ogrenciler.getInt("ogrenci_bilgi.id"),ogrenciler.getInt("dersler.id"),1);
    			}
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
        	   Alert alert = new Alert(AlertType.INFORMATION);
          		alert.setTitle("Ders Kaydı Açıldı");
          		alert.setHeaderText("Başarılı");
          		alert.setContentText("Ders Kayıt Başarılı Bir Şekilde Açıldı.");
          		alert.showAndWait();
		}
		
    	  
    	   
    	 
	}
       
       
    }

    @FXML
    void combo_ders_Action(ActionEvent event) {
    secilen_ders=combo_ders.getSelectionModel().getSelectedItem();
    }

    @FXML
    void initialize() {
        assert btn_kayit != null : "fx:id=\"btn_kayit\" was not injected: check your FXML file 'AdminDersAcma.fxml'.";
        assert combo_ders != null : "fx:id=\"combo_ders\" was not injected: check your FXML file 'AdminDersAcma.fxml'.";
        
 	   try {
			ResultSet dersler = baglanti.VeriGetir("select ders_ad from dersler");
			while(dersler.next()) {
				combo_ders.getItems().add(dersler.getString("ders_ad"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    private Boolean kayitKontrol() {
    	boolean donus=false;
    	int der_id=0;
    	try {
			ResultSet get = baglanti.VeriGetir("select id from dersler where ders_ad='"+secilen_ders+"'");
			if (get.next()) {
				der_id=get.getInt("id");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
    	
    	try {
			ResultSet var = baglanti.VeriGetir("select * from ogrenci_ders where ders_id="+der_id);
			if (var.next()) {
			donus=true;	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
    	return donus;
    }

}
