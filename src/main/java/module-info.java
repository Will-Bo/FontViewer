module test.testProject {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;

    opens test.testProject to javafx.fxml;
    exports test.testProject;
}
