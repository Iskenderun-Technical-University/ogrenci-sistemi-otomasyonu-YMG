package application;

public class OgretmenBilgi {
	
	private String ad;
	private String soyad;
	private String ku_ad;
	private String fakulte;
	private String bolum;
	private String mail;
	private String adres;
	
	public OgretmenBilgi(String ad,String soyad,String ku_ad,String fakulte,String bolum,String mail,String adres) {
		this.ad=ad;
		this.soyad=soyad;
		this.ku_ad=ku_ad;
		this.fakulte=fakulte;
		this.bolum=bolum;
		this.mail=mail;
		this.adres=adres;
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getKu_ad() {
		return ku_ad;
	}

	public void setKu_ad(String ku_ad) {
		this.ku_ad = ku_ad;
	}

	public String getFakulte() {
		return fakulte;
	}

	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
	

}


