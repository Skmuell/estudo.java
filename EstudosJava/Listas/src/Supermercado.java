import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public static void main(String[] args) {

        Item item1 = new Item("Sassissinha", 1);
        Item item2 = new Item("Cuscui", 2);
        Item item3 = new Item("Calabresa", 1);

        List<Item> minhaCompra = new ArrayList<>();
        minhaCompra.add(item1);
        minhaCompra.add(item2);
        minhaCompra.add(item3);
        minhaCompra.remove(item3);

        for (Item item : minhaCompra);
            System.out.println(item1.getNome());
            System.out.println(item1.getQuantidade());
            System.out.println(item2.getNome());
            System.out.println(item2.getQuantidade());
            System.out.println(item3.getNome());
            System.out.println(item3.getQuantidade());


        }

    }
