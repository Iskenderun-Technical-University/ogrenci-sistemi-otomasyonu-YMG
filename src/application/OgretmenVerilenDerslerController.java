package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgretmenVerilenDerslerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<DersBilgileri, String> col_Dersadi;

    @FXML
    private TableColumn<DersBilgileri, String> col__DersKodu;

    @FXML
    private TableColumn<DersBilgileri, Integer> col_kredi;

    @FXML
    private TableColumn<DersBilgileri, Integer> col_sinif;

    @FXML
    private TableView<DersBilgileri> tbl_dersler;

    @FXML
    void initialize() {
        assert col_Dersadi != null : "fx:id=\"col_Dersadi\" was not injected: check your FXML file 'OgretmenVerilenDersler.fxml'.";
        assert col__DersKodu != null : "fx:id=\"col__DersKodu\" was not injected: check your FXML file 'OgretmenVerilenDersler.fxml'.";
        assert col_kredi != null : "fx:id=\"col_kredi\" was not injected: check your FXML file 'OgretmenVerilenDersler.fxml'.";
        assert col_sinif != null : "fx:id=\"col_sinif\" was not injected: check your FXML file 'OgretmenVerilenDersler.fxml'.";
        assert tbl_dersler != null : "fx:id=\"tbl_dersler\" was not injected: check your FXML file 'OgretmenVerilenDersler.fxml'.";
        
        col_Dersadi.setCellValueFactory(new PropertyValueFactory<>("dersAdı"));
        col__DersKodu.setCellValueFactory(new PropertyValueFactory<>("dersKodu"));
        col_kredi.setCellValueFactory(new PropertyValueFactory<>("kredi"));
        col_sinif.setCellValueFactory(new PropertyValueFactory<>("sınıf"));
    }
    
    public void deger_Ata(ObservableList<DersBilgileri> bilgiler) {
    	tbl_dersler.getItems().addAll(bilgiler);
    }
    

}
