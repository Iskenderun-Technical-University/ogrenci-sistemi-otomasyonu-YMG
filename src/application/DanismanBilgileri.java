package application;

public class DanismanBilgileri {
   private String danisman_ad;
   private String danisman_soyad;
   private String fakulte;
   private String bolum;
   private String mail;
   
   public DanismanBilgileri(String danisman_ad,String danisman_soyad,String fakulte,String bolum,String mail) {
	this.danisman_ad=danisman_ad;
	this.danisman_soyad=danisman_soyad;
	this.fakulte=fakulte;
	this.bolum=bolum;
	this.mail=mail;
}

public String getDanisman_ad() {
	return danisman_ad;
}

public void setDanisman_ad(String danisman_ad) {
	this.danisman_ad = danisman_ad;
}

public String getDanisman_soyad() {
	return danisman_soyad;
}

public void setDanisman_soyad(String danisman_soyad) {
	this.danisman_soyad = danisman_soyad;
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
   
   
   
}
