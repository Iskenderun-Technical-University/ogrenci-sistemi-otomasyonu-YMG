package com.Mysql;

import java.sql.*;


public class VeritabaniBaglanti {
static Connection conn = null;
	
	public static Connection Baglan() {
		
		
		try {
			/// "jdbc:mysql://ServerIPAdresi//db_ismi" , "kullaniciadi", "sifre"
			conn = DriverManager.getConnection("jdbc:mysql://localhost/obs","root","");
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			return null;
		}
		
	}
}
