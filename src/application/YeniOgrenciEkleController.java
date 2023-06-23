package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class YeniOgrenciEkleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_kaydet;

    @FXML
    private ComboBox<String> combo_Bolum;

    @FXML
    private ComboBox<String> combo_Danısman1;

    @FXML
    private ComboBox<String> combo_Danısman2;

    @FXML
    private ComboBox<String> combo_Fakülte;
    
    @FXML
    private ComboBox<Integer> combo_ogretim;

    @FXML
    private ComboBox<Integer> combo_sinif;

    @FXML
    private TextField txt_OgrAd;

    @FXML
    private TextField txt_OgrMail;

    @FXML
    private TextField txt_OgrNum;

    @FXML
    private TextField txt_OgrSifre;

    @FXML
    private TextField txt_OgrSoyad;

    @FXML
    private TextField txt_OgrTc;

    @FXML
    private TextArea txt_area_OgrAdres;
    
    private VeritabaniBaglanti baglanti =new VeritabaniBaglanti();
    private MD5_Sifrele sifrele = new MD5_Sifrele();

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
              // combo boxda seçilen danısmanın id si getirilip o şekilde veritabanına aktarılacak
    	
    	if (txt_OgrAd.getText()=="" || txt_OgrSoyad.getText()=="" || txt_OgrSifre.getText()=="" || txt_OgrTc.getText()=="" || txt_area_OgrAdres.getText()=="" || txt_OgrMail.getText()=="" || txt_OgrNum.getText()=="" ) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgilendirme");
    		alert.setHeaderText("Boş Değer bırakılamaz");
    		alert.setContentText("Lütfen Öğrenci Bilgilerini Boş Bırakmayınız.");
    		alert.showAndWait();
		}
    	else {
			if (combo_Bolum.getSelectionModel().getSelectedItem()==null || combo_Danısman1.getSelectionModel().getSelectedItem()==null || combo_Danısman2.getSelectionModel().getSelectedItem()==null || combo_Fakülte.getSelectionModel().getSelectedItem()==null || combo_ogretim.getSelectionModel().getSelectedItem()==null || combo_sinif.getSelectionModel().getSelectedItem()==null) {
				Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Bilgilendirme");
	    		alert.setHeaderText("Boş Değer bırakılamaz");
	    		alert.setContentText("Lütfen Seçilmesi Gereken Yerleri Boş Bırakmayınız.");
	    		alert.showAndWait();
			}
			else {
				if (txt_OgrTc.getText().length()==11) {
					if (txt_OgrMail.getText().contains("@iste.edu.tr")) {
						if (txt_OgrNum.getText().length()==9) {
							String[] ad_soyad1 = combo_Danısman1.getSelectionModel().getSelectedItem().split(" ");
							String[] ad_soyad2= combo_Danısman2.getSelectionModel().getSelectedItem().split(" ");
							String ad1 = ad_soyad1[0];
							String ad2= ad_soyad2[0];
							String soyad2 =ad_soyad2[1];
							String soyad1 = ad_soyad1[1];
							
							int  id1 = 0;
							int  id2 = 0;
							
							for(int i=0;i<danismanlar.size();i++) {
								if (danismanlar.get(i).getDanısman_Ad().equals(ad1) && danismanlar.get(i).getDanısman_SoyAd().equals(soyad1)) {
									id1 = danismanlar.get(i).getId();
								}
								if (danismanlar.get(i).getDanısman_Ad().equals(ad2) && danismanlar.get(i).getDanısman_SoyAd().contentEquals(soyad2)) {
									 id2=danismanlar.get(i).getId();
								}
							}
							
							try {
			                      String sql ="insert into ogrenci_bilgi (numara,ad,soyad,tc,sifre,fakulte,bolum,ogretim,sınıf,mail,adres,danisman_id1,danisman_id2) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			                      
			                      baglanti.Insert(sql, Integer.parseInt(txt_OgrNum.getText()), txt_OgrAd.getText(), txt_OgrSoyad.getText(), txt_OgrTc.getText(), sifrele.getMd5(txt_OgrSifre.getText()), combo_Fakülte.getSelectionModel().getSelectedItem(), combo_Bolum.getSelectionModel().getSelectedItem(), combo_ogretim.getSelectionModel().getSelectedItem(), combo_sinif.getSelectionModel().getSelectedItem(), txt_OgrMail.getText(), txt_area_OgrAdres.getText(), id1, id2);
			                      Alert alert = new Alert(AlertType.INFORMATION);
						    		alert.setTitle("Bilgilendirme");
						    		alert.setHeaderText("Başarılı");
						    		alert.setContentText("Öğrenci Sisteme Başarılı Bir Şekilde Kaydedildi.");
						    		alert.showAndWait();
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						else {
							Alert alert = new Alert(AlertType.INFORMATION);
				    		alert.setTitle("Bilgilendirme");
				    		alert.setHeaderText("Yanlış Format");
				    		alert.setContentText("Lütfen okul Numarasını Doğru Giriniz.");
				    		alert.showAndWait();
						}
						
					}
					else {
						Alert alert = new Alert(AlertType.INFORMATION);
			    		alert.setTitle("Bilgilendirme");
			    		alert.setHeaderText("Yanlış Format");
			    		alert.setContentText("Mail adresi @iste.edu.tr İle Bitmelidir.");
			    		alert.showAndWait();
					}
					
					
				}
				else {
					Alert alert = new Alert(AlertType.INFORMATION);
		    		alert.setTitle("Bilgilendirme");
		    		alert.setHeaderText("Yanlış Format");
		    		alert.setContentText("Lütfen Tc Kimlik Numarasını doğru giriniz.");
		    		alert.showAndWait();
				}
				
				
				
				
			}
		}
    	
    }
    
    
   
    private ObservableList<Danisman> danismanlar;
    

    @FXML
    void initialize() {
        assert btn_kaydet != null : "fx:id=\"btn_kaydet\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_Bolum != null : "fx:id=\"combo_Bolum\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_Danısman1 != null : "fx:id=\"combo_Danısman1\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_Danısman2 != null : "fx:id=\"combo_Danısman2\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_Fakülte != null : "fx:id=\"combo_Fakülte\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_ogretim != null : "fx:id=\"combo_ogretim\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert combo_sinif != null : "fx:id=\"combo_sinif\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrAd != null : "fx:id=\"txt_OgrAd\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrMail != null : "fx:id=\"txt_OgrMail\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrNum != null : "fx:id=\"txt_OgrNum\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrSifre != null : "fx:id=\"txt_OgrSifre\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrSoyad != null : "fx:id=\"txt_OgrSoyad\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_OgrTc != null : "fx:id=\"txt_OgrTc\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        assert txt_area_OgrAdres != null : "fx:id=\"txt_area_OgrAdres\" was not injected: check your FXML file 'YeniOgrenciEkle.fxml'.";
        
        
        
        for(int i =1;i<5;i++) {
        	combo_sinif.getItems().add(i);
        	
        	if (i<3) {
				combo_ogretim.getItems().add(i);
			}
        	
        	
        }
        
         
       
        
        
        
        
    }
    public void fak_ata(ObservableList<Fakulte> fakulteler) {
    	
    	 for (Fakulte fak : fakulteler) {
 			combo_Fakülte.getItems().add(fak.getFak_ad());
 		}
    }
    
    public void bolum_ata(ObservableList<Bolum> bolumler) {
    
    	for(Bolum bol : bolumler) {
       	 combo_Bolum.getItems().add(bol.getBolum_ad());
        }
    }
    
    public void danısman_ata(ObservableList<Danisman> danismanlar) {
    	this.danismanlar=FXCollections.observableArrayList();
    	this.danismanlar=danismanlar;
    	  for(Danisman dan : danismanlar) {
         	 combo_Danısman1.getItems().add(dan.getDanısman_Ad()+" "+dan.getDanısman_SoyAd());
         	 combo_Danısman2.getItems().add(dan.getDanısman_Ad()+" "+dan.getDanısman_SoyAd());
         	 
          }
    }
    
    

}

// ince 400 kalın 500 yatak
