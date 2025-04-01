package primeiropacote;

import java.util.Locale;

public class DesafioUmIdiomaSistema {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("======================");
        System.out.println("Idioma do Sistema");
        System.out.println("======================");
        System.out.println();

        // Localiza Idioma e pais configurado no sistema
        Locale local = Locale.getDefault();

        // Armazenando Idioma e pais
        String idioma = local.getLanguage();
        String pais = local.getCountry();
        String idiomaMaiusculo = idioma.toUpperCase();

        // Retorna na tela
        System.out.printf("Idioma: '%s'",idiomaMaiusculo);

        System.out.println();
        System.out.printf("Pais : '%s'", pais);
        System.out.println();
        System.out.println("======================");
    }
}
