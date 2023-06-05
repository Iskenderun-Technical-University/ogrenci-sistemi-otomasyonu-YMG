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



public class OgrenciPanelController {

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    

	    @FXML
	    private Button btn_donem;

	    @FXML
	    private Button btn_genel;
	    
	    @FXML
	    private Button btn_trans;


	    @FXML
	    private Button btn_kullanıcı;

	    @FXML
	    private Button btn_staj;


	    

	    @FXML
	    private VBox pnl_donem;

	    @FXML
	    private VBox pnl_genel;
	    
	    @FXML
	    private VBox pnl_kullanıcı;

	    @FXML
	    private VBox pnl_staj;

	 
	    @FXML
	    private Button btn_danısman;
	    

	    
	    
	    @FXML
	    private Button btn_ders_programı;
	    
	    @FXML
	    private Button btn_duyurular;
	    
	    @FXML
	    private AnchorPane anchor_main;
	    

	    @FXML
	    private Button btn_notlar;
	    
	    @FXML
	    private Button btn_dersEkle;
	    
	    @FXML
	    private Button btn_stajbasvuru;

	    @FXML
	    private Button btn_stajdurumu;
	    
	    @FXML
	    private Button btn_sifredegistir;
	    
	    @FXML
	    private Button btn_maildegistir;
	    

	    @FXML
	    private Button btn_bilgigoruntule;
	    
	    private int ogrenci_id; 
	    
	    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
	    
