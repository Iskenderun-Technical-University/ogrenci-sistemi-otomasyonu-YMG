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
	    private Button btn_program_dersleri;
	    
	    
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
	    
	    @FXML
	    void btn_bilgigoruntule_Click(ActionEvent event) {
	    	OgrenciBilgiGoruntule bilgi1 = new OgrenciBilgiGoruntule("ali", "baba", 12121212, "11111111111", "asdasda@dsasd.com", "adasdas", 2);
	    
	    	 try {
	             	
	             	
	             	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("OgrenciBilgiGoruntule.fxml"));
	             	
	             	 AnchorPane pane = bilgi.load();
	                 OgrenciBilgiGoruntuleController bilgiler = bilgi.getController();
	                 bilgiler.bilgi_getir(bilgi1);
	                  
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
	    	a=FXCollections.observableArrayList();
	    	b=FXCollections.observableArrayList();
	    	a.add(new DersEklemeVeriTuru("Anla", "bişiler", "hoca"));
         	b.add(new DersEklemeVeriTuru("Anlayana", "bilgiayar ders ismi", "mehmet"));
	    	 try {
             	
             	
             	FXMLLoader ders_ekle = new FXMLLoader(getClass().getResource("OgrenciDersEkleme.fxml"));
             	
             	 AnchorPane pane = ders_ekle.load();
                 OgrenciDersEklemeController ders = ders_ekle.getController();
                  ders.Ders_Goruntuleme(a, b);
                 anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					// TODO: handle exception
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
	    	bilgiler.add(new NotBilgisiTranskript("Bilgisayar", "85", "32", "56", "65", "CB", 3, 5));
	    	bilgiler.add(new NotBilgisiTranskript("adasd", "23", "89", "45", "16", "AA", 5, 12));
	    	bilgiler.add(new NotBilgisiTranskript("asda", "15", "45", "15", "55", "BB", 2, 4));
	    	
             try {
             	
             	
             	FXMLLoader transkript = new FXMLLoader(getClass().getResource("OgrenciTranskript.fxml"));
             	
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
	    	liste1.add(new NotBilgisi("Ders1", "25", "32", "65", String.valueOf(25*0.4+65*0.6), "CD"));
	    	
	    	
	    	 try {
	             	
	             	
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
	    
	    ObservableList<DersProgramı> liste;
	  
	    

	  @FXML
	  void btn_danısman_Click(ActionEvent event) {
                try {
                	
                	FXMLLoader danısmanbilgi = new FXMLLoader(getClass().getResource("OgrenciDanismanBilgileri.fxml"));
                	
                	AnchorPane pane = danısmanbilgi.load();
                    	OgrenciDanismanBilgileriController dcont = danısmanbilgi.getController();
                   dcont.Danısman1_Yazdır("asda", "asdasd000", "adasd", "asa", "fafga");
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
	    void btn_program_dersleri_Click(ActionEvent event) {
		 
		 try {
			 FXMLLoader ProgramBilgi = new FXMLLoader(getClass().getResource("OgrenciProgramDersleri.fxml"));
		     	
		     	AnchorPane pane = ProgramBilgi.load();
		     	anchor_main.getChildren().setAll(pane);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
			
	 }
	    

	    @FXML
	    void btn_program_dersleri_OffMouse(MouseEvent event) {
	    	btn_program_dersleri.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_program_dersleri_OnMouse(MouseEvent event) {
	    	btn_program_dersleri.setStyle("-fx-background-color:#8B8E8E;");

	    }
	    
	    
	    
	    @FXML
	    void btn_sınav_takvimi_Click(ActionEvent event) {

	    }

	    
	    
	    @FXML
	    void btn_ders_programı_Click(ActionEvent event) {
	    	liste=FXCollections.observableArrayList();
	        liste.add(new DersProgramı("9:30 - 10:20", "BM-102", "Bilgi Ağ", "A-102", "Mehmet"));
	        liste.add(new DersProgramı("10:30 - 11:20", "BM-102", "Bilgi Ağ", "A-102", "Ali"));
	        
	    	
	        try {
            	
            	FXMLLoader derprogramı = new FXMLLoader(getClass().getResource("DersProgramı.fxml"));
            	
            	AnchorPane pane = derprogramı.load();
                	DersProgramıController gunler = derprogramı.getController();
                	gunler.Program_Ata(liste, liste, liste, liste, liste);
               
            	anchor_main.getChildren().setAll(pane);
    			
    		
				
			} catch (Exception e) {
				// TODO: handle exception
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
	    	
	    	 try {
             	
             	FXMLLoader duyurular = new FXMLLoader(getClass().getResource("OgrenciDuyurular.fxml"));
             	
             	AnchorPane pane = duyurular.load();
                OgrenciDuyurularController duyu = duyurular.getController();
                duyu.icerik_ata("Şimdilik", "Boş İçerik");
             	anchor_main.getChildren().setAll(pane);
     			
     		
					
				} catch (Exception e) {
					// TODO: handle exception
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
         assert btn_program_dersleri != null : "fx:id=\"btn_program_dersleri\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert btn_staj != null : "fx:id=\"btn_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
       
         assert pnl_donem != null : "fx:id=\"pnl_donem\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_genel != null : "fx:id=\"pnl_genel\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_kullanıcı != null : "fx:id=\"pnl_kullanıcı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         assert pnl_staj != null : "fx:id=\"pnl_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
         


    }

}
