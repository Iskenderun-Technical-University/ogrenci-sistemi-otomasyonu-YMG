package application;

public class OgretmenNotGiris {
	private String ogrenci_ad;
	private String ogrenci_soyad;
	private int ogrenci_numara;
	private String ders_adi;
	private String vize;
	private String final_sinav;
	private String butunleme;
	private String sonuc;
	private String harf_not;
	
	public OgretmenNotGiris(int ogr_num,String ogr_ad,String ogr_soyad,String ad,String vize , String final_sinav,String but,String sonuc,String harf) {
		this.ders_adi=ad;
		this.vize=vize;
		this.final_sinav=final_sinav;
		this.butunleme=but;
		this.sonuc=sonuc;
		this.harf_not=harf;
		this.ogrenci_ad=ogr_ad;
		this.ogrenci_soyad=ogr_soyad;
		this.ogrenci_numara=ogr_num;
		
		
	}

	public String getDers_adi() {
		return ders_adi;
	}

	public void setDers_adi(String ders_adi) {
		this.ders_adi = ders_adi;
	}

	public String getVize() {
		return vize;
	}

	public void setVize(String vize) {
		this.vize = vize;
	}

	public String getFinal_sinav() {
		return final_sinav;
	}

	public void setFinal_sinav(String final_sinav) {
		this.final_sinav = final_sinav;
	}

	public String getButunleme() {
		return butunleme;
	}

	public void setButunleme(String butunleme) {
		this.butunleme = butunleme;
	}

	public String getSonuc() {
		return sonuc;
	}

	public void setSonuc(String sonuc) {
		this.sonuc = sonuc;
	}

	public String getHarf_not() {
		return harf_not;
	}

	public void setHarf_not(String harf_not) {
		this.harf_not = harf_not;
	}

	public String getOgrenci_ad() {
		return ogrenci_ad;
	}

	public void setOgrenci_ad(String ogrenci_ad) {
		this.ogrenci_ad = ogrenci_ad;
	}

	public String getOgrenci_soyad() {
		return ogrenci_soyad;
	}

	public void setOgrenci_soyad(String ogrenci_soyad) {
		this.ogrenci_soyad = ogrenci_soyad;
	}

	public int getOgrenci_numara() {
		return ogrenci_numara;
	}

	public void setOgrenci_numara(int ogrenci_numara) {
		this.ogrenci_numara = ogrenci_numara;
	}
	
	
	
	

}
