package application;

public class NotBilgisiTranskript {
	private String ders_adi;
	private String vize;
	private String final_sinav;
	private String butunleme;
	private String sonuc;
	private String harf_not;
	private int kredi;
	private int akts;
	
	public NotBilgisiTranskript(String ad,String vize , String final_sinav,String but,String sonuc,String harf,int kredi,int akts) {
		this.ders_adi=ad;
		this.vize=vize;
		this.final_sinav=final_sinav;
		this.butunleme=but;
		this.sonuc=sonuc;
		this.harf_not=harf;
		this.kredi=kredi;
		this.akts=akts;
		
		
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

	public int getKredi() {
		return kredi;
	}

	public void setKredi(int kredi) {
		this.kredi = kredi;
	}

	public int getAkts() {
		return akts;
	}

	public void setAkts(int akts) {
		this.akts = akts;
	}
	
	
	

}
