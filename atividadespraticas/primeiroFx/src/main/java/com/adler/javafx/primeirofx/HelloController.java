package com.adler.javafx.primeirofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblText;

    @FXML
    protected void onButton () {
        lblText.setText("Olá new World");
    }
}