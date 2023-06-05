package application;

public class OgrenciBilgiGoruntule {
	
	private String ogrenci_ad;
	private String ogrenci_soyad;
	private int no;
	private String tc;
	private String mail;
	private String adres;
	private int sinif;
	
	public OgrenciBilgiGoruntule(String ogrenci_ad ,String ogrenci_soyad,int no,String tc,String mail,String adres,int sinif) {
		this.ogrenci_ad=ogrenci_ad;
		this.ogrenci_soyad=ogrenci_soyad;
		this.no=no;
		this.tc=tc;
		this.mail=mail;
		this.adres=adres;
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

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
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

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}
	
	

}
