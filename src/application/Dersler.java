package application;

public class Dersler {

	
	 private int id;
	 private String ders_adı;
	 
	 public Dersler(int id,String dersadi) {
		this.id=id;
		this.ders_adı=dersadi;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDers_adı() {
		return ders_adı;
	}

	public void setDers_adı(String ders_adı) {
		this.ders_adı = ders_adı;
	}
	 
	 
}
