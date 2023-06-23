package application;

public class Bolum {

	private int id;
	private String bolum_ad;
	
	
	public Bolum(int id,String ad) {
		this.id=id;
		this.bolum_ad=ad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBolum_ad() {
		return bolum_ad;
	}


	public void setBolum_ad(String bolum_ad) {
		this.bolum_ad = bolum_ad;
	}
	
	
	
	 
	
}
