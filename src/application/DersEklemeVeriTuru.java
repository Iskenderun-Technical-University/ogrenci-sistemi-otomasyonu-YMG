package application;

import javafx.scene.control.CheckBox;

public class DersEklemeVeriTuru {
	
	private CheckBox secili;
	private String Ders_kodu;
	private String Ders_Adı;
	private String Ogretim_adi;
	
	public DersEklemeVeriTuru(String ders_kodu ,String ders_adı,String ogretim_adi) {
		this.Ders_Adı=ders_adı;
		this.Ders_kodu=ders_kodu;
		this.Ogretim_adi=ogretim_adi;
		this.secili=new CheckBox();
		
		
	}

	public CheckBox getSecili() {
		return secili;
	}

	public void setSecili(CheckBox secili) {
		this.secili = secili;
	}

	public String getDers_kodu() {
		return Ders_kodu;
	}

	public void setDers_kodu(String ders_kodu) {
		Ders_kodu = ders_kodu;
	}

	public String getDers_Adı() {
		return Ders_Adı;
	}

	public void setDers_Adı(String ders_Adı) {
		Ders_Adı = ders_Adı;
	}

	public String getOgretim_adi() {
		return Ogretim_adi;
	}

	public void setOgretim_adi(String ogretim_adi) {
		Ogretim_adi = ogretim_adi;
	}
	

}