	    @FXML
	    void btn_bilgigoruntule_Click(ActionEvent event) {
	    	
	    
	    	 try {
	             	
	             	
	             	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("OgrenciBilgiGoruntule.fxml"));
	             	
	             	 AnchorPane pane = bilgi.load();
	                 OgrenciBilgiGoruntuleController bilgiler = bilgi.getController();
	                 ResultSet bilgi_getir = baglanti.VeriGetir("select ad,soyad,numara,tc,mail,adres,sınıf from ogrenci_bilgi where id="+ogrenci_id);
	                 if (bilgi_getir.next()) {
						OgrenciBilgiGoruntule bilgi1 = new OgrenciBilgiGoruntule(bilgi_getir.getString("ad"),bilgi_getir.getString("soyad"),bilgi_getir.getInt("numara"),bilgi_getir.getString("tc"),bilgi_getir.getString("mail"),bilgi_getir.getString("adres"),bilgi_getir.getInt("sınıf"));
						bilgiler.bilgi_getir(bilgi1);
					}
	                 
	                  
	                 anchor_main.getChildren().setAll(pane);
	     			
	     		
						
					} catch (Exception e) {
						// TODO: handle exception
					}

	    }

	    @FXML
	    void btn_bilgigoruntule_OffMouse(MouseEvent event) {
	    	btn_bilgigoruntule.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_bilgigorumtule_OnMouse(MouseEvent event) {
	    	btn_bilgigoruntule.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    @FXML
	    void btn_maildegistir_Click(ActionEvent event) {
	    	try {
             	
             	
             	FXMLLoader mailadresi = new FXMLLoader(getClass().getResource("OgrenciMailDegistir.fxml"));
             	
             	 AnchorPane pane = mailadresi.load();
                
                
                  OgrenciMailDegistirController mail = mailadresi.getController();
                  mail.id_Ata(ogrenci_id);
                 anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					// TODO: handle exception
				}

	    }

	    @FXML
	    void btn_maildegistir_OffMouse(MouseEvent event) {
	    	btn_maildegistir.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_maildegistir_OnMouse(MouseEvent event) {
	    	btn_maildegistir.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    @FXML
	    void btn_sifredegistir_Click(ActionEvent event) {
	    	
	    	try {
	    	
	    	FXMLLoader sifre = new FXMLLoader(getClass().getResource("OgrenciSifreDegistir.fxml"));
         	
        	 AnchorPane pane = sifre.load();
           OgrenciSifreDegistirController deg =sifre.getController();
           deg.id_Ata(ogrenci_id);
           
             
            anchor_main.getChildren().setAll(pane);
			
		
				
			} catch (Exception e) {
				// TODO: handle exception
			}

	    }

	    @FXML
	    void btn_sifredegistir_OffMouse(MouseEvent event) {
	    	btn_sifredegistir.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_sifredegistir_OnMouse(MouseEvent event) {
	    	btn_sifredegistir.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

	    }
	    
	   
	    
	    @FXML
	    void btn_stajbasvuru_Click(ActionEvent event) {
	    	

	    }

	    @FXML
	    void btn_stajbasvuru_OffMouse(MouseEvent event) {
	    	btn_stajbasvuru.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_stajbasvuru_OnMouse(MouseEvent event) {
	    	btn_stajbasvuru.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

	    }

	    @FXML
	    void btn_stajdurumu_Click(ActionEvent event) {
	    	
	    	



	    }

	    @FXML
	    void btn_stajdurumu_OffMouse(MouseEvent event) {
	    	btn_stajdurumu.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_stajdurumu_OnMouse(MouseEvent event) {
	    	btn_stajdurumu.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    ObservableList<DersEklemeVeriTuru> a,b;
	    
	    @FXML
	    void btn_dersEkle_Click(ActionEvent event) {
	    	
	    	
	    	 try {
             	
             	
             	FXMLLoader ders_ekle = new FXMLLoader(getClass().getResource("OgrenciDersEkleme.fxml"));
             	
             	 AnchorPane pane = ders_ekle.load();
                 OgrenciDersEklemeController ders = ders_ekle.getController();
                
                  ders.ogr_id(ogrenci_id);
                 anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					System.out.println(e.getMessage().toString());
				}

	    }

	    @FXML
	    void btn_dersEkle_OffMouse(MouseEvent event) {
	    	btn_dersEkle.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_dersEkle_OnMouse(MouseEvent event) {
	    	btn_dersEkle.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");

	    }
	    
	    
	    ObservableList<NotBilgisiTranskript> bilgiler;
	    
	    @FXML
	    void btn_trans_Click(ActionEvent event) {
	    	bilgiler=FXCollections.observableArrayList();
	    
	    	
             try {
             	
             	
             	FXMLLoader transkript = new FXMLLoader(getClass().getResource("OgrenciTranskript.fxml"));
             	ResultSet trant = baglanti.VeriGetir("SELECT ders_ad,vize,final,butunleme,sonuc,harf_notu,kredi,akts FROM ogrenci_ders,dersler WHERE ogrenci_ders.ders_id=dersler.id AND ders_durumu=4 AND ogrenci_ders.ogrenci_id="+ogrenci_id);
             	while(trant.next()) {
             		bilgiler.add(new NotBilgisiTranskript(trant.getString("ders_ad"), trant.getString("vize"), trant.getString("final"), trant.getString("butunleme"), trant.getString("sonuc"), trant.getString("harf_notu"), trant.getInt("kredi"), trant.getInt("akts")));
             	}
             	 AnchorPane pane = transkript.load();
                 OgrenciTranskriptController trans = transkript.getController();
                trans.Transkrip_ata(bilgiler);
                 
                  
                 anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

	    }

	    @FXML
	    void btn_trans_OffMouse(MouseEvent event) {
	    	btn_trans.setStyle(" -fx-background-color: #55595a;");
	    }

	    @FXML
	    void btn_trans_OnMouse(MouseEvent event) {
	    	btn_trans.setStyle("-fx-background-color:#8B8E8E;");

	    }

	    
	    ObservableList<NotBilgisi> liste1;
	    
	    @FXML
	    void btn_notlar_Click(ActionEvent event) {
	    	liste1 = FXCollections.observableArrayList();
	    	
	    	
	    	
	    	 try {
	             	ResultSet not_getir = baglanti.VeriGetir("select ders_ad,vize,final,butunleme,sonuc,harf_notu FROM ogrenci_ders,dersler WHERE ogrenci_ders.ders_id=dersler.id AND ders_durumu=3 AND ogrenci_ders.ogrenci_id="+ogrenci_id);
	             	while(not_getir.next()) {
	             		liste1.add(new NotBilgisi(not_getir.getString("ders_ad"), not_getir.getString("vize"), not_getir.getString("final"), not_getir.getString("butunleme"), not_getir.getString("sonuc"), not_getir.getString("harf_notu")));
	             	}
	             	FXMLLoader notlar = new FXMLLoader(getClass().getResource("OgrenciNot.fxml"));
	             	
	             	 AnchorPane pane = notlar.load();
	                 OgrenciNotController not = notlar.getController();
	                 not.not_Goster(liste1);
	                 
	                  
	                 anchor_main.getChildren().setAll(pane);
	     			
	     		
						
					} catch (Exception e) {
						// TODO: handle exception
					}


	    }

	    @FXML
	    void btn_notlar_OffMouse(MouseEvent event) {
	    	btn_notlar.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_notlar_OnMouse(MouseEvent event) {
	    	btn_notlar.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    ObservableList<DersProgrami> liste;
	  
	    private ObservableList<DanismanBilgileri> danis;

	  @FXML
	  void btn_danısman_Click(ActionEvent event) {
		  danis=FXCollections.observableArrayList();
                try {
                	ResultSet danismanlar = baglanti.VeriGetir("select ogretim_uyesi.ad,ogretim_uyesi.soyad,ogretim_uyesi.fakulte,ogretim_uyesi.bolum,ogretim_uyesi.mail FROM ogretim_uyesi,ogrenci_bilgi WHERE ogrenci_bilgi.danisman_id1=ogretim_uyesi.id OR ogrenci_bilgi.danisman_id2=ogretim_uyesi.id AND ogrenci_bilgi.id="+ogrenci_id);
                	while(danismanlar.next()) {
                	danis.add(new DanismanBilgileri(danismanlar.getString("ad"), danismanlar.getString("soyad"), danismanlar.getString("fakulte"), danismanlar.getString("bolum"), danismanlar.getString("mail")));
                	}
                	FXMLLoader danısmanbilgi = new FXMLLoader(getClass().getResource("OgrenciDanismanBilgileri.fxml"));
                	
                	AnchorPane pane = danısmanbilgi.load();
                    	OgrenciDanismanBilgileriController dcont = danısmanbilgi.getController();
                   dcont.Danısman1_Yazdır(danis.get(0).getDanisman_ad(),danis.get(0).getDanisman_soyad(),danis.get(0).getFakulte(),danis.get(0).getBolum(),danis.get(0).getMail());
                   dcont.Danısman2_Yazdır(danis.get(1).getDanisman_ad(),danis.get(1).getDanisman_soyad(),danis.get(1).getFakulte(),danis.get(1).getBolum(),danis.get(1).getMail());
                	anchor_main.getChildren().setAll(pane);
        			
        		
					
				} catch (Exception e) {
					// TODO: handle exception
				}
	    }

	 @FXML
	 void btn_danısman_OffMouse(MouseEvent event) {
		 
		 btn_danısman.setStyle("-fx-background-radius:  0 20 0 0; -fx-background-color: #55595a;");
		
	    }

	 @FXML
	 void btn_danısman_OnMouse(MouseEvent event) {
		 btn_danısman.setStyle("-fx-background-color:#8B8E8E; -fx-background-radius:0 20 0 0;");
		
		 

	    }
	 
	 
  
	    
	    @FXML
	    void btn_sınav_takvimi_Click(ActionEvent event) {

	    }

	    
	    ObservableList<DersProgrami> pazartesi;
	     ObservableList<DersProgrami> sali;
	     ObservableList<DersProgrami> carsamba;
	     ObservableList<DersProgrami> persembe;
	     ObservableList<DersProgrami> cuma;
	    @FXML
	    void btn_ders_programı_Click(ActionEvent event) {
	    	pazartesi=FXCollections.observableArrayList();
	    	sali=FXCollections.observableArrayList();
	    	carsamba=FXCollections.observableArrayList();
	    	persembe=FXCollections.observableArrayList();
	    	cuma=FXCollections.observableArrayList();
	        
	    
	        
	    	
	        try {

	         	ResultSet dersprogrami=baglanti.VeriGetir("select ders_ad,ders_kodu,derslik,bas_saat,bit_saat,haftanin_gunu,ogretim_uyesi.ad,ogretim_uyesi.soyad FROM ders_programi,ogrenci_ders,dersler,ogretim_uyesi WHERE ogrenci_ders.ders_id=ders_programi.ders_id AND ogrenci_ders.ders_id=dersler.id AND dersler.ogretim_uyesi_id=ogretim_uyesi.id AND ogrenci_ders.ders_durumu=3 AND ogrenci_ders.ogrenci_id="+ogrenci_id);
	         	while(dersprogrami.next()) {
	         		if (dersprogrami.getInt("haftanin_gunu")==0) {
						pazartesi.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik"),dersprogrami.getString("ad")+" "+dersprogrami.getString("soyad")));
					}
	         		if (dersprogrami.getInt("haftanin_gunu")==1) {
	         			sali.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik"),dersprogrami.getString("ad")+" "+dersprogrami.getString("soyad")));
					}
	         		if (dersprogrami.getInt("haftanin_gunu")==2) {
	         			carsamba.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik"),dersprogrami.getString("ad")+" "+dersprogrami.getString("soyad")));
					}
	         		if (dersprogrami.getInt("haftanin_gunu")==3) {
	         			persembe.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik"),dersprogrami.getString("ad")+" "+dersprogrami.getString("soyad")));
					}
	         		if (dersprogrami.getInt("haftanin_gunu")==4) {
	         			cuma.add(new DersProgrami(dersprogrami.getString("bas_saat")+" - "+dersprogrami.getString("bit_saat"), dersprogrami.getString("ders_kodu"), dersprogrami.getString("ders_ad"), dersprogrami.getString("derslik"),dersprogrami.getString("ad")+" "+dersprogrami.getString("soyad")));
					}}
            	
            	FXMLLoader derprogramı = new FXMLLoader(getClass().getResource("DersProgrami.fxml"));
            	
            	AnchorPane pane = derprogramı.load();
                	DersProgramiController gunler = derprogramı.getController();
                	gunler.Program_Ata(pazartesi, sali, carsamba, persembe, cuma);
               
            	anchor_main.getChildren().setAll(pane);
    			
    		
	         	}
			 catch (Exception e) {
				System.out.println(e.getMessage().toString());
			}
	    	

       }
	    

	    @FXML
	    void btn_ders_programı_OffMouse(MouseEvent event) {
	    	btn_ders_programı.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_ders_programı_OnMouse(MouseEvent event) {
	    	btn_ders_programı.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    
	    
	    @FXML
	    void btn_duyurular_Click(ActionEvent event) {
	    	String bolum_ad="";
	    	 try {
             	
             	FXMLLoader duyurular = new FXMLLoader(getClass().getResource("OgrenciDuyurular.fxml"));
             	
             	AnchorPane pane = duyurular.load();
                OgrenciDuyurularController duyu = duyurular.getController();
                
                ResultSet bolum = baglanti.VeriGetir("select bolum from ogrenci_bilgi where id="+ogrenci_id);
                if (bolum.next()) {
					bolum_ad=bolum.getString("bolum");
				}
                
                ResultSet duyuru = baglanti.VeriGetir("select baslik,icerik from duyuru where duyuru.bolum='"+bolum_ad+ "'");
                if (duyuru.next()) {
                	duyu.icerik_ata(duyuru.getString("baslik"), duyuru.getString("icerik"));
				}
                
             	anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					System.out.println(e.getMessage().toString());
				}

	    }

	    @FXML
	    void btn_duyurular_OffMouse(MouseEvent event) {
	    	btn_duyurular.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_duyurular_OnMouse(MouseEvent event) {
	    	btn_duyurular.setStyle("-fx-background-color:#8B8E8E;");

	    }
	 
	    
    

    @FXML
    void btn_donem_OffMouse(MouseEvent event) {
    	btn_donem.setStyle("-fx-background-color:  #55595a;");
    	pnl_donem.setVisible(false);
    	

    }

    @FXML
    void btn_donem_OnMouse(MouseEvent event) {
    	btn_donem.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_donem.setVisible(true);

    }

    @FXML
    void btn_genel_OffMouse(MouseEvent event) {
    	btn_genel.setStyle("-fx-background-color:  #55595a;");
    	pnl_genel.setVisible(false);

    }

    @FXML
    void btn_genel_OnMouse(MouseEvent event) {
    	btn_genel.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_genel.setVisible(true);

    }

   

    @FXML
    void btn_kullanıcı_OffMouse(MouseEvent event) {
    	btn_kullanıcı.setStyle("-fx-background-color:  #55595a;");
    	pnl_kullanıcı.setVisible(false);

    }

    @FXML
    void btn_kullanıcı_OnMouse(MouseEvent event) {
    	btn_kullanıcı.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_kullanıcı.setVisible(true);
    	

    }

    @FXML
    void btn_staj_OffMouse(MouseEvent event) {
    	btn_staj.setStyle("-fx-background-color:  #55595a;");
    	pnl_staj.setVisible(false);

    }

    @FXML
    void btn_staj_OnMouse(MouseEvent event) {
    	btn_staj.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_staj.setVisible(true);
    	

    }
    
    

   
    
    @FXML
    void pnl_genel_OffMouse(MouseEvent event) {
        pnl_genel.setVisible(false);
    }

    @FXML
    void pnl_genel_OnMouse(MouseEvent event) {
    	pnl_genel.setVisible(true);

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
    void pnl_kullanıcı_OffMouse(MouseEvent event) {
    	pnl_kullanıcı.setVisible(false);

    }

    @FXML
    void pnl_kullanıcı_OnMouse(MouseEvent event) {
    	pnl_kullanıcı.setVisible(true);

    }

    @FXML
    void pnl_staj_OffMouse(MouseEvent event) {
    	pnl_staj.setVisible(false);

    }

    @FXML
    void pnl_staj_OnMouse(MouseEvent event) {
    	pnl_staj.setVisible(true);

    }
    
    
    
    

    @FXML
    void initialize() {
    	
    	
    	
    	 assert anchor_main != null : "fx:id=\"anchor_main\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
       
         assert btn_danısman != null : "fx:id=\"btn_danısman\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_ders_programı != null : "fx:id=\"btn_ders_programı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_donem != null : "fx:id=\"btn_donem\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_duyurular != null : "fx:id=\"btn_duyurular\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_genel != null : "fx:id=\"btn_genel\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_kullanıcı != null : "fx:id=\"btn_kullanıcı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
     
         assert btn_staj != null : "fx:id=\"btn_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
       
         assert pnl_donem != null : "fx:id=\"pnl_donem\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_genel != null : "fx:id=\"pnl_genel\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_kullanıcı != null : "fx:id=\"pnl_kullanıcı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_staj != null : "fx:id=\"pnl_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         


    }
    public void ogr_id(int id) {
    	this.ogrenci_id=id;
    }

}
