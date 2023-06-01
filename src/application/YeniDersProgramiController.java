package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class YeniDersProgramiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_programEkle;

    @FXML
    private ComboBox<String> combo_bolum;

    @FXML
    private ComboBox<String> combo_dersAdi;

    @FXML
    private ComboBox<String> combo_dk1;

    @FXML
    private ComboBox<String> combo_dk2;

    @FXML
    private ComboBox<String> combo_haftanınGünü;

    @FXML
    private ComboBox<Integer> combo_ogretim;

    @FXML
    private ComboBox<String> combo_saat1;

    @FXML
    private ComboBox<String> combo_saat2;

    @FXML
    private ComboBox<Integer> combo_sinif;

    @FXML
    void btn_programEkle_Click(ActionEvent event) {
           // girilen bilgiler veritabanına eklenecek
    }

    @FXML
    void initialize() {
        assert btn_programEkle != null : "fx:id=\"btn_programEkle\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_bolum != null : "fx:id=\"combo_bolum\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dersAdi != null : "fx:id=\"combo_dersAdi\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dk1 != null : "fx:id=\"combo_dk1\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_dk2 != null : "fx:id=\"combo_dk2\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_haftanınGünü != null : "fx:id=\"combo_haftanınGünü\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_ogretim != null : "fx:id=\"combo_ogretim\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_saat1 != null : "fx:id=\"combo_saat1\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_saat2 != null : "fx:id=\"combo_saat2\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        assert combo_sinif != null : "fx:id=\"combo_sinif\" was not injected: check your FXML file 'YeniDersProgrami.fxml'.";
        
        for(int i=0;i <59;i++) {
        	if (i%5==0) {
				if (i<10) {
					combo_dk1.getItems().add("0"+String.valueOf(i));
					combo_dk2.getItems().add("0"+String.valueOf(i));
				}
				else {
					combo_dk1.getItems().add(String.valueOf(i));
					combo_dk2.getItems().add(String.valueOf(i));
				}
			}
        	if (i<24) {
        		if (i<10) {
        			combo_saat1.getItems().add("0"+String.valueOf(i));
        			combo_saat2.getItems().add("0"+String.valueOf(i));
					
				}
        		else {
        			combo_saat1.getItems().add(String.valueOf(i));
        			combo_saat2.getItems().add(String.valueOf(i));
        		}
				
			}
        	if (i<4) {
        		combo_sinif.getItems().add(i+1);
				
			}
        	if (i<2) {
        		combo_ogretim.getItems().add(i+1);
			}
        	
        	
        }
        combo_haftanınGünü.getItems().add("Pazartesi");
        combo_haftanınGünü.getItems().add("Salı");
        combo_haftanınGünü.getItems().add("Çarşamba");
        combo_haftanınGünü.getItems().add("Perşembe");
        combo_haftanınGünü.getItems().add("Cuma");
    }
    
   
   
   public void bolum_ata(ObservableList<Bolum> bolumler) {
   	
   	for(Bolum bol : bolumler) {
      	 combo_bolum.getItems().add(bol.getBolum_ad());
       }
   }
   
   public void ders_ata(ObservableList<Dersler> ders) {
	   for(Dersler der : ders) {
		   combo_dersAdi.getItems().add(der.getDers_adı());
	   }
   }
   

}

