package com.Mysql;

import java.sql.*;

import application.MD5_Sifrele;


public class VeritabaniBaglanti {
static Connection conn = null;

private PreparedStatement sorguIfadesi=null;
private ResultSet getirilen=null;
	
	public static Connection Baglan() {
		
		
		try {
			/// "jdbc:mysql://ServerIPAdresi//db_ismi" , "kullaniciadi", "sifre"
			conn = DriverManager.getConnection("jdbc:mysql://localhost/obs","root","");
			return conn;
		} catch (Exception e) {
			
			System.out.println(e.getMessage().toString());
			return null;
		}
		
	}
	
	
	public void Insert(String sql,String value1,String value2,String value3,String value4,String value5,String value6,String value7,String value8) {
		
		try {
			
			sorguIfadesi=Baglan().prepareStatement(sql);
			sorguIfadesi.setString(1, value1);
			sorguIfadesi.setString(2, value2);
			sorguIfadesi.setString(3, value3);
			sorguIfadesi.setString(4, value4);
			sorguIfadesi.setString(5, value5);
			sorguIfadesi.setString(6, value6);
			sorguIfadesi.setString(7, value7);
			sorguIfadesi.setString(8, value8);
			
		    sorguIfadesi.executeUpdate();
		    
		  
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		
	}
	
public void Insert(String sql,String value1,String value2,String value3,int value4,int value5,int value6,int value7,String value8,int value9 , int value10 ,int value11) {
		
		try {
			
			sorguIfadesi=Baglan().prepareStatement(sql);
			sorguIfadesi.setString(1, value1);
			sorguIfadesi.setString(2, value2);
			sorguIfadesi.setString(3, value3);
			sorguIfadesi.setInt(4, value4);
			sorguIfadesi.setInt(5, value5);
			sorguIfadesi.setInt(6, value6);
			sorguIfadesi.setInt(7, value7);
			sorguIfadesi.setString(8, value8);
			sorguIfadesi.setInt(9, value9);
			sorguIfadesi.setInt(10, value10);
			sorguIfadesi.setInt(11, value11);
			
		    sorguIfadesi.executeUpdate();
		    
		  
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		
	}

public void Insert(String sql,String value1,String value2,String value3,int value4,int value5,int value6,int value7,String value8,int value9 , int value10 ,int value11,int value12) {
	
	try {
		
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, value1);
		sorguIfadesi.setString(2, value2);
		sorguIfadesi.setString(3, value3);
		sorguIfadesi.setInt(4, value4);
		sorguIfadesi.setInt(5, value5);
		sorguIfadesi.setInt(6, value6);
		sorguIfadesi.setInt(7, value7);
		sorguIfadesi.setString(8, value8);
		sorguIfadesi.setInt(9, value9);
		sorguIfadesi.setInt(10, value10);
		sorguIfadesi.setInt(11, value11);
		sorguIfadesi.setInt(12, value12);
		
	    sorguIfadesi.executeUpdate();
	    
	  
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
	
}
public void Insert(String sql,int value1,int value2,int value3) {
	
	try {
		
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, value1);
		sorguIfadesi.setInt(2, value2);
		sorguIfadesi.setInt(3, value3);
		
		
	    sorguIfadesi.executeUpdate();
	    
	  
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
	
}

public void Insert(String sql,String bolum,int sinif,int ogretim,String bas_saat,String bit_saat ,int haftanin_gunu,int ders_id) {
	
	try {
		
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, bolum);
		sorguIfadesi.setInt(2, sinif);
		sorguIfadesi.setInt(3, ogretim);
		sorguIfadesi.setString(4, bas_saat);
		sorguIfadesi.setString(5, bit_saat);
		sorguIfadesi.setInt(6, haftanin_gunu);
		sorguIfadesi.setInt(7, ders_id);
		
		
	    sorguIfadesi.executeUpdate();
	    
	  
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
	
}

public void Insert(String sql,String bolum,String baslik,String icerik) {
	
	try {
		
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, bolum);
        sorguIfadesi.setString(2, baslik);
		sorguIfadesi.setString(3, icerik);
		
		
		
	    sorguIfadesi.executeUpdate();
	    
	  
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
	
}

public void Update(String sql,int ogr_id,int ders_i) {
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, ogr_id);
		sorguIfadesi.setInt(2, ders_i);
		
		sorguIfadesi.executeUpdate();
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
}

public void Update(String sql,String vize,String final_not , String but , String sonuc,String harf) {
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, vize);
		sorguIfadesi.setString(2, final_not);
		sorguIfadesi.setString(3, but);
		sorguIfadesi.setString(4, sonuc);
		sorguIfadesi.setString(5, harf);
		
		sorguIfadesi.executeUpdate();
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
}

public void Update(String sql,String vize,String final_not , String but , String sonuc) {
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, vize);
		sorguIfadesi.setString(2, final_not);
		sorguIfadesi.setString(3, but);
		sorguIfadesi.setString(4, sonuc);
		
		
		sorguIfadesi.executeUpdate();
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
}

