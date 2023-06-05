package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;
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
    
    private int ogretim_id;
    
    
    private VeritabaniBaglanti baglanti =  new VeritabaniBaglanti();

    @FXML
    void btn_bilgiGoruntule_Click(ActionEvent event) {
    	
try {
         	
         	
         	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("OgretmenBilgiGoruntule.fxml"));
         	
         	 AnchorPane pane = bilgi.load();
              OgretmenBilgiGoruntuleController bilgiler= bilgi.getController();
              
              ResultSet veriler = baglanti.VeriGetir("select ad,soyad,kullanici_ad,bolum,fakulte,mail,adres from ogretim_uyesi where id="+String.valueOf(ogretim_id));
              if (veriler.next()) {
            	  bilgiler.bilgi_yaz(new OgretmenBilgi(veriler.getString("ad"), veriler.getString("soyad"), veriler.getString("kullanici_ad"), veriler.getString("bolum"),veriler.getString("fakulte"), veriler.getString("mail"), veriler.getString("adres")));
			}
             
              
             anchor_main.getChildren().setAll(pane);
 			
 		
				
			} catch (Exception e) {
				System.out.println(e.getMessage().toString());
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
   
     ObservableList<DersProgrami> pazartesi;
     ObservableList<DersProgrami> sali;
     ObservableList<DersProgrami> carsamba;
     ObservableList<DersProgrami> persembe;
     ObservableList<DersProgrami> cuma;
    @FXML
    void btn_ders_programi_Click(ActionEvent event) {
    	pazartesi=FXCollections.observableArrayList();
    	sali=FXCollections.observableArrayList();
    	carsamba=FXCollections.observableArrayList();
    	persembe=FXCollections.observableArrayList();
    	cuma=FXCollections.observableArrayList();
        
    	
try {
         	ResultSet dersprogrami=baglanti.VeriGetir("select ders_ad,ders_kodu,derslik,bas_saat,bit_saat,haftanin_gunu from ders_programi,dersler where ders_programi.ders_id=dersler.id and dersler.ogretim_uyesi_id="+ogretim_id);
         	while(dersprogrami.next()) {
         		if (dersprogrami.getInt("haftanin_gunu")==0) {
					pazartesi.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik")));
				}
         		if (dersprogrami.getInt("haftanin_gunu")==1) {
					sali.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik")));
				}
         		if (dersprogrami.getInt("haftanin_gunu")==2) {
					carsamba.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik")));
				}
         		if (dersprogrami.getInt("haftanin_gunu")==3) {
					persembe.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik")));
				}
         		if (dersprogrami.getInt("haftanin_gunu")==4) {
					cuma.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik")));
				}
         		
         	}
         	FXMLLoader ders_programi = new FXMLLoader(getClass().getResource("OgretmenDersProgrami.fxml"));
         	
         	 AnchorPane pane = ders_programi.load();
              OgretmenDersProgramiController ders= ders_programi.getController();
             ders.Program_Ata(pazartesi, sali, carsamba, persembe, cuma);
              
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
         	
         	ResultSet notlar = baglanti.VeriGetir("select ogrenci_bilgi.numara,ogrenci_bilgi.ad,ogrenci_bilgi.soyad,dersler.ders_ad,vize,final,butunleme,sonuc,harf_notu from dersler,ogrenci_bilgi,ogrenci_ders where ogrenci_ders.ogrenci_id=ogrenci_bilgi.id and ogrenci_ders.ders_id=dersler.id and ogrenci_ders.ders_durumu=3 and dersler.ogretim_uyesi_id="+String.valueOf(ogretim_id));
         	while(notlar.next()) {
         		a.add(new OgretmenNotGiris(notlar.getInt("numara"), notlar.getString("ad"), notlar.getString("soyad"), notlar.getString("ders_ad"), notlar.getString("vize"), notlar.getString("final"), notlar.getString("butunleme"), notlar.getString("sonuc"), notlar.getString("harf_notu")));
         		
         	}
         	
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
         	
         	
         	FXMLLoader dan = new FXMLLoader(getClass().getResource("OgretmenDanismanGetir.fxml"));
         	
         	 AnchorPane pane = dan.load();
         
             OgretmenDanismanGetirController bil = dan.getController();
             bil.deger_Ata(ogretim_id);
              
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
           
           OgretmenSifreDegistirController ogsifre = sifre.getController();
           ogsifre.id_Ata(ogretim_id);
           System.out.println(ogretim_id);
           
          
          
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
    	
   	
   try {
         	ResultSet icerik = baglanti.VeriGetir("select ders_ad,ders_kodu,kredi,sinif from dersler where ogretim_uyesi_id="+String.valueOf(ogretim_id));
         	while(icerik.next()) {
         		ab.add(new DersBilgileri(icerik.getString("ders_kodu"), icerik.getString("ders_ad"), icerik.getInt("sinif"), icerik.getInt("kredi")));
         	}
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
    
    public void setOgretim_id(int ogretim_id) {
		this.ogretim_id=ogretim_id;
	}
    
    public int getOgretim_id() {
    	return this.ogretim_id;
    }

}
