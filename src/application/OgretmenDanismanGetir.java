package application;

public class OgretmenDanismanGetir {
	
	private String ogrenci_ad;
	private String ogrenci_soyad;
	private int no;
	private String bolum;
	private String mail;
	private int ogretim;
	private int sinif;
	
	public OgretmenDanismanGetir(String ogrenci_ad ,String ogrenci_soyad,int no,String tc,String mail,String adres,int sinif,String bolum, int ogretim) {
		this.ogrenci_ad=ogrenci_ad;
		this.ogrenci_soyad=ogrenci_soyad;
		this.no=no;
		this.bolum=bolum;
		this.ogretim=ogretim;
		this.mail=mail;
		
		this.sinif=sinif;
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

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}



	public String getBolum() {
		return bolum;
	}



	public void setBolum(String bolum) {
		this.bolum = bolum;
	}



	public int getOgretim() {
		return ogretim;
	}



	public void setOgretim(int ogretim) {
		this.ogretim = ogretim;
	}
	
	

}
