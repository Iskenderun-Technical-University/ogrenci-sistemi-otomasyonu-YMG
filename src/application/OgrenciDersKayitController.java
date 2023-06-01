package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class OgrenciDersKayitController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_iptal;

    @FXML
    private Button btn_onayla;

    @FXML
    private TableColumn<OgrenciDersOnaylama, String> column_OgrSoyad;

    @FXML
    private TableColumn<OgrenciDersOnaylama, String> column_dersIsmi;

    @FXML
    private TableColumn<OgrenciDersOnaylama, String> column_ogrAd;

    @FXML
    private TableColumn<OgrenciDersOnaylama, Integer> column_ogrNumara;

    @FXML
    private TableColumn<OgrenciDersOnaylama, CheckBox> column_onayla;

    @FXML
    private TableView<OgrenciDersOnaylama> tbl_onaylama;
    
    @FXML
    private ComboBox<Integer> combo_ogrenci;
    
    private int ogrenci_num;
    
    private int ogretmen_id;
    
    private ObservableList<OgrenciDersOnaylama> liste;
    
    @FXML
    void combo_ogrenci_Event(ActionEvent event) {
    	if (combo_ogrenci.getSelectionModel().getSelectedItem()!=null) {
    		ogrenci_num=combo_ogrenci.getSelectionModel().getSelectedItem();
    		
    		
    		
    		
    		
    		
    		// seçilen numara ile ilgili bilgiler tableview e yazdırılacak
    		
			
		}
    	else {
    		 Alert alert =new Alert(AlertType.INFORMATION);
    	     alert.setTitle("Dikkat ");
    	     alert.setHeaderText("Öğrenci seçimi");
    	     alert.setContentText("Lütfen Öğrenci Numarasını Seçiniz");
    	     alert.showAndWait();
    	}

    }
    
    @FXML
    void btn_iptal_Click(ActionEvent event) {
    	
    	// seçilen derler sql update ile ders_durumu=1 olarak yeniden atanacak

    }

    @FXML
    void btn_onayla_Click(ActionEvent event) {
    	
    	if (combo_ogrenci.getSelectionModel().getSelectedItem()==null) {
    		
    		 Alert alert =new Alert(AlertType.INFORMATION);
    	     alert.setTitle("Dikkat ");
    	     alert.setHeaderText("Öğrenci seçimi");
    	     alert.setContentText("Lütfen Öğrenci Numarasını Seçiniz");
    	     alert.showAndWait();
			
		}
    	else {
    		
    		// onaylama butonuna basılan dersler sql ile update edilecek
    	}
    	
        

    }
   private boolean dublicate =false;

    @FXML
    void initialize() {
        assert btn_iptal != null : "fx:id=\"btn_iptal\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert btn_onayla != null : "fx:id=\"btn_onayla\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert column_OgrSoyad != null : "fx:id=\"column_OgrSoyad\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert column_dersIsmi != null : "fx:id=\"column_dersIsmi\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert column_ogrAd != null : "fx:id=\"column_ogrAd\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert column_ogrNumara != null : "fx:id=\"column_ogrNumara\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert column_onayla != null : "fx:id=\"column_onayla\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        assert tbl_onaylama != null : "fx:id=\"tbl_onaylama\" was not injected: check your FXML file 'OgrenciDersKayıt.fxml'.";
        
        column_ogrNumara.setCellValueFactory(new PropertyValueFactory<>("ogrNum"));
        column_ogrAd.setCellValueFactory(new PropertyValueFactory<>("ogr_ad"));
        column_OgrSoyad.setCellValueFactory(new PropertyValueFactory<>("ogr_soyad"));
        column_dersIsmi.setCellValueFactory(new PropertyValueFactory<>("ders_ismi"));
        column_onayla.setCellValueFactory(new PropertyValueFactory<>("onaylama"));
        
        
        liste=FXCollections.observableArrayList();
        liste.add(new OgrenciDersOnaylama(191919, "kara", "adbi", "adam"));
        
        liste.add(new OgrenciDersOnaylama(191919, "gogtug", "abi", "ada"));
        liste.add(new OgrenciDersOnaylama(191919, "kara", "adbi", "adam"));
        liste.add(new OgrenciDersOnaylama(202020, "ömer", "ada", "Bişiler"));
        liste.add(new OgrenciDersOnaylama(202020, "ömer", "ada", "Bişiler"));
        liste.add(new OgrenciDersOnaylama(202020, "ömer", "ada", "Bişiler"));
        
      
        
        
        combo_ogrenci.getItems().add(1);
       
        
        
     // sql ile bilgilerin listeye atanması işlemi yapılacak
       
       for (OgrenciDersOnaylama i : liste) {
    	  if (kontrol(i)) {
			combo_ogrenci.getItems().add(i.getOgrNum());
		}

	}
        
   }
    
    
    private boolean kontrol(OgrenciDersOnaylama a) {
    	
    	for(int i =0;i<combo_ogrenci.getItems().size();i++) {
    		if (combo_ogrenci.getItems().get(i) == a.getOgrNum()) {
				dublicate = Boolean.FALSE;
			}
    		else {
    			dublicate = Boolean.TRUE;
    		}
    	}
    	return dublicate;
 }
    
    
    public void ogretim_uyesi_id(int id) {
    	this.ogretmen_id=id;
    	
    }
    
    }
    
    


