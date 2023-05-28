package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgrenciDersEklemeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<DersEklemeVeriTuru> tbl_onaybek;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_DersAdı;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_dersKodu;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaybek_ogretimUyesi;

    @FXML
    private TableView<DersEklemeVeriTuru> tbl_onaylanmamıs;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersAdı;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersKodu;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_dersSec;

    @FXML
    private TableColumn<DersEklemeVeriTuru, String> tbl_onaylanmamıs_ogretimUyesi;
    
    
    

    @FXML
    void initialize() {
        assert tbl_onaybek != null : "fx:id=\"tbl_onaybek\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_DersAdı != null : "fx:id=\"tbl_onaybek_DersAdı\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_dersKodu != null : "fx:id=\"tbl_onaybek_dersKodu\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaybek_ogretimUyesi != null : "fx:id=\"tbl_onaybek_ogretimUyesi\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs != null : "fx:id=\"tbl_onaylanmamıs\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersAdı != null : "fx:id=\"tbl_onaylanmamıs_dersAdı\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersKodu != null : "fx:id=\"tbl_onaylanmamıs_dersKodu\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_dersSec != null : "fx:id=\"tbl_onaylanmamıs_dersSec\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        assert tbl_onaylanmamıs_ogretimUyesi != null : "fx:id=\"tbl_onaylanmamıs_ogretimUyesi\" was not injected: check your FXML file 'OgrenciDersEkleme.fxml'.";
        
        tbl_onaybek_DersAdı.setCellValueFactory(new PropertyValueFactory<>("Ders_Adı"));
        tbl_onaybek_dersKodu.setCellValueFactory(new PropertyValueFactory<>("Ders_kodu"));
        tbl_onaybek_ogretimUyesi.setCellValueFactory(new PropertyValueFactory<>("Ogretim_adi"));
        tbl_onaylanmamıs_dersAdı.setCellValueFactory(new PropertyValueFactory<>("Ders_Adı"));
        tbl_onaylanmamıs_dersKodu.setCellValueFactory(new PropertyValueFactory<>("Ders_kodu"));
        tbl_onaylanmamıs_dersSec.setCellValueFactory(new PropertyValueFactory<>("secili"));
        tbl_onaylanmamıs_ogretimUyesi.setCellValueFactory(new PropertyValueFactory<>("Ogretim_adi"));
        
        
       
    }
    
    public void Ders_Goruntuleme(ObservableList<DersEklemeVeriTuru> yeni_ders,ObservableList<DersEklemeVeriTuru> onaylanma_bekleyen) {
    	this.tbl_onaybek.setItems(yeni_ders);
    	this.tbl_onaylanmamıs.setItems(onaylanma_bekleyen);
    }
    

}
