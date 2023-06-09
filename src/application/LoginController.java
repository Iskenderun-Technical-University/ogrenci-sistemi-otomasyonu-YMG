package application;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import com.Mysql.VeritabaniBaglanti;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_admin;

    @FXML
    private Button btn_login_o;
    
    @FXML
    private Button btn_login_p;

    @FXML
    private Button btn_ogrenci;

    @FXML
    private Button btn_ogretmen;

    @FXML
    private Label lbl_captcha_o;

    @FXML
    private Label lbl_captcha_p;

    @FXML
    private Label lbl_ogrenci1;

    @FXML
    private Label lbl_reset_o;
    
    @FXML
    private Label lbl_reset_p;

    @FXML
    private Pane pnl_captcha;

    @FXML
    private Pane pnl_main;
    

    @FXML
    private Pane pnl_ogrenci;

    @FXML
    private Pane pnl_ogretmen;

    @FXML
    private TextField txt_captcha;

    @FXML
    private TextField txt_kulad;

    @FXML
    private TextField txt_okulno;

    @FXML
    private TextField txt_osifre;

    @FXML
    private TextField txt_psifre;
    

    @FXML
    private TextField txt_captcha_p;
    
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    private Random rnd = new Random();
    private String sonuc;
    
    

    @FXML
    void btn_admin_Click(ActionEvent event) {
    	random_Ata();
    	try {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
			AnchorPane pane2 = (AnchorPane) loader.load();
			AdminLogin nesne = loader.getController();
			
			Scene scene2 = new Scene(pane2);
			nesne.stage_Kapat(btn_admin);
			Stage stage2 = new Stage();
			
			stage2.initStyle(StageStyle.TRANSPARENT);
			scene2.setFill(Color.TRANSPARENT);
			stage2.initModality(Modality.APPLICATION_MODAL);
			stage2.setScene(scene2);
			stage2.show();
			
		} catch(Exception e) {
			System.out.println(e);
		}
    	
    }
    
    @FXML
    void btn_admin_OffMouse(MouseEvent event) {
    	Scale_Transtition(1.1, 1, 0.5, btn_admin);
    }

    @FXML
    void btn_admin_OnMouse(MouseEvent event) {
    	Scale_Transtition(1, 1.1, 0.5, btn_admin);
    }

    @FXML
    void btn_login_o_Click(ActionEvent event) {
    	if (txt_okulno.getText()=="" || txt_osifre.getText()=="") {
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("Uyarı");
			alert.setTitle("Okul No Ve Şifre Boş Bırakılamaz");
			alert.setContentText("Lütfen Okul Numarasını Ve Şifrenizi Boş Bırakmayınız.");
			alert.showAndWait();
    		
		}
    	else {
    		if (txt_captcha.getText().equals(sonuc)) {
    			if (baglanti.Kontrol("Select *  from ogrenci_bilgi where numara=? and sifre=?", Integer.parseInt(txt_okulno.getText()), txt_osifre.getText())) {
    				
    				
    				try {
    		    		Stage yeni_stage = new Stage();
    					FXMLLoader loader = new FXMLLoader(getClass().getResource("OgrenciPanel.fxml"));
    					AnchorPane pane1=loader.load();
    					Scene scene = new Scene(pane1); 
    					OgrenciPanelController ogr = loader.getController();
    					ogr.ogr_id(baglanti.id_Getir("Select id from ogrenci_bilgi where numara=?", txt_okulno.getText()));
    				    yeni_stage.setScene(scene);
    					yeni_stage.show();
    					
    					Stage suanki_stage = (Stage) btn_login_o.getScene().getWindow();
    			    	suanki_stage.close();
    		    		
    		    		
    					
    				} catch (Exception e) {
    					// TODO: handle exception
    					System.out.println(e.getMessage().toString());
    				}
    			}
    			else {
    				Alert alert = new Alert(AlertType.INFORMATION);
    				alert.setHeaderText("Uyarı");
    				alert.setTitle("Okul No Veya Şifre Yanlış");
    				alert.setContentText("Lütfen Okul Numarasını Ve Şifrenizi Kontrol Ediniz.");
    				alert.showAndWait();
    	    		
    			}
			}
    		else {
    			Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("Uyarı");
				alert.setTitle("Dğrulama Yanlış");
				alert.setContentText("Lütfen Doğrulama Kodunu Kontrol Ediniz.");
				alert.showAndWait();
			}
    		
    		
			
		}
    	random_Ata();
    	

    }
    
    @FXML
    void btn_login_o_OnMouse(MouseEvent event) {
    	Scale_Transtition(1, 1.1, 0.5, btn_login_o);
    }

    @FXML
    void btn_login_o_OffMouse(MouseEvent event) {
    	Scale_Transtition(1.1, 1, 0.5, btn_login_o);

    }
    

    @FXML
    void btn_login_p_click(ActionEvent event) {
    	if (txt_kulad.getText()!="" || txt_psifre.getText()!="") {
    		
    		if (txt_captcha_p.getText().equals(sonuc)) {
    			if (baglanti.Kontrol("select * from ogretim_uyesi where kullanici_ad=? and sifre=?", txt_kulad.getText(), txt_psifre.getText())) {
    				

            		try {
                		Stage yeni_stage = new Stage();
                		FXMLLoader loader = new FXMLLoader(getClass().getResource("OgretmenPanel.fxml"));
            			AnchorPane pane1 = loader.load();
            			OgretmenPanelController panel = loader.getController();
            			panel.setOgretim_id(baglanti.id_Getir("select id from ogretim_uyesi where kullanici_ad=? and sifre=?", txt_kulad.getText(), txt_psifre.getText()));
            			Scene scene = new Scene(pane1); 
            		    yeni_stage.setScene(scene);
            			yeni_stage.show();
            			
            			Stage suanki_stage = (Stage) btn_login_o.getScene().getWindow();
            	    	suanki_stage.close();
                		
                		
            			
            		} catch (Exception e) {
            			// TODO: handle exception
            			System.out.println(e.getMessage().toString());
            		}
    			}
        		else {
    				Alert alert = new Alert(AlertType.INFORMATION);
    				alert.setHeaderText("Uyarı");
    				alert.setTitle("Yanlış Bilgiler");
    				alert.setContentText("Kullanıcı Adı veya Şifre Yanlış");
    				alert.showAndWait();
    			}
			}
    		else {
    			Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("Uyarı");
				alert.setTitle("Dğrulama Yanlış");
				alert.setContentText("Lütfen Doğrulama Kodunu Kontrol Ediniz.");
				alert.showAndWait();
			}
    	
    		
    		
		}
    	random_Ata();

    }
    
    @FXML
    void btn_login_p_OffMouse(MouseEvent event) {
    	Scale_Transtition(1.1, 1, 0.5, btn_login_p);
    }
    
    @FXML
    void btn_login_p_OnMouse(MouseEvent event) {
    	Scale_Transtition(1, 1.1, 0.5, btn_login_p);

    }
    


    @FXML
    void btn_ogrenci_Click(ActionEvent event) {
    	
    
    	    
    	
    	    Move_Trantition(0, 1.5, 0,pnl_main);
    	    Fade_Trantition(0, 1, 1, 1.5, pnl_ogrenci);
    	    Fade_Trantition(1, 0, 0.5, 0, pnl_ogretmen);
				
			
    	    
    		// ogrenci panlei kapanış
        	
        	// ogretmen paneli açılış
        	
    	    random_Ata();
        	
        	
        	
        	
  
    }
    
    
    @FXML
    void btn_ogrenci_OffMouse(MouseEvent event) {
    	Scale_Transtition(1.1, 1, 0.5, btn_ogrenci);
    }

    @FXML
    void btn_ogrenci_OnMouse(MouseEvent event) {
    	Scale_Transtition(1, 1.1, 0.5, btn_ogrenci);
    }

    @FXML
    void btn_ogretmen_Click(ActionEvent event) throws InterruptedException  {
    	btn_ogretmen.setDisable(true);
    	
    	Move_Trantition(599,1.5,0,pnl_main);
    	
    	
    	//ogretmen paneli açılış
    	Fade_Trantition(0, 1, 1, 1.5, pnl_ogretmen);
    	// öğrenci paneli kapanış
    	Fade_Trantition(1, 0, 0.5, 0, pnl_ogrenci);
		
    	
    	
    	
    	
        
    	
    	
    	
		
    	
        random_Ata();
    	
    }
    
    
    
    
    @FXML
    void btn_ogretmen_OffMouse(MouseEvent event) {
    	Scale_Transtition(1.1, 1, 0.5, btn_ogretmen);
    }

    @FXML
    void btn_ogretmen_OnMouse(MouseEvent event) {
    
    	
    	Scale_Transtition(1, 1.1, 0.5, btn_ogretmen);
    }
    
    @FXML
    void lbl_reset_o_Click(MouseEvent event) {

    }
    
    @FXML
    void lbl_reset_o_OffMouse(MouseEvent event) {
    	 lbl_reset_o.setUnderline(false);
    }

    @FXML
    void lbl_reset_o_OnMouse(MouseEvent event) {
            lbl_reset_o.setUnderline(true);
    }
    
    @FXML
    void lbl_reset_p_Click(MouseEvent event) {
         
    }

    @FXML
    void lbl_reset_p_OffMouse(MouseEvent event) {
    	lbl_reset_p.setUnderline(false);
    }

    @FXML
    void lbl_reset_p_OnMouse(MouseEvent event) {
    	lbl_reset_p.setUnderline(true);
    }
   
    

    @FXML
    void initialize() {
        assert btn_admin != null : "fx:id=\"btn_admin\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_login_o != null : "fx:id=\"btn_login_o\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_login_p != null : "fx:id=\"btn_login_p\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_ogrenci != null : "fx:id=\"btn_ogrenci\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_ogretmen != null : "fx:id=\"btn_ogretmen\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_captcha_o != null : "fx:id=\"lbl_captcha_o\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_captcha_p != null : "fx:id=\"lbl_captcha_p\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_ogrenci1 != null : "fx:id=\"lbl_ogrenci1\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_reset_o != null : "fx:id=\"lbl_reset_o\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_reset_p != null : "fx:id=\"lbl_reset_p\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_captcha != null : "fx:id=\"pnl_captcha\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_main != null : "fx:id=\"pnl_main\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_ogrenci != null : "fx:id=\"pnl_ogrenci\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_ogretmen != null : "fx:id=\"pnl_ogretmen\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_captcha != null : "fx:id=\"txt_captcha\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_kulad != null : "fx:id=\"txt_kulad\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_okulno != null : "fx:id=\"txt_okulno\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_osifre != null : "fx:id=\"txt_osifre\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_psifre != null : "fx:id=\"txt_psifre\" was not injected: check your FXML file 'Login.fxml'.";
        
        
       
     
    	Fade_Trantition(1, 0, 0.1, 0, pnl_ogretmen);
    	btn_ogrenci.setDisable(true);
    	
    	
    	random_Ata();
    	
    	pnl_ogrenci.opacityProperty().addListener(new ChangeListener<Number>() {
    		@Override
    		public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
    			
    			String yenideger=String.valueOf(arg2);
    			if (Double.parseDouble(yenideger)==1) {
    				btn_ogretmen.setDisable(false);
					
					
				}
    			
    			if (Double.parseDouble(yenideger)==0) {
    				btn_ogretmen.setDisable(true);
					
				}
    		}
		});
    	pnl_ogretmen.opacityProperty().addListener(new ChangeListener<Number>() {
    		@Override
    		public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
    			
    			String yenideger=String.valueOf(arg2);
    			if (Double.parseDouble(yenideger)<1) {
    				btn_ogrenci.setDisable(true);
				}
    			if (Double.parseDouble(yenideger)==1) {
    				btn_ogrenci.setDisable(false);
				}
    		}
		});
    	
    	

    }

    
    
      private Stage Bustage;
      
    
    public Stage getBustage() {
		return Bustage;
	}

	public void setBustage(Stage bustage) {
		Bustage = bustage;
	}

	public void Move_Trantition(int bitis,double sure,double gecikme ,Node arguman) {
    	
    	// İnt Baslangıç haraketin başlayacagı pixel
    	// İnt Bitiş Haraketin biteceği pixel
    	//Double Sure Haraketin ne kadar sürede tamamlanacağı
    	// double gecikme harakatenin ne kadar süre sonra başlayacağı
    	// Node arguman haraketin hangi objeye uygulanacağı
    	
    	TranslateTransition trans = new TranslateTransition();
    	trans.setDuration(javafx.util.Duration.seconds(sure));
    	trans.setDelay(javafx.util.Duration.seconds(gecikme));
    	trans.setNode(arguman);
    	trans.setToX(bitis);
    
          
    	
    	trans.play();
    	
    	
    	
    	
    }
    public void Fade_Trantition(double baslangıc, double bitis, double sure,double gecikme, Node arguman) {
    	
    	FadeTransition fade1 = new FadeTransition();
    	fade1.setDuration(javafx.util.Duration.seconds(sure));
    	fade1.setDelay(javafx.util.Duration.seconds(gecikme));
    	fade1.setNode(arguman);
    	fade1.setFromValue(baslangıc);
    	fade1.setToValue(bitis);
    	fade1.play();
    	
    	
    }
    public void Scale_Transtition(double baslangıc,double bitis,double sure,Node arguman) {
    	
    	ScaleTransition scale = new ScaleTransition();
    	scale.setDuration(javafx.util.Duration.seconds(sure));
    	scale.setNode(arguman);
    	scale.setFromX(baslangıc);
    	scale.setToX(bitis);
    	scale.setFromY(baslangıc);
    	scale.setToY(bitis);
    	scale.play();
    }
    
    private void random_Ata() {
    	int deger1=rnd.nextInt(100);
    	int deger2=rnd.nextInt(100);
    	lbl_captcha_o.setText(String.valueOf(deger1)+" + "+String.valueOf(deger2));
    	lbl_captcha_p.setText(String.valueOf(deger1)+" + "+String.valueOf(deger2));
    	sonuc=String.valueOf(deger1+deger2);
    	
    }
    
}

