package exerciciosCasa;

import java.util.ArrayList;
import java.util.List;

public class substituirElementos {
    public static void main(String[] args) {
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Hoje eu vou sair com minha polo branca original.");
        listaOriginal.add("Meu boné é original.");

        String palavraOriginal = "original";

        String palavraSubstituta = "nova";

        List<String> listaModificada = substituirPalavraLista(listaOriginal, palavraOriginal, palavraSubstituta);


        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista modificada: " + listaModificada);
    }

    private static List<String> substituirPalavraLista(List<String> lista, String palavraOriginal, String palavraSubstituta) {
        List<String> listaModificada = new ArrayList<>();

        for (String textoOriginal : lista) {
            String textoModificado = textoOriginal.replaceAll(palavraOriginal, palavraSubstituta);
            listaModificada.add(textoModificado);
        }

        return listaModificada;
    }
}

