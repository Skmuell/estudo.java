import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class inverter {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<>();

        minhaLista.add(5);
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(0);

        Collections.reverse(minhaLista);

        System.out.println(minhaLista);
    }
}