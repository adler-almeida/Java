package br.com.adler.javafx.primeiro.primeirofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblTexto;

    @FXML
    protected void buttonActived() {
        lblTexto.setText("Bem Vindo ao Novo Mundo");
    }
}