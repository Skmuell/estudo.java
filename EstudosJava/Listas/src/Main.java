import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        List<Integer> minhaLista = new ArrayList<>();

        minhaLista.add(5);
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(0);

        System.out.println(minhaLista);

        Integer remover = 4;

        minhaLista.remove(remover);
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(3));



    }
}