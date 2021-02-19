package application;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController implements Initializable {
	@FXML 
	Label lblHello;
	@FXML 
	Button btnChange, btncopy, btnpaste, btnclear;
	@FXML 
	TextField tInput;
	@FXML 
	DatePicker tDate;
	String chaine;

	@Override
	public void initialize(URL Location, ResourceBundle arg1) {
		 
		tInput.textProperty().addListener((obs, oldText, newText) -> {
			 String pattern = newText;
			 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			 lblHello.setText(simpleDateFormat.format(new Date()));
		});
	}
	

	
	public void copyAct(ActionEvent e) {	
		tInput.copy();
	}
	public void clearAct(ActionEvent e) {	
		tInput.clear();
	}
	public void pasteAct(ActionEvent e) {	
		tInput.paste();
	}

	
	
}
