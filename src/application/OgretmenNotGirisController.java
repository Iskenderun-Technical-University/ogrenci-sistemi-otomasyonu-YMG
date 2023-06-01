package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class OgretmenNotGirisController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_notlarıGir;

    @FXML
    private Button btn_sistemekaydet;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_but;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_dersad;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_final;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_harfnotu;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_ograd;

    @FXML
    private TableColumn<OgretmenNotGiris, Integer> col_ogrnum;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_ogrsoyad;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_sonuc;

    @FXML
    private TableColumn<OgretmenNotGiris, String> col_vize;

    @FXML
    private ComboBox<String> combo_harfnotu;

    @FXML
    private TableView<OgretmenNotGiris> tbt_notlar;

    @FXML
    private TextField txt_but;

    @FXML
    private TextField txt_final;

    @FXML
    private TextField txt_sonuc;

    @FXML
    private TextField txt_vize;
    
    @FXML
    void btn_notlarıGir_Click(ActionEvent event) {

    }

    @FXML
    void btn_sistemekaydet_Click(ActionEvent event) {

    }
    
    

    @FXML
    void initialize() {
        assert btn_notlarıGir != null : "fx:id=\"btn_notlarıGir\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert btn_sistemekaydet != null : "fx:id=\"btn_sistemekaydet\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_but != null : "fx:id=\"col_but\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_dersad != null : "fx:id=\"col_dersad\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_final != null : "fx:id=\"col_final\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_harfnotu != null : "fx:id=\"col_harfnotu\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_ograd != null : "fx:id=\"col_ograd\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_ogrnum != null : "fx:id=\"col_ogrnum\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_ogrsoyad != null : "fx:id=\"col_ogrsoyad\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_sonuc != null : "fx:id=\"col_sonuc\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert col_vize != null : "fx:id=\"col_vize\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert combo_harfnotu != null : "fx:id=\"combo_harfnotu\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert tbt_notlar != null : "fx:id=\"tbt_notlar\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert txt_but != null : "fx:id=\"txt_but\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert txt_final != null : "fx:id=\"txt_final\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert txt_sonuc != null : "fx:id=\"txt_sonuc\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        assert txt_vize != null : "fx:id=\"txt_vize\" was not injected: check your FXML file 'OgretmenNotGiris.fxml'.";
        
        col_but.setCellValueFactory(new PropertyValueFactory<>("butunleme"));
        col_final.setCellValueFactory(new PropertyValueFactory<>("final_sinav"));
        col_vize.setCellValueFactory(new PropertyValueFactory<>("vize"));
        
        col_ograd.setCellValueFactory(new PropertyValueFactory<>("ogrenci_ad"));
        col_ogrsoyad.setCellValueFactory(new PropertyValueFactory<>("ogrenci_soyad"));
        col_ogrnum.setCellValueFactory(new PropertyValueFactory<>("ogrenci_numara"));
        col_dersad.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        col_sonuc.setCellValueFactory(new PropertyValueFactory<>("sonuc"));
        col_harfnotu.setCellValueFactory(new PropertyValueFactory<>("harf_not"));
        
        
        tbt_notlar.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txt_vize.setText(tbt_notlar.getSelectionModel().getSelectedItem().getVize());
                txt_final.setText(tbt_notlar.getSelectionModel().getSelectedItem().getFinal_sinav());
                txt_but.setText(tbt_notlar.getSelectionModel().getSelectedItem().getButunleme());
                txt_sonuc.setText(tbt_notlar.getSelectionModel().getSelectedItem().getSonuc());
                
            }
        });
        
       
        
    }
    
    public void deger_ata(ObservableList<OgretmenNotGiris> liste) {
    	 
    	tbt_notlar.getItems().addAll(liste);
    }

}
