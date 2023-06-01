package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class OgretmenPanelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor_main;

    @FXML
    private Button btn_bilgiGoruntule;

    @FXML
    private Button btn_ders_programi;

    @FXML
    private Button btn_donem_islemleri;

    @FXML
    private Button btn_duyuru;

    @FXML
    private Button btn_kullanıcı;

    @FXML
    private Button btn_ogrenciDersEkleme;

    @FXML
    private Button btn_ogrenciDevamsizlik;

    @FXML
    private Button btn_ogrenciIslemleri;

    @FXML
    private Button btn_ogrenciNot;

    @FXML
    private Button btn_ogrenci_listele;

    @FXML
    private Button btn_sifreDegistir;

    @FXML
    private Button btn_verilendersler;

    @FXML
    private VBox pnl_donem;

    @FXML
    private VBox pnl_kullanici;

    @FXML
    private VBox pnl_ogrenci;

    @FXML
    void btn_bilgiGoruntule_Click(ActionEvent event) {
    	
try {
         	
         	
         	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("OgretmenBilgiGoruntule.fxml"));
         	
         	 AnchorPane pane = bilgi.load();
              OgretmenBilgiGoruntuleController bilgiler= bilgi.getController();
             bilgiler.bilgi_yaz(new OgretmenBilgi("aa", null, null, null, null, null, null));
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
			}



    }

    @FXML
    void btn_bilgiGoruntule_OffMouse(MouseEvent event) {
    	
    	btn_bilgiGoruntule.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_bilgiGoruntule_OnMouse(MouseEvent event) {
    	
    	btn_bilgiGoruntule.setStyle("-fx-background-color:#8B8E8E;");

    }
   
     ObservableList<DersProgrami> liste;
    @FXML
    void btn_ders_programi_Click(ActionEvent event) {
    	liste=FXCollections.observableArrayList();
        liste.add(new DersProgrami("9:30 - 10:20", "BM-102", "Bilgi Ağ", "A-102"));
        liste.add(new DersProgrami("10:30 - 11:20", "BM-102", "Bilgi Ağ", "A-102"));
    	
try {
         	
         	
         	FXMLLoader ders_programi = new FXMLLoader(getClass().getResource("OgretmenDersProgrami.fxml"));
         	
         	 AnchorPane pane = ders_programi.load();
              OgretmenDersProgramiController ders= ders_programi.getController();
             ders.Program_Ata(liste, liste, liste, liste, liste);
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
			}

    }

    @FXML
    void btn_ders_programi_OffMouse(MouseEvent event) {
    	
    	btn_ders_programi.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ders_programi_OnMouse(MouseEvent event) {
    	
    	btn_ders_programi.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_donem_islemleri_OffMouse(MouseEvent event) {
    	
    	btn_donem_islemleri.setStyle(" -fx-background-color: #55595a;");
    	
    	pnl_donem.setVisible(false);

    }

    @FXML
    void btn_donem_islemleri_OnMouse(MouseEvent event) {
    	
    	btn_donem_islemleri.setStyle("-fx-background-color:#8B8E8E;");
    	
    	pnl_donem.setVisible(true);

    }

    @FXML
    void btn_duyuru_Click(ActionEvent event) {
    	
    	
try {
         	
         	
         	FXMLLoader duyuru = new FXMLLoader(getClass().getResource("OgretmenDuyuruYap.fxml"));
         	
         	 AnchorPane pane = duyuru.load();
           //  OgretmenDuyuruYapController duy= duyuru.getController();
             
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
			}

    }

    @FXML
    void btn_duyuru_OffMouse(MouseEvent event) {
    	
    	btn_duyuru.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_duyuru_OnMouse(MouseEvent event) {
    	btn_duyuru.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_kullanıcı_OffMouse(MouseEvent event) {
    	btn_kullanıcı.setStyle(" -fx-background-color: #55595a;");
    	
    	pnl_kullanici.setVisible(false);

    }

    @FXML
    void btn_kullanıcı_OnMouse(MouseEvent event) {
    	btn_kullanıcı.setStyle("-fx-background-color:#8B8E8E;");
    	
    	pnl_kullanici.setVisible(true);

    }

    @FXML
    void btn_ogrenciDersEkleme_Click(ActionEvent event) {
    	
    	try {
         	
         	
         	FXMLLoader ogrenci = new FXMLLoader(getClass().getResource("OgrenciDersKayit.fxml"));
         	
         	 AnchorPane pane = ogrenci.load();
             OgrenciDersKayitController bilgiler = ogrenci.getController();
             bilgiler.ogretim_uyesi_id(1);
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
			}

    }

    @FXML
    void btn_ogrenciDersEkleme_OffMouse(MouseEvent event) {
    	
    	btn_ogrenciDersEkleme.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogrenciDersEkleme_OnMouse(MouseEvent event) {
    	btn_ogrenciDersEkleme.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

    }

    @FXML
    void btn_ogrenciDevamsizlik_Click(ActionEvent event) {

    }

    @FXML
    void btn_ogrenciDevamsizlik_OffMouse(MouseEvent event) {
    	
    	btn_ogrenciDevamsizlik.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogrenciDevamsizlik_OnMouse(MouseEvent event) {
    	
    	btn_ogrenciDevamsizlik.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_ogrenciIslemleri_OffMouse(MouseEvent event) {
    	
    	btn_ogrenciIslemleri.setStyle(" -fx-background-color: #55595a;");
    	
    	pnl_ogrenci.setVisible(false);

    }

    @FXML
    void btn_ogrenciIslemleri_OnMouse(MouseEvent event) {
    	
    	btn_ogrenciIslemleri.setStyle("-fx-background-color:#8B8E8E;");
    	
    	pnl_ogrenci.setVisible(true);

    }
    ObservableList<OgretmenNotGiris> a;
    
    @FXML
    void btn_ogrenciNot_Click(ActionEvent event) {
    	
try {
         	a = FXCollections.observableArrayList();
         	a.add(new OgretmenNotGiris(0, "15", "afad", "4684", "56468", "afsasdasd", "faadf", "asdasasdasd", "afdasd"));
         	a.add(new OgretmenNotGiris(0, "59+", "afad", "4684", "56468", "afsd", "faf", "asdasd", "afdasd"));
         	
         	FXMLLoader ogrenci = new FXMLLoader(getClass().getResource("OgretmenNotGiris.fxml"));
         	
         	 AnchorPane pane = ogrenci.load();
              OgretmenNotGirisController not = ogrenci.getController();
              not.deger_ata(a);
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage().toString());
			}

    	
    	

    }

    @FXML
    void btn_ogrenciNot_OffMouse(MouseEvent event) {
    	
    	btn_ogrenciNot.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogrenciNot_OnMouse(MouseEvent event) {
    	
    	btn_ogrenciNot.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_ogrenci_listele_Click(ActionEvent event) {
try {
         	
         	
         	FXMLLoader ogrenci = new FXMLLoader(getClass().getResource("OgretmenDanismanGetir.fxml"));
         	
         	 AnchorPane pane = ogrenci.load();
           //  OgretmenDanismanGetirController bilgiler = ogrenci.getController();
            // bilgiler.deger_Ata(null);
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage().toString());
			}

    }

    @FXML
    void btn_ogrenci_listele_OffMouse(MouseEvent event) {
    	
    	btn_ogrenci_listele.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogrenci_listele_OnMouse(MouseEvent event) {
    	
    	btn_ogrenci_listele.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_sifreDegistir_Click(ActionEvent event) {
    	
    	
try {
	    	
	    	FXMLLoader sifre = new FXMLLoader(getClass().getResource("OgretmenSifreDegistir.fxml"));
         	
        	 AnchorPane pane = sifre.load();
           
           
             
            anchor_main.getChildren().setAll(pane);
			
		
				
			} catch (Exception e) {
				// TODO: handle exception
			}

    }

    @FXML
    void btn_sifreDegistir_OffMouse(MouseEvent event) {
    	
    	btn_sifreDegistir.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

    }

    @FXML
    void btn_sifreDegistir_OnMouse(MouseEvent event) {
    	
    	btn_sifreDegistir.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

    }
     
    ObservableList<DersBilgileri> ab;
    
    @FXML
    void btn_verilendersler_Click(ActionEvent event) {
    	ab= FXCollections.observableArrayList();
    	ab.add(new DersBilgileri("asd", "des1", 1, 2));
    	ab.add(new DersBilgileri("adad", "hhh", 5, 2));
   	
   try {
         	
         	
         	FXMLLoader dersler = new FXMLLoader(getClass().getResource("OgretmenVerilenDersler.fxml"));
         	
         	 AnchorPane pane = dersler.load();
           OgretmenVerilenDerslerController ders = dersler.getController();
           ders.deger_Ata(ab);
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage().toString());
			}
    	

    }

    @FXML
    void btn_verilendersler_OffMouse(MouseEvent event) {
    	
    	btn_verilendersler.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

    }

    @FXML
    void btn_verilendersler_OnMouse(MouseEvent event) {
    	
    	btn_verilendersler.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

    }

    @FXML
    void pnl_donem_OffMouse(MouseEvent event) {
    	
    	pnl_donem.setVisible(false);

    }

    @FXML
    void pnl_donem_OnMouse(MouseEvent event) {
    	
    	pnl_donem.setVisible(true);

    }

    @FXML
    void pnl_kullanici_OffMouse(MouseEvent event) {
    	
    	pnl_kullanici.setVisible(false);

    }

    @FXML
    void pnl_kullanici_OnMouse(MouseEvent event) {
    	
    	pnl_kullanici.setVisible(true);

    }

    @FXML
    void pnl_ogrenci_OffMouse(MouseEvent event) {
    	pnl_ogrenci.setVisible(false);

    }

    @FXML
    void pnl_ogrenci_OnMouse(MouseEvent event) {
    	pnl_ogrenci.setVisible(true);

    }

    @FXML
    void initialize() {
        assert anchor_main != null : "fx:id=\"anchor_main\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_bilgiGoruntule != null : "fx:id=\"btn_bilgiGoruntule\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ders_programi != null : "fx:id=\"btn_ders_programi\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_donem_islemleri != null : "fx:id=\"btn_donem_islemleri\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_duyuru != null : "fx:id=\"btn_duyuru\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_kullanıcı != null : "fx:id=\"btn_kullanıcı\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ogrenciDersEkleme != null : "fx:id=\"btn_ogrenciDersEkleme\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ogrenciDevamsizlik != null : "fx:id=\"btn_ogrenciDevamsizlik\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ogrenciIslemleri != null : "fx:id=\"btn_ogrenciIslemleri\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ogrenciNot != null : "fx:id=\"btn_ogrenciNot\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_ogrenci_listele != null : "fx:id=\"btn_ogrenci_listele\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_sifreDegistir != null : "fx:id=\"btn_sifreDegistir\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert btn_verilendersler != null : "fx:id=\"btn_verilendersler\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert pnl_donem != null : "fx:id=\"pnl_donem\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert pnl_kullanici != null : "fx:id=\"pnl_kullanici\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";
        assert pnl_ogrenci != null : "fx:id=\"pnl_ogrenci\" was not injected: check your FXML file 'OgretmenPanel.fxml'.";

    }

}
