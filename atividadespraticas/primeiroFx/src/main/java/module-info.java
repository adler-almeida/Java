module com.adler.javafx.primeirofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.adler.javafx.primeirofx to javafx.fxml;
    exports com.adler.javafx.primeirofx;
}