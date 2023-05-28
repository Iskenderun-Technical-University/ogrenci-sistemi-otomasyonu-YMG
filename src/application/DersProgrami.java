package application;

public class DersProgrami {
	
	String saat;
	String ders_kodu;
	String ders_adi;
	String derslik;
	String ogretim_elemani_id;
	
	public DersProgrami(String saat,String ders_kodu,String ders_adi,String derslik, String ogretim_elemani_id) {
		this.saat=saat;
		this.ders_kodu=ders_kodu;
		this.ders_adi=ders_adi;
		this.derslik=derslik;
		this.ogretim_elemani_id=ogretim_elemani_id;
		
	}

	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public String getDers_kodu() {
		return ders_kodu;
	}

	public void setDers_kodu(String ders_kodu) {
		this.ders_kodu = ders_kodu;
	}

	public String getDers_adi() {
		return ders_adi;
	}

	public void setDers_adi(String ders_adi) {
		this.ders_adi = ders_adi;
	}

	public String getDerslik() {
		return derslik;
	}

	public void setDerslik(String derslik) {
		this.derslik = derslik;
	}

	public String getOgretim_elemani_id() {
		return ogretim_elemani_id;
	}

	public void setOgretim_elemani_id(String ogretim_elemani_id) {
		this.ogretim_elemani_id = ogretim_elemani_id;
	}
	
	

}
