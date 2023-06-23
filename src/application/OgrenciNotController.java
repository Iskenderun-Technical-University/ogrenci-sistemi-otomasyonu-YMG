package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgrenciNotController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<NotBilgisi, String> colum_vize;

    @FXML
    private TableColumn<NotBilgisi, String> column_ad;

    @FXML
    private TableColumn<NotBilgisi, String> column_butunleme;

    @FXML
    private TableColumn<NotBilgisi, String> column_final;

    @FXML
    private TableColumn<NotBilgisi, String> column_harfnotu;

    @FXML
    private TableColumn<NotBilgisi, String> column_sonuc;

    @FXML
    private TableView<NotBilgisi> tbl_notlar;

    @FXML
    void initialize() {
        assert colum_vize != null : "fx:id=\"colum_vize\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert column_ad != null : "fx:id=\"column_ad\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert column_butunleme != null : "fx:id=\"column_butunleme\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert column_final != null : "fx:id=\"column_final\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert column_harfnotu != null : "fx:id=\"column_harfnotu\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert column_sonuc != null : "fx:id=\"column_sonuc\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        assert tbl_notlar != null : "fx:id=\"tbl_notlar\" was not injected: check your FXML file 'OgrenciNot.fxml'.";
        
        
        column_ad.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        colum_vize.setCellValueFactory(new PropertyValueFactory<>("vize"));
        column_final.setCellValueFactory(new PropertyValueFactory<>("final_sinav"));
        column_butunleme.setCellValueFactory(new PropertyValueFactory<>("butunleme"));
        column_sonuc.setCellValueFactory(new PropertyValueFactory<>("sonuc"));
        column_harfnotu.setCellValueFactory(new PropertyValueFactory<>("harf_not"));

    }
    public void not_Goster(ObservableList<NotBilgisi> notlistesi) {
    	this.tbl_notlar.setItems(notlistesi);
    	
    }

}
