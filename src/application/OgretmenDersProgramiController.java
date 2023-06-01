package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgretmenDersProgramiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<DersProgrami, String> column_pazartesi_dersAdi;

    @FXML
    private TableColumn<DersProgrami, String> column_pazartesi_dersKodu;

    @FXML
    private TableColumn<DersProgrami, String> column_pazartesi_derslik;

    @FXML
    private TableColumn<DersProgrami, String> column_pazartesi_saat;

    @FXML
    private TableView<DersProgrami> tbl_carsamba;

    @FXML
    private TableColumn<DersProgrami, String> tbl_carsamba_dersAdi;

    @FXML
    private TableColumn<DersProgrami, String> tbl_carsamba_dersKodu;

    @FXML
    private TableColumn<DersProgrami, String> tbl_carsamba_derslik;

    @FXML
    private TableColumn<DersProgrami, String> tbl_carsamba_saat;

    @FXML
    private TableView<DersProgrami> tbl_cuma;

    @FXML
    private TableColumn<DersProgrami, String> tbl_cuma_dersAdi;

    @FXML
    private TableColumn<DersProgrami, String> tbl_cuma_dersKodu;

    @FXML
    private TableColumn<DersProgrami, String> tbl_cuma_derslik;

    @FXML
    private TableColumn<DersProgrami, String> tbl_cuma_saat;

    @FXML
    private TableView<DersProgrami> tbl_pazartesi;

    @FXML
    private TableView<DersProgrami> tbl_persembe;

    @FXML
    private TableColumn<DersProgrami, String> tbl_persembe_derdAdi;

    @FXML
    private TableColumn<DersProgrami, String> tbl_persembe_dersKodu;

    @FXML
    private TableColumn<DersProgrami, String> tbl_persembe_derslik;

    @FXML
    private TableColumn<DersProgrami, String> tbl_persembe_saat;

    @FXML
    private TableView<DersProgrami> tbl_sali;

    @FXML
    private TableColumn<DersProgrami, String> tbl_sali_dersAdi;

    @FXML
    private TableColumn<DersProgrami, String> tbl_sali_dersKodu;

    @FXML
    private TableColumn<DersProgrami, String> tbl_sali_derslik;

    @FXML
    private TableColumn<DersProgrami, String> tbl_sali_saat;

    @FXML
    void initialize() {
        assert column_pazartesi_dersAdi != null : "fx:id=\"column_pazartesi_dersAdi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert column_pazartesi_dersKodu != null : "fx:id=\"column_pazartesi_dersKodu\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert column_pazartesi_derslik != null : "fx:id=\"column_pazartesi_derslik\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert column_pazartesi_saat != null : "fx:id=\"column_pazartesi_saat\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_carsamba != null : "fx:id=\"tbl_carsamba\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_carsamba_dersAdi != null : "fx:id=\"tbl_carsamba_dersAdi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_carsamba_dersKodu != null : "fx:id=\"tbl_carsamba_dersKodu\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_carsamba_derslik != null : "fx:id=\"tbl_carsamba_derslik\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_carsamba_saat != null : "fx:id=\"tbl_carsamba_saat\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_cuma != null : "fx:id=\"tbl_cuma\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_cuma_dersAdi != null : "fx:id=\"tbl_cuma_dersAdi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_cuma_dersKodu != null : "fx:id=\"tbl_cuma_dersKodu\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_cuma_derslik != null : "fx:id=\"tbl_cuma_derslik\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_cuma_saat != null : "fx:id=\"tbl_cuma_saat\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_pazartesi != null : "fx:id=\"tbl_pazartesi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_persembe != null : "fx:id=\"tbl_persembe\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_persembe_derdAdi != null : "fx:id=\"tbl_persembe_derdAdi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_persembe_dersKodu != null : "fx:id=\"tbl_persembe_dersKodu\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_persembe_derslik != null : "fx:id=\"tbl_persembe_derslik\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_persembe_saat != null : "fx:id=\"tbl_persembe_saat\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_sali != null : "fx:id=\"tbl_sali\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_sali_dersAdi != null : "fx:id=\"tbl_sali_dersAdi\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_sali_dersKodu != null : "fx:id=\"tbl_sali_dersKodu\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_sali_derslik != null : "fx:id=\"tbl_sali_derslik\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";
        assert tbl_sali_saat != null : "fx:id=\"tbl_sali_saat\" was not injected: check your FXML file 'OgretmenDersProgrami.fxml'.";

    }
    
    public void Program_Ata(ObservableList<DersProgrami> pazartesi,ObservableList<DersProgrami> sali,ObservableList<DersProgrami> carsamba,ObservableList<DersProgrami> persembe,ObservableList<DersProgrami> cuma) {
		column_pazartesi_dersAdi.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        column_pazartesi_dersKodu.setCellValueFactory(new PropertyValueFactory<>("ders_kodu"));
        column_pazartesi_derslik.setCellValueFactory(new PropertyValueFactory<>("derslik"));
        column_pazartesi_saat.setCellValueFactory(new PropertyValueFactory<>("saat"));
   
        
        tbl_sali_dersAdi.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        tbl_sali_dersKodu.setCellValueFactory(new PropertyValueFactory<>("ders_kodu"));
        tbl_sali_derslik.setCellValueFactory(new PropertyValueFactory<>("derslik"));
        tbl_sali_saat.setCellValueFactory(new PropertyValueFactory<>("saat"));
       
         
        tbl_carsamba_dersAdi.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        tbl_carsamba_dersKodu.setCellValueFactory(new PropertyValueFactory<>("ders_kodu"));
        tbl_carsamba_derslik.setCellValueFactory(new PropertyValueFactory<>("derslik"));
        tbl_carsamba_saat.setCellValueFactory(new PropertyValueFactory<>("saat"));
        
        
        tbl_persembe_derdAdi.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        tbl_persembe_dersKodu.setCellValueFactory(new PropertyValueFactory<>("ders_kodu"));
        tbl_persembe_derslik.setCellValueFactory(new PropertyValueFactory<>("derslik"));
        tbl_persembe_saat.setCellValueFactory(new PropertyValueFactory<>("saat"));
       
        
        tbl_cuma_dersAdi.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        tbl_cuma_dersKodu.setCellValueFactory(new PropertyValueFactory<>("ders_kodu"));
        tbl_cuma_derslik.setCellValueFactory(new PropertyValueFactory<>("derslik"));
        tbl_cuma_saat.setCellValueFactory(new PropertyValueFactory<>("saat"));
       
        
       tbl_pazartesi.getItems().setAll(pazartesi);
       tbl_sali.getItems().setAll(sali);
       tbl_carsamba.getItems().setAll(carsamba);
       tbl_persembe.getItems().setAll(persembe);
       tbl_cuma.getItems().setAll(cuma);
	}

}
