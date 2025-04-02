module br.com.adler.javafx.primeiro.primeirofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.adler.javafx.primeiro.primeirofx to javafx.fxml;
    exports br.com.adler.javafx.primeiro.primeirofx;
}