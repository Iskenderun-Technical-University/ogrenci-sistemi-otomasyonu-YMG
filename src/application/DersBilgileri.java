package application;

public class DersBilgileri {
	
	String dersKodu;
	String dersAdı;
	int sınıf;
	int uyg_Saati;
	int lab_Saati;
	int teo_Saati;
	Boolean zorunlu;
	int kredi;
	int akts;
	
	
	 public DersBilgileri(String dersKodu,String dersAdı,int sınıf,int uyg_Saati, int lab_Saati, int teo_Saati,Boolean zorunlu ,int kredi , int akts) {
		this.dersKodu=dersKodu;
		this.dersAdı=dersAdı;
		this.sınıf=sınıf;
		this.uyg_Saati=uyg_Saati;
		this.lab_Saati=lab_Saati;
		this.teo_Saati=teo_Saati;
		this.zorunlu=zorunlu;
		this.kredi=kredi;
		this.akts=akts;
	}
	 
	 public DersBilgileri(String dersKodu,String dersAdı , int sınıf ,int kredi ) {
		 this.dersKodu=dersKodu;
		 this.dersAdı=dersAdı;
		 this.sınıf=sınıf;
		 this.kredi=kredi;
	}


	public String getDersKodu() {
		return dersKodu;
	}


	public void setDersKodu(String dersKodu) {
		this.dersKodu = dersKodu;
	}


	public String getDersAdı() {
		return dersAdı;
	}


	public void setDersAdı(String dersAdı) {
		this.dersAdı = dersAdı;
	}


	public int getSınıf() {
		return sınıf;
	}


	public void setSınıf(int sınıf) {
		this.sınıf = sınıf;
	}


	public int getUyg_Saati() {
		return uyg_Saati;
	}


	public void setUyg_Saati(int uyg_Saati) {
		this.uyg_Saati = uyg_Saati;
	}


	public int getLab_Saati() {
		return lab_Saati;
	}


	public void setLab_Saati(int lab_Saati) {
		this.lab_Saati = lab_Saati;
	}


	public int getTeo_Saati() {
		return teo_Saati;
	}


	public void setTeo_Saati(int teo_Saati) {
		this.teo_Saati = teo_Saati;
	}


	public Boolean getZorunlu() {
		return zorunlu;
	}


	public void setZorunlu(Boolean zorunlu) {
		this.zorunlu = zorunlu;
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
