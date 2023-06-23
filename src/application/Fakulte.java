package application;

public class Fakulte {
	
	int id;
	String fak_ad;
	
	public Fakulte(int id, String fakulte_ad) {
		this.id=id;
		this.fak_ad=fakulte_ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFak_ad() {
		return fak_ad;
	}

	public void setFak_ad(String fak_ad) {
		this.fak_ad = fak_ad;
	}
	
	

}
