module COMP333Project {
	requires javafx.controls;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
}
