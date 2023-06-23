package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class OgrenciTranskriptController {
	private double[] harf_sayisal ;
	private int top_kredi=0;
	private int top_akts=0;
	private double kredi_harf =0;
	
	
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> colum_vize;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> column_ad;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> column_butunleme;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> column_final;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> column_harfnotu;

    @FXML
    private TableColumn<NotBilgisiTranskript, String> column_sonuc;

    @FXML
    private Label lbl_gno;

    @FXML
    private Label lbl_topakts;

    @FXML
    private Label lbl_topkredi;

    @FXML
    private TableView<NotBilgisiTranskript> tbl_notlar;

    @FXML
    void initialize() {
        assert colum_vize != null : "fx:id=\"colum_vize\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert column_ad != null : "fx:id=\"column_ad\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert column_butunleme != null : "fx:id=\"column_butunleme\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert column_final != null : "fx:id=\"column_final\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert column_harfnotu != null : "fx:id=\"column_harfnotu\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert column_sonuc != null : "fx:id=\"column_sonuc\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert lbl_gno != null : "fx:id=\"lbl_gno\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert lbl_topakts != null : "fx:id=\"lbl_topakts\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert lbl_topkredi != null : "fx:id=\"lbl_topkredi\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        assert tbl_notlar != null : "fx:id=\"tbl_notlar\" was not injected: check your FXML file 'OgrenciTranskript.fxml'.";
        column_ad.setCellValueFactory(new PropertyValueFactory<>("ders_adi"));
        colum_vize.setCellValueFactory(new PropertyValueFactory<>("vize"));
        column_final.setCellValueFactory(new PropertyValueFactory<>("final_sinav"));
        column_butunleme.setCellValueFactory(new PropertyValueFactory<>("butunleme"));
        column_sonuc.setCellValueFactory(new PropertyValueFactory<>("sonuc"));
        column_harfnotu.setCellValueFactory(new PropertyValueFactory<>("harf_not"));
        
        

    }
    public void Transkrip_ata(ObservableList<NotBilgisiTranskript> dersler) {
    	
    	
		
		  harf_sayisal=new double[dersler.size()];
		 
		
		
		
		for(int i=0;i<dersler.size();i++) {
			/*
			switch (dersler.get(i).getHarf_not()){
			case "AA": {
				
				harf_sayisal[i]=4;
			}
			case "BA": {
				harf_sayisal[i]=3.5;
			}
			case "BB": {
				harf_sayisal[i]=3;
			}
			case "CB": {
				harf_sayisal[i]=2.5;
			}
			case "CC": {
				harf_sayisal[i]=2;
			}
			case "DC": {
				harf_sayisal[i]=1.5;
			}
			case "DD": {
				harf_sayisal[i]=1;
			}
			case "FF": {
				harf_sayisal[i]=0;
			}
				
			}
			*/
			
			if(dersler.get(i).getHarf_not().equals("AA")) {
				harf_sayisal[i]=4;
			}
			else if (dersler.get(i).getHarf_not().equals("BA")) {
				harf_sayisal[i]=3.5;
			}
			else if (dersler.get(i).getHarf_not().equals("BB")) {
				harf_sayisal[i]=3;
			}
			else if (dersler.get(i).getHarf_not().equals("CB")) {
				harf_sayisal[i]=2.5;
			}
			else if (dersler.get(i).getHarf_not().equals("CC")) {
				harf_sayisal[i]=2;
			}
			else if (dersler.get(i).getHarf_not().equals("DC")) {
				harf_sayisal[i]=1.5;
			}
			else if (dersler.get(i).getHarf_not().equals("DD")) {
				harf_sayisal[i]=1;
			}
			else if (dersler.get(i).getHarf_not().equals("FF")) {
				harf_sayisal[i]=0;
			}
			
			top_akts+=dersler.get(i).getAkts();
			top_kredi+=dersler.get(i).getKredi();
			
		}
		for(int i =0;i<dersler.size();i++) {
			kredi_harf+=dersler.get(i).getKredi()*harf_sayisal[i];
			System.out.println(harf_sayisal[i]);
			
			
		}
		
		lbl_topakts.setText(String.valueOf(top_akts));
		lbl_topkredi.setText(String.valueOf(top_kredi));
		
		lbl_gno.setText(String.valueOf(kredi_harf/top_kredi));
		
		tbl_notlar.setItems(dersler);
		
		
		
		
		
	}

}
