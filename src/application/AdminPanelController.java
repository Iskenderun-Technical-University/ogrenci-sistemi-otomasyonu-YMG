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

public class AdminPanelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor_main;

    @FXML
    private Button btn_dersKayıt;
    
    @FXML
    private Button btn_dersAcma;


    @FXML
    private Button btn_dersProgrami;

    @FXML
    private Button btn_ogrKayit;

    @FXML
    private Button btn_ogretimKaydi;
    
    private ObservableList<Fakulte> fakulteler;
    private ObservableList<Bolum> bolumler;
    private ObservableList<Danisman> danismanlar;
    private ObservableList<Dersler> dersler;

    @FXML
    void btn_dersAcma(ActionEvent event) {
    	 try {
           	
           	
           	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("AdminDersAcma.fxml"));
           	
           	 AnchorPane pane = bilgi.load();
        
             
           	 
               anchor_main.getChildren().setAll(pane);
   			
   		
 					
 				} catch (Exception e) {
 					System.out.println(e.getMessage().toString());
 				}
     }
    

    @FXML
    void btn_dersAcma_OfMouse(MouseEvent event) {
    	btn_dersAcma.setStyle(" -fx-background-color: #55595a;");
    }

    @FXML
    void btn_dersAcma_OnMouse(MouseEvent event) {
    	btn_dersAcma.setStyle("-fx-background-color:#8B8E8E;");
    }


    @FXML
    void btn_dersKayıt_Click(ActionEvent event) {
    	 try {
          	
          	
          	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniDersKayit.fxml"));
          	
          	 AnchorPane pane = bilgi.load();
          //  YeniDersKayitController ders = new YeniDersKayitController();
            
          	 
              anchor_main.getChildren().setAll(pane);
  			
  		
					
				} catch (Exception e) {
					System.out.println(e.getMessage().toString());
				}
    }

    @FXML
    void btn_dersKayıt_OffMouse(MouseEvent event) {
    	btn_dersKayıt.setStyle(" -fx-background-color: #55595a;");
    }

    @FXML
    void btn_dersKayıt_OnMouse(MouseEvent event) {
    	btn_dersKayıt.setStyle("-fx-background-color:#8B8E8E;");
    }
     
    
    @FXML
    void btn_dersProgrami_Click(ActionEvent event) {
    	
    	
    	
    	 try {
            	
            	
            	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniDersProgrami.fxml"));
            	
            	 AnchorPane pane = bilgi.load();
            	 YeniDersProgramiController dersProgrami =bilgi.getController();
                 dersProgrami.bolum_ata(bolumler);
                 dersProgrami.ders_ata(dersler);
           
                anchor_main.getChildren().setAll(pane);
    			
    		
  					
  				} catch (Exception e) {
  					System.out.println(e.getMessage().toString());
  				}

    }

    @FXML
    void btn_dersProgrami_OfMouse(MouseEvent event) {
    	btn_dersProgrami.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_dersProgrami_OnMouse(MouseEvent event) {
    	btn_dersProgrami.setStyle("-fx-background-color:#8B8E8E;");

    }
    
   

    @FXML
    void btn_ogrKayit_Click(ActionEvent event) {
    	
    	
    	
    	
   
    	
    	 try {
           	
           	
           	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniOgrenciEkle.fxml"));
           	
           	 AnchorPane pane = bilgi.load();
           	 YeniOgrenciEkleController ogrenci =bilgi.getController();
           	
           	 
             ogrenci.bolum_ata(bolumler);
          	 ogrenci.danısman_ata(danismanlar);
           	 ogrenci.fak_ata(fakulteler);
          
               anchor_main.getChildren().setAll(pane);
   			
   		
 					
 				} catch (Exception e) {
 					System.out.println(e.getMessage().toString());
 				}
    	
    	

    }

    @FXML
    void btn_ogrKayit_OffMouse(MouseEvent event) {
    	btn_ogrKayit.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogrKayit_OnMouse(MouseEvent event) {
    	btn_ogrKayit.setStyle("-fx-background-color:#8B8E8E;");

    }

    @FXML
    void btn_ogretimKaydi_Click(ActionEvent event) {
    	
    	
    	
    
    	
    	 try {
           	
           	
           	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniDanismanEkle.fxml"));
           	
           	 AnchorPane pane = bilgi.load();
           	 YeniDanismanEkleController danisman =bilgi.getController();
             danisman.bolum_ata(bolumler);
             danisman.fak_ata(fakulteler);
          
               anchor_main.getChildren().setAll(pane);
   			
   		
 					
 				} catch (Exception e) {
 					System.out.println(e.getMessage().toString());
 				}

    }

    @FXML
    void btn_ogretimKaydi_OfMouse(MouseEvent event) {
    	btn_ogretimKaydi.setStyle(" -fx-background-color: #55595a;");

    }

    @FXML
    void btn_ogretimKaydi_OnMouse(MouseEvent event) {
    	btn_ogretimKaydi.setStyle("-fx-background-color:#8B8E8E;");

    }

  

  

    @FXML
    void initialize() {
        assert anchor_main != null : "fx:id=\"anchor_main\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert btn_dersKayıt != null : "fx:id=\"btn_dersKayıt\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert btn_dersProgrami != null : "fx:id=\"btn_dersProgrami\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert btn_ogrKayit != null : "fx:id=\"btn_ogrKayit\" was not injected: check your FXML file 'AdminPanel.fxml'.";
       assert btn_ogretimKaydi != null : "fx:id=\"btn_ogretimKaydi\" was not injected: check your FXML file 'AdminPanel.fxml'.";
       
       danismanlar=FXCollections.observableArrayList();
       fakulteler=FXCollections.observableArrayList();
    	bolumler=FXCollections.observableArrayList();
    	dersler=FXCollections.observableArrayList();
      try {
    	  VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
       	 ResultSet veritabani_bolumler = baglanti.VeriGetir("select *from Bolum");
       	 while(veritabani_bolumler.next()) {
       		 bolumler.add(new Bolum(veritabani_bolumler.getInt("id"), veritabani_bolumler.getString("bolum_ad")));
       	 }
       	 ResultSet veritabani_fakulteler= baglanti.VeriGetir("select * from fakulte");
       	 while(veritabani_fakulteler.next()) {
       		 fakulteler.add(new Fakulte(veritabani_fakulteler.getInt("id"), veritabani_fakulteler.getString("fakulte_ad")));
       	 }
       	 ResultSet veritabani_danisman= baglanti.VeriGetir("select id,ad,soyad from ogretim_uyesi");
       	 while(veritabani_danisman.next()) {
       		 danismanlar.add(new Danisman(veritabani_danisman.getInt("id"), veritabani_danisman.getString("ad"), veritabani_danisman.getString("soyad")));
       	 }
       	ResultSet veritabani_dersler= baglanti.VeriGetir("select id,ders_ad from dersler");
      	 while(veritabani_dersler.next()) {
      		 dersler.add(new Dersler(veritabani_dersler.getInt("id"), veritabani_dersler.getString("ders_ad")));
      		 
      	 }
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
        
    }

}
