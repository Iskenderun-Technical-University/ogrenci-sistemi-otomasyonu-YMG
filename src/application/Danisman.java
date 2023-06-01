package application;

public class Danisman {
	private int id;
	private String danısman_Ad;
	private String danısman_SoyAd;
	
	public Danisman(int id, String danısman_Ad,String danısman_Soyad) {
		this.danısman_Ad=danısman_Ad;
		this.danısman_SoyAd=danısman_Soyad;
		this.id=id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDanısman_Ad() {
		return danısman_Ad;
	}

	public void setDanısman_Ad(String danısman_Ad) {
		this.danısman_Ad = danısman_Ad;
	}

	public String getDanısman_SoyAd() {
		return danısman_SoyAd;
	}

	public void setDanısman_SoyAd(String danısman_SoyAd) {
		this.danısman_SoyAd = danısman_SoyAd;
	}


	
	
	
	
}