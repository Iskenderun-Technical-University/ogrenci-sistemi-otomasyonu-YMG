package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;

public class YeniDersProgramiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_programEkle;

    @FXML
    private ComboBox<String> combo_bolum;

    @FXML
    private ComboBox<String> combo_dersAdi;

    @FXML
    private ComboBox<String> combo_dk1;

    @FXML
    private ComboBox<String> combo_dk2;

    @FXML
    private ComboBox<String> combo_haftanınGünü;

    @FXML
    private ComboBox<Integer> combo_ogretim;

    @FXML
    private ComboBox<String> combo_saat1;

    @FXML
    private ComboBox<String> combo_saat2;

    @FXML
    private ComboBox<Integer> combo_sinif;
    
    private int secilen_gun=0;
    private String bas_saat="";
    private String bit_saat="";
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    private ObservableList<Dersler> ders;
    private int der_id =0;

    @FXML
    void btn_programEkle_Click(ActionEvent event) {
           // girilen bilgiler veritabanına eklenecek
    	
    	if (combo_bolum.getSelectionModel().getSelectedItem()==null || combo_dersAdi.getSelectionModel().getSelectedItem()==null || combo_dk1.getSelectionModel().getSelectedItem()==null || combo_dk2.getSelectionModel().getSelectedItem()==null || combo_haftanınGünü.getSelectionModel().getSelectedItem()==null || combo_ogretim.getSelectionModel().getSelectedItem()==null || combo_saat1.getSelectionModel().getSelectedItem()==null || combo_saat2.getSelectionModel().getSelectedItem()==null || combo_sinif.getSelectionModel().getSelectedItem()==null ) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgilendirme");
    		alert.setHeaderText("Boş Değer bırakılamaz");
    		alert.setContentText("Lütfen Bilgilerin Hepsinin Seçimini Yapınız.");
    		alert.showAndWait();
		}
    	else {
			secilen_gun=combo_haftanınGünü.getSelectionModel().getSelectedIndex();
			bas_saat = combo_saat1.getSelectionModel().getSelectedItem() + ":" + combo_dk1.getSelectionModel().getSelectedItem();
			bit_saat = combo_saat2.getSelectionModel().getSelectedItem() + ":" + combo_dk2.getSelectionModel().getSelectedItem();
			for(int  i=0;i<ders.size();i++) {
		       if (ders.get(i).getDers_adı().equals(combo_dersAdi.getSelectionModel().getSelectedItem())) {
				der_id=ders.get(i).getId();
			}
				
			}
			try {
				String sql = "insert into ders_programi (bolum,sinif,ogretim,bas_saat,bit_saat,haftanin_gunu,ders_id) values (?,?,?,?,?,?,?)";
				baglanti.Insert(sql, combo_bolum.getSelectionModel().getSelectedItem(), combo_sinif.getSelectionModel().getSelectedItem(), combo_ogretim.getSelectionModel().getSelectedItem(), bas_saat, bit_saat, secilen_gun,der_id);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgilendirme");
    		alert.setHeaderText("İşlem Başarılı");
    		alert.setContentText("Sisteme Yeni Ders Programı Eklendi");
    		alert.showAndWait();
			
		}
    }
    
    @FXML
    void initialize() {
        assert btn_programEkle != null : "fx:id=\"btn_programEkle\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_bolum != null : "fx:id=\"combo_bolum\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dersAdi != null : "fx:id=\"combo_dersAdi\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dk1 != null : "fx:id=\"combo_dk1\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dk2 != null : "fx:id=\"combo_dk2\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_haftanınGünü != null : "fx:id=\"combo_haftanınGünü\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_ogretim != null : "fx:id=\"combo_ogretim\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_saat1 != null : "fx:id=\"combo_saat1\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_saat2 != null : "fx:id=\"combo_saat2\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_sinif != null : "fx:id=\"combo_sinif\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        
        for(int i=0;i <59;i++) {
        	if (i%5==0) {
				if (i<10) {
					combo_dk1.getItems().add("0"+String.valueOf(i));
					combo_dk2.getItems().add("0"+String.valueOf(i));
				}
				else {
					combo_dk1.getItems().add(String.valueOf(i));
					combo_dk2.getItems().add(String.valueOf(i));
				}
			}
        	if (i<24) {
        		if (i<10) {
        			combo_saat1.getItems().add("0"+String.valueOf(i));
        			combo_saat2.getItems().add("0"+String.valueOf(i));
					
				}
        		else {
        			combo_saat1.getItems().add(String.valueOf(i));
        			combo_saat2.getItems().add(String.valueOf(i));
        		}
				
			}
        	if (i<4) {
        		combo_sinif.getItems().add(i+1);
				
			}
        	if (i<2) {
        		combo_ogretim.getItems().add(i+1);
			}
        	
        	
        }
        combo_haftanınGünü.getItems().add("Pazartesi");
        combo_haftanınGünü.getItems().add("Salı");
        combo_haftanınGünü.getItems().add("Çarşamba");
        combo_haftanınGünü.getItems().add("Perşembe");
        combo_haftanınGünü.getItems().add("Cuma");
    }
    
   
   
   public void bolum_ata(ObservableList<Bolum> bolumler) {
   	
   	for(Bolum bol : bolumler) {
      	 combo_bolum.getItems().add(bol.getBolum_ad());
       }
   }
   
   public void ders_ata(ObservableList<Dersler> ders) {
	   this.ders=ders;
	   for(Dersler der : ders) {
		   combo_dersAdi.getItems().add(der.getDers_adı());
	   }
   }
   

}

