package application;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import com.Mysql.VeritabaniBaglanti;
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
    private ObservableList<Ogrenci_Bilgi> ogr_bilgi;
    private ObservableList<Dersler> dersler;
    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
    
    
    @FXML
    void combo_ogrenci_Event(ActionEvent event) {
    	liste = FXCollections.observableArrayList();
    	if (combo_ogrenci.getSelectionModel().getSelectedItem()!=null) {
    		ogrenci_num=combo_ogrenci.getSelectionModel().getSelectedItem();
    		
    		String sql ="select ogrenci_bilgi.numara , ogrenci_bilgi.ad ,ogrenci_bilgi.soyad,dersler.ders_ad,ogrenci_ders.ders_durumu from ogrenci_ders,dersler,ogrenci_bilgi where ogrenci_ders.ogrenci_id=ogrenci_bilgi.id and ogrenci_ders.ders_id=dersler.id and ogrenci_ders.ders_durumu=2 and ogrenci_bilgi.numara="+String.valueOf(ogrenci_num);
    		try {
    			ResultSet dersdurumu = baglanti.VeriGetir(sql);
    			while(dersdurumu.next()) {
    				
    				liste.add(new OgrenciDersOnaylama(ogrenci_num, dersdurumu.getString("ad"), dersdurumu.getString("soyad"), dersdurumu.getString("ders_ad")));
    			}
			} catch (Exception e) {
				// TODO: handle exception
			}
    		tbl_onaylama.getItems().addAll(liste);
    		
    		
    		
    		
			
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
    	String sql = "update ogrenci_ders set ders_durumu=3 where ogrenci_id=? and ders_id=?";
    	 
    	if (combo_ogrenci.getSelectionModel().getSelectedItem()==null) {
    		
    		 Alert alert =new Alert(AlertType.INFORMATION);
    	     alert.setTitle("Dikkat ");
    	     alert.setHeaderText("Öğrenci seçimi");
    	     alert.setContentText("Lütfen Öğrenci Numarasını Seçiniz");
    	     alert.showAndWait();
			
		}
    	else {
    		
    		// onaylama butonuna basılan dersler sql ile update edilecek
    	
    		for (OgrenciDersOnaylama veri : liste) {
				if (veri.getOnaylama().isSelected()) {
					baglanti.Update(sql,getirOgrid(veri.getOgrNum()),getirDersid(veri.getDers_ismi()));
				}
			}
    		 Alert alert =new Alert(AlertType.INFORMATION);
    	     alert.setTitle("Başarılı");
    	     alert.setHeaderText("İşlem Başarılı");
    	     alert.setContentText("Öğrencilerin Dersleri Başarı İle Onaylandı.");
    	     alert.showAndWait();
    	}
    	
        

    }
   

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
        
        
        
        dersler=FXCollections.observableArrayList();
        try {
			ResultSet veritabani_dersler = baglanti.VeriGetir("select id,ders_ad from dersler");
			while(veritabani_dersler.next()) {
				dersler.add(new Dersler(veritabani_dersler.getInt("id"), veritabani_dersler.getString("ders_ad")));
			}
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
      
        
        
        
       
        
        
     // sql ile bilgilerin listeye atanması işlemi yapılacak
       
      ogr_bilgi=FXCollections.observableArrayList();
       try {
    	   ResultSet ogrenci_numaralar = baglanti.VeriGetir("select id,numara from ogrenci_bilgi");
    	   while(ogrenci_numaralar.next()) {
    		   combo_ogrenci.getItems().add(ogrenci_numaralar.getInt("numara"));
    		   ogr_bilgi.add(new Ogrenci_Bilgi(ogrenci_numaralar.getInt("id"), ogrenci_numaralar.getInt("numara")));
    	   }
		
	} catch (Exception e) {
		// TODO: handle exception
	}
        
   }
    
    private int getirOgrid(int numara) {
    	int id=0;
    	for(int i = 0;i<ogr_bilgi.size();i++) {
    		if (ogr_bilgi.get(i).getNum()==numara) {
				id =ogr_bilgi.get(i).getId();
			}
    	}
    	
    	
    	return id;
    	
    	}
    private int getirDersid(String ders_adi) {
    	
    	
    	int id1=0;
    	for(int i = 0;i<dersler.size();i++) {
    		if (dersler.get(i).getDers_adı().equals(ders_adi)) {
				id1 =dersler.get(i).getId();
			}
    	}
    	
    	
    	return id1;
    	
    	}
    
  
    
    
    public void ogretim_uyesi_id(int id) {
    	this.ogretmen_id=id;
    	
    }
    
    }
    
    class Ogrenci_Bilgi {
    	private int id;
    	private int num;
    	
    	public Ogrenci_Bilgi(int id, int numara) {
			this.id=id;
			this.num=numara;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
    	
    	
    	
    }
 

