package test.testProject;

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

public class newController {

	@FXML
	private ComboBox testComboBox;
	@FXML
	private Button applyButton;
	@FXML
	private Label exampleText;
	
	@FXML
	private void exampleMethod() throws IOException{
		System.out.printf("This is an example\n");
		testComboBox.getItems().clear();
		//getFontList();
		ObservableList<String> options = FXCollections.observableArrayList();
		for (String f : getFontList()) {
			options.add(f);
		}
		System.out.printf("%s\n", options);
		testComboBox.getItems().addAll(options);
		
	}
	
	private List<String> getFontList() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		List<String> allFonts = Font.getFontNames();//ge.getAllFonts();
		for (String f : allFonts) {
//			System.out.printf("%s\n", f);
		}
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
				System.out.println("Found it!");
				System.out.printf("%s\n", f);
				foundFont = f;
			}
		}
		
		exampleText.setFont(new Font(foundFont, 20.0));
		
		
	}
}
