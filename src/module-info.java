module consulta_cnpj {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
	exports gui to javafx.fxml;
}
