package main.fontViewer;

import javafx.scene.text.Font;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class newController {

	@FXML
	private ComboBox testComboBox;
	@FXML
	private Button applyButton;
	@FXML
	private Label titleLabel;
    @FXML
    private TextArea mainTextArea;

	public newController() {

	}
	
	@FXML
	void populateFonts() throws IOException{
		testComboBox.getItems().clear();
		ObservableList<String> options = FXCollections.observableArrayList();
		for (String f : getFontList()) {
			if(!options.contains(f)) {
				options.add(f);
			}
		}
		testComboBox.getItems().addAll(options);
		
	}
	
	private List<String> getFontList() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		List<String> allFonts = Font.getFontNames();
		return allFonts;
	}
	
	@FXML
	private void applyFont() throws IOException{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		testComboBox.getValue();
		List<String> allFonts = javafx.scene.text.Font.getFontNames();//ge.getAllFonts();
		
		String foundFont = null;
		
		for (String f : allFonts) {
			if (f == testComboBox.getValue()) {
				foundFont = f;
			}
		}
		
//		exampleText.setFont(new Font(foundFont, 20.0));
//		mainTextField.setFont(new Font(foundFont, 20.0));
		titleLabel.setFont(new Font(foundFont, 36.0));
        mainTextArea.setFont(new Font(foundFont, 20.0));	
		
	}
}