public void Update(String sql,String sifre,int id) {
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, sifre);
		sorguIfadesi.setInt(2, id);
		
		
		
		sorguIfadesi.executeUpdate();
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
}

public void Update(String sql,String bolum,String baslik , String icerik ) {
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, bolum);
		sorguIfadesi.setString(2, baslik);
		sorguIfadesi.setString(3, icerik);
		
		
		
		sorguIfadesi.executeUpdate();
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
}



public boolean Kontrol(String sql,String kul_ad,String sifre) {
	MD5_Sifrele sifrele = new MD5_Sifrele();
	boolean deger=false;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, kul_ad);
		sorguIfadesi.setString(2, sifrele.getMd5(sifre));
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger=true;
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}

public boolean Kontrol(String sql,int numara,String sifre) {
	MD5_Sifrele sifrele = new MD5_Sifrele();
	boolean deger=false;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, numara);
		sorguIfadesi.setString(2, sifrele.getMd5(sifre));
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger=true;
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}

public boolean Var_mı(String sql,String value1) {
	
	boolean deger=false;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, value1);
		
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger=true;
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}


public int id_Getir(String sql,String kul_ad,String sifre) {
	MD5_Sifrele sifrele = new MD5_Sifrele();
	int deger=0;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, kul_ad);
		sorguIfadesi.setString(2, sifrele.getMd5(sifre));
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger = getirilen.getInt("id");
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}

public int id_Getir(String sql,String value1) {
	
	int deger=0;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setString(1, value1);
		
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger = getirilen.getInt("id");
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}



public int id_Getir(String sql,int value1,int value2) {
	
	int deger=0;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, value1);
		sorguIfadesi.setInt(2, value2);
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger = getirilen.getInt("id");
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}



public int id_Getir(String sql,int value1,String value2) {
	
	int deger=0;
	try {
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, value1);
		sorguIfadesi.setString(2, value2);
		
		getirilen = sorguIfadesi.executeQuery();
		
		if (getirilen.next()) {
			deger = getirilen.getInt("id");
		}
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	return deger;
}

public void Insert(String sql,int numara,String ad,String soyad,String tc,String sifre,String fakulte,String bolum,int ogretim,int sinif , String mail ,String adres,int danisman1 , int danisman2) {
	
	try {
		
		sorguIfadesi=Baglan().prepareStatement(sql);
		sorguIfadesi.setInt(1, numara);
		sorguIfadesi.setString(2, ad);
		sorguIfadesi.setString(3, soyad);
		sorguIfadesi.setString(4, tc);
		sorguIfadesi.setString(5, sifre);
		sorguIfadesi.setString(6, fakulte);
		sorguIfadesi.setString(7, bolum);
		sorguIfadesi.setInt(8, ogretim);
		sorguIfadesi.setInt(9, sinif);
		sorguIfadesi.setString(10, mail);
		sorguIfadesi.setString(11, adres);
		sorguIfadesi.setInt(12, danisman1);
		sorguIfadesi.setInt(13, danisman2);
		
	    sorguIfadesi.executeUpdate();
	    
	  
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
	}
	
	
}
	
	public ResultSet VeriGetir(String sql){
		
		
		try {
			sorguIfadesi=Baglan().prepareStatement(sql);
			getirilen = sorguIfadesi.executeQuery();
			
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return getirilen;
	}
	

}
