module test.testProject {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;

    opens main.fontViewer to javafx.fxml;
    exports main.fontViewer;
}
