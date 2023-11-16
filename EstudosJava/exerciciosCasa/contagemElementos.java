package exerciciosCasa;

import java.util.ArrayList;
import java.util.List;

public class contagemElementos {
    public static void main(String[] args) {
        List<Integer> Elementos = new ArrayList<>();

        Elementos.add(1);
        Elementos.add(2);
        Elementos.add(3);
        Elementos.add(4);
        Elementos.add(5);
        Elementos.add(6);
        Elementos.add(2);
        Elementos.add(2);

        int numeroAlvo = 2;

        int contador = contarNumeros(Elementos, numeroAlvo);

        System.out.println("O número " + numeroAlvo + " aparece " + contador + " vezes na lista.");

    }
    public static int contarNumeros(List<Integer> Elementos, int numeroAlvo) {
        int contador = 0;

        for (int numero : Elementos) {
            if (numero == numeroAlvo) {
                contador++;
            }
        }

        return contador;

    }

}
