package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

    @FXML
    void btn_kaydet_Click(ActionEvent event) {
              // combo boxda seçilen danısmanın id si getirilip o şekilde veritabanına aktarılacak
    	
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
