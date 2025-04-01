package primeiropacote;

import java.awt.Toolkit;
import java.awt.Dimension;

public class DesafioDoisResolucaoTela {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("======================");
        System.out.println("Resolução da Tela");
        System.out.println("======================");
        System.out.println();

        // Acessando informações gráficas
        Toolkit obtendoInformacao = Toolkit.getDefaultToolkit(); // Ambiente grafico

        // Obtém dados da tela
        Dimension tela = obtendoInformacao.getScreenSize();

        // Armazenando as informações
        int largura = tela.width;
        int altura = tela.height;

        // Exibe a resolução na tela
        System.out.println("Informações:");
        System.out.printf("\nLargura: %d. %nAltura: %d. ",largura,altura);
    }
}