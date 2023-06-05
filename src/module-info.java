module OBS {
	requires transitive javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires transitive javafx.graphics;
	requires java.sql;
	requires mysql.connector.j;
	

	
	
	
	opens application to javafx.graphics, javafx.fxml;
	exports application;
	
	
	
}
