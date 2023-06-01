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
    private Button btn_dersProgrami;

    @FXML
    private Button btn_ogrKayit;

    @FXML
    private Button btn_ogretimKaydi;



    @FXML
    void btn_dersKayıt_Click(ActionEvent event) {
    	 try {
          	
          	
          	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniDersKayit.fxml"));
          	
          	 AnchorPane pane = bilgi.load();
         
              anchor_main.getChildren().setAll(pane);
  			
  		
					
				} catch (Exception e) {
					// TODO: handle exception
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
     
    private ObservableList<Dersler> ders;
    @FXML
    void btn_dersProgrami_Click(ActionEvent event) {
    	bolumler=FXCollections.observableArrayList();
    	ders=FXCollections.observableArrayList();
    	ders.add(new Dersler(0, "Bİlgisayar ağları"));
    	ders.add(new Dersler(0, "Bİlgisayar Yönetimi"));
    	
    	bolumler.add(new Bolum(0, "BG"));
    	bolumler.add(new Bolum(0, "IG"));
    	 try {
            	
            	
            	FXMLLoader bilgi = new FXMLLoader(getClass().getResource("YeniDersProgrami.fxml"));
            	
            	 AnchorPane pane = bilgi.load();
            	 YeniDersProgramiController dersProgrami =bilgi.getController();
                 dersProgrami.bolum_ata(bolumler);
                 dersProgrami.ders_ata(ders);
           
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
    
    private ObservableList<Fakulte> fakulteler;
    private ObservableList<Bolum> bolumler;
    private ObservableList<Danisman> danismanlar;

    @FXML
    void btn_ogrKayit_Click(ActionEvent event) {
    	fakulteler=FXCollections.observableArrayList();
    	bolumler=FXCollections.observableArrayList();
    	danismanlar=FXCollections.observableArrayList();
    	fakulteler.add(new Fakulte(0, "Mdbf"));
    	fakulteler.add(new Fakulte(1, "FAK"));
    	bolumler.add(new Bolum(0, "BG"));
    	bolumler.add(new Bolum(0, "IG"));
    	danismanlar.add(new Danisman(0, "ad1", "soyad"));
    	danismanlar.add(new Danisman(0, "ad2", "soyad"));  
    	
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
    	fakulteler=FXCollections.observableArrayList();
    	bolumler=FXCollections.observableArrayList();
    	
    	fakulteler.add(new Fakulte(0, "Mdbf"));
    	fakulteler.add(new Fakulte(1, "FAK"));
    	bolumler.add(new Bolum(0, "BG"));
    	bolumler.add(new Bolum(0, "IG"));
    
    	
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
      

    }

}
