package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class OgrenciProgramDersleriController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<DersBilgileri, String> column__dersadı;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_akts;

    @FXML
    private TableColumn<DersBilgileri, String> column_derskodu;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_kredi;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_labsaati;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_sınıf;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_teosaati;

    @FXML
    private TableColumn<DersBilgileri, Integer> column_uygsaati;

    @FXML
    private TableColumn<DersBilgileri, Boolean> column_zornlu;

    @FXML
    private TableView<DersBilgileri> table_view;
    
    
    private   ObservableList<DersBilgileri> veriler;

    @FXML
    void initialize() {
        assert column__dersadı != null : "fx:id=\"column__dersadı\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_akts != null : "fx:id=\"column_akts\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_derskodu != null : "fx:id=\"column_derskodu\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_kredi != null : "fx:id=\"column_kredi\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_labsaati != null : "fx:id=\"column_labsaati\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_sınıf != null : "fx:id=\"column_sınıf\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_teosaati != null : "fx:id=\"column_teosaati\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_uygsaati != null : "fx:id=\"column_uygsaati\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert column_zornlu != null : "fx:id=\"column_zornlu\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
        assert table_view != null : "fx:id=\"table_view\" was not injected: check your FXML file 'OgrenciProgramDersleri.fxml'.";
     
        column__dersadı.setCellValueFactory(new PropertyValueFactory<>("dersAdı"));
        column_derskodu.setCellValueFactory(new PropertyValueFactory<>("dersKodu"));
        column_sınıf.setCellValueFactory(new PropertyValueFactory<>("sınıf"));
        column_uygsaati.setCellValueFactory(new PropertyValueFactory<>("uyg_Saati"));
        column_labsaati.setCellValueFactory(new PropertyValueFactory<>("lab_Saati"));
        column_teosaati.setCellValueFactory(new PropertyValueFactory<>("teo_Saati"));
        column_zornlu.setCellValueFactory(new PropertyValueFactory<>("zorunlu"));
        column_kredi.setCellValueFactory(new PropertyValueFactory<>("kredi"));
        column_akts.setCellValueFactory(new PropertyValueFactory<>("akts"));
        veriler=FXCollections.observableArrayList();
        
        veriler.add(new DersBilgileri("BM12", "Bilgisasyar", 1, 2, 0, 2, Boolean.TRUE, 3, 2));
        veriler.add(new DersBilgileri("BM-891", "Anlayana", 2, 0, 0, 4, Boolean.TRUE, 2, 4));
        table_view.setItems(veriler);
        
        
        
        
    }
    
    public void setTableWiew_Data(ObservableList<DersBilgileri> liste) {
    	table_view.setItems(liste);
    }

}
