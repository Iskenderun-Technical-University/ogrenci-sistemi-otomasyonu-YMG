package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class OgrenciDuyurularController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl_baslık;

    @FXML
    private TextArea txt_area;
    

    @FXML
    void initialize() {
        assert lbl_baslık != null : "fx:id=\"lbl_baslık\" was not injected: check your FXML file 'OgrenciDuyurular.fxml'.";
        assert txt_area != null : "fx:id=\"txt_area\" was not injected: check your FXML file 'OgrenciDuyurular.fxml'.";
        
       
    }
    
    
    public void icerik_ata(String baslık, String icerik) {
    	
    	this.lbl_baslık.setText(baslık);
    	this.txt_area.setText(icerik);
    	
    }

}
