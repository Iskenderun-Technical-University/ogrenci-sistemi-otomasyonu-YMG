package application;

import javafx.scene.control.CheckBox;

public class OgrenciDersOnaylama {
	
	private int ogrNum;
	private String ogr_ad;
	private String ogr_soyad;
	private String ders_ismi;
	private CheckBox onaylama;
	
	
	public OgrenciDersOnaylama(int numara,String ad ,String soyad , String ders_ismi) {
		this.onaylama=new CheckBox();
		this.ogrNum=numara;
		this.ogr_ad=ad;
		this.ogr_soyad=soyad;
		this.ders_ismi=ders_ismi;
		
		
	}


	public int getOgrNum() {
		return ogrNum;
	}


	public void setOgrNum(int ogrNum) {
		this.ogrNum = ogrNum;
	}


	public String getOgr_ad() {
		return ogr_ad;
	}


	public void setOgr_ad(String ogr_ad) {
		this.ogr_ad = ogr_ad;
	}


	public String getOgr_soyad() {
		return ogr_soyad;
	}


	public void setOgr_soyad(String ogr_soyad) {
		this.ogr_soyad = ogr_soyad;
	}


	public String getDers_ismi() {
		return ders_ismi;
	}


	public void setDers_ismi(String ders_ismi) {
		this.ders_ismi = ders_ismi;
	}


	public CheckBox getOnaylama() {
		return onaylama;
	}


	public void setOnaylama(CheckBox onaylama) {
		this.onaylama = onaylama;
	}
	
	
	

}
