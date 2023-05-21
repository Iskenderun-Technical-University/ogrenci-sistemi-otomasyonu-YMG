package application;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_admin;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_ogrenci;

    @FXML
    private Button btn_ogretmen;

    @FXML
    private Label lbl_captcha_o;

    @FXML
    private Label lbl_captcha_p;

    @FXML
    private Label lbl_ogrenci1;

    @FXML
    private Label lbl_reset;

    @FXML
    private Pane pnl_captcha;

    @FXML
    private Pane pnl_main;

    @FXML
    private Pane pnl_ogrenci;

    @FXML
    private Pane pnl_ogretmen;

    @FXML
    private TextField txt_captcha;

    @FXML
    private TextField txt_kulad;

    @FXML
    private TextField txt_okulno;

    @FXML
    private TextField txt_osifre;

    @FXML
    private TextField txt_psifre;

    @FXML
    void btn_admin_Click(ActionEvent event) {

    }

    @FXML
    void btn_login_Click(ActionEvent event) {

    }

    @FXML
    void btn_ogrenci_Click(ActionEvent event) {
    	
    	
    		TranslateTransition trans = new TranslateTransition();
        	FadeTransition fade1 = new FadeTransition();
        	FadeTransition fade2 = new FadeTransition();
        	
        	
        	
        	// öğretmen  panlei kapanış
        	fade2.setDuration(javafx.util.Duration.seconds(0.5));
        	fade2.setNode(pnl_ogretmen);
        	fade2.setFromValue(1);
        	fade2.setToValue(0);
        	fade2.play();
        	
        	// öğrenci paneli açılış
        	fade1.setDuration(javafx.util.Duration.seconds(1));
        	fade1.setDelay(javafx.util.Duration.seconds(1.5));
        	fade1.setNode(pnl_ogrenci);
        	fade1.setFromValue(0);
        	fade1.setToValue(1);
        	fade1.play();
        	
        	
        	
        	
        	
        	
        	trans.setDuration(javafx.util.Duration.seconds(1.5));
        	trans.setNode(pnl_main);
        	trans.setToX(0);
        	trans.setCycleCount(0);
        	trans.play();
        	btn_ogrenci.setDisable(true);
        	btn_ogretmen.setDisable(false);
    	
    	
    	
    	
    	
    	
    	
    	
    }

    @FXML
    void btn_ogretmen_Click(ActionEvent event) {
    	TranslateTransition trans = new TranslateTransition();
    	FadeTransition fade1 = new FadeTransition();
    	FadeTransition fade2 = new FadeTransition();
    	
    	
    	
    	// öğrenci panlei kapanış
    	fade2.setDuration(javafx.util.Duration.seconds(0.5));
    	fade2.setNode(pnl_ogrenci);
    	fade2.setFromValue(1);
    	fade2.setToValue(0);
    	fade2.play();
    	
    	// öğretmen paneli açılış
    	fade1.setDuration(javafx.util.Duration.seconds(1));
    	fade1.setDelay(javafx.util.Duration.seconds(1.5));
    	fade1.setNode(pnl_ogretmen);
    	fade1.setFromValue(0);
    	fade1.setToValue(1);
    	fade1.play();
    	
    	
    	
    	
    	
    	
    	trans.setDuration(javafx.util.Duration.seconds(1.5));
    	trans.setNode(pnl_main);
    	trans.setToX(599);
    	trans.setCycleCount(0);
    	trans.play();
    	
    	btn_ogrenci.setDisable(false);
    	btn_ogretmen.setDisable(true);
    	
    	
    	
    	
    	
    	// 599
    }

    @FXML
    void lbl_reset_Click(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_admin != null : "fx:id=\"btn_admin\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_login != null : "fx:id=\"btn_login\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_ogrenci != null : "fx:id=\"btn_ogrenci\" was not injected: check your FXML file 'Login.fxml'.";
        assert btn_ogretmen != null : "fx:id=\"btn_ogretmen\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_captcha_o != null : "fx:id=\"lbl_captcha_o\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_captcha_p != null : "fx:id=\"lbl_captcha_p\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_ogrenci1 != null : "fx:id=\"lbl_ogrenci1\" was not injected: check your FXML file 'Login.fxml'.";
        assert lbl_reset != null : "fx:id=\"lbl_reset\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_captcha != null : "fx:id=\"pnl_captcha\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_main != null : "fx:id=\"pnl_main\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_ogrenci != null : "fx:id=\"pnl_ogrenci\" was not injected: check your FXML file 'Login.fxml'.";
        assert pnl_ogretmen != null : "fx:id=\"pnl_ogretmen\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_captcha != null : "fx:id=\"txt_captcha\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_kulad != null : "fx:id=\"txt_kulad\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_okulno != null : "fx:id=\"txt_okulno\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_osifre != null : "fx:id=\"txt_osifre\" was not injected: check your FXML file 'Login.fxml'.";
        assert txt_psifre != null : "fx:id=\"txt_psifre\" was not injected: check your FXML file 'Login.fxml'.";
        
        
        FadeTransition fade = new FadeTransition();
        fade.setDuration(javafx.util.Duration.millis(100));
    	
    	fade.setNode(pnl_ogretmen);
    	fade.setFromValue(1);
    	fade.setToValue(0);
    	fade.play();
    	btn_ogrenci.setDisable(true);

    }

}
