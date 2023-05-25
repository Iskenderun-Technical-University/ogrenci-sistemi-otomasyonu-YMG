package application;

import java.net.URL;
import java.util.ResourceBundle;

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
	    private Button btn_basvuru;

	    @FXML
	    private Button btn_donem;

	    @FXML
	    private Button btn_genel;

	    @FXML
	    private Button btn_hazırlık;

	    @FXML
	    private Button btn_kullanıcı;

	    @FXML
	    private Button btn_staj;

	    @FXML
	    private Button btn_yoksis;

	    @FXML
	    private VBox pnl_basvuru;

	    @FXML
	    private VBox pnl_donem;

	    @FXML
	    private VBox pnl_genel;

	    @FXML
	    private VBox pnl_hazırlık;

	    @FXML
	    private VBox pnl_kullanıcı;

	    @FXML
	    private VBox pnl_staj;

	    @FXML
	    private VBox pnl_yoksis;
	    
	    @FXML
	    private Button btn_danısman;
	    
	    @FXML
	    private Button btn_program_dersleri;
	    
	    @FXML
	    private Button btn_sınav_takvimi;
	    
	    @FXML
	    private Button btn_ders_programı;
	    
	    @FXML
	    private Button btn_duyurular;
	    
	    @FXML
	    private AnchorPane anchor_main;
	  
	    

	  @FXML
	  void btn_danısman_Click(ActionEvent event) {
                try {
                	
                	FXMLLoader danısmanbilgi = new FXMLLoader(getClass().getResource("OgrenciDanismanBilgileri.fxml"));
                	
                	AnchorPane pane = danısmanbilgi.load();
                   // 	OgrenciDanısmanBilgileriController dcont = danısmanbilgi.getController();
                   //	dcont.Danısman1_Yazdır("asda", "asdasd000", "adasd", "asa", "fafga");
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
	    void btn_sınav_takvimi_OffMouse(MouseEvent event) {
	    	btn_sınav_takvimi.setStyle(" -fx-background-color: #55595a;");

	    }

	    @FXML
	    void btn_sınav_takvimi_OnMouse(MouseEvent event) {
	    	btn_sınav_takvimi.setStyle("-fx-background-color:#8B8E8E;");

	    }
    
	    
	    @FXML
	    void btn_ders_programı_Click(ActionEvent event) {

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
    void btn_basvuru_OffMouse(MouseEvent event) {
    	btn_basvuru.setStyle("-fx-background-color:  #55595a;");
    	pnl_basvuru.setVisible(false);

    }

    @FXML
    void btn_basvuru_OnMouse(MouseEvent event) {
    	btn_basvuru.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_basvuru.setVisible(true);

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
    void btn_hazırlık_OffMouse(MouseEvent event) {
    	btn_hazırlık.setStyle("-fx-background-color:  #55595a;");
    	pnl_hazırlık.setVisible(false);

    }

    @FXML
    void btn_hazırlık_OnMouse(MouseEvent event) {
    	btn_hazırlık.setStyle("-fx-background-color: #8B8E8E;");
    	
    	pnl_hazırlık.setVisible(true);

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
    void btn_yoksis_OffMouse(MouseEvent event) {
    	btn_yoksis.setStyle("-fx-background-color:  #55595a;");
    	pnl_yoksis.setVisible(false);

    }

    @FXML
    void btn_yoksis_OnMouse(MouseEvent event) {
    	btn_yoksis.setStyle("-fx-background-color: #8B8E8E;");
    	pnl_yoksis.setVisible(true);
    	

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
    void pnl_basvuru_OffMouse(MouseEvent event) {
    	pnl_basvuru.setVisible(false);

    }

    @FXML
    void pnl_basvuru_OnMouse(MouseEvent event) {
    	pnl_basvuru.setVisible(true);

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
    void pnl_hazırlık_OffMouse(MouseEvent event) {
    	pnl_hazırlık.setVisible(false);

    }

    @FXML
    void pnl_hazırlık_OnMouse(MouseEvent event) {
    	pnl_hazırlık.setVisible(true);

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
    void pnl_yoksis_OffMouse(MouseEvent event) {
    	pnl_yoksis.setVisible(false);

    }

    @FXML
    void pnl_yoksis_OnMouse(MouseEvent event) {
    	pnl_yoksis.setVisible(true);

    }
    @FXML
    void initialize() {
    	
    	
    	
    	  assert btn_basvuru != null : "fx:id=\"btn_basvuru\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_danısman != null : "fx:id=\"btn_danısman\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_ders_programı != null : "fx:id=\"btn_ders_programı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_donem != null : "fx:id=\"btn_donem\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_duyurular != null : "fx:id=\"btn_duyurular\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_genel != null : "fx:id=\"btn_genel\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_hazırlık != null : "fx:id=\"btn_hazırlık\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_kullanıcı != null : "fx:id=\"btn_kullanıcı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_program_dersleri != null : "fx:id=\"btn_program_dersleri\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_staj != null : "fx:id=\"btn_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_sınav_takvimi != null : "fx:id=\"btn_sınav_takvimi\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert btn_yoksis != null : "fx:id=\"btn_yoksis\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_basvuru != null : "fx:id=\"pnl_basvuru\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_donem != null : "fx:id=\"pnl_donem\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_genel != null : "fx:id=\"pnl_genel\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_hazırlık != null : "fx:id=\"pnl_hazırlık\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_kullanıcı != null : "fx:id=\"pnl_kullanıcı\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_staj != null : "fx:id=\"pnl_staj\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";
          assert pnl_yoksis != null : "fx:id=\"pnl_yoksis\" was not injected: check your FXML file 'OgrenciPanel.fxml'.";


    }

}
