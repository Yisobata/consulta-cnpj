package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController  implements Initializable {

	@FXML
	private TextField txtFieldCnpj;
	
	@FXML 
	private Button btConsulta;
	
	@FXML
	public void onBtConsultaAction() {
		System.out.println("onBtConsultaAction");
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtFieldCnpj);
		Constraints.setTextFieldMaxLength(txtFieldCnpj, 8);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}
}
