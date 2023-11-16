import java.util.ArrayList;
import java.util.List;

public class compras {
    public static void main(String[] args) {
        List<String> minhaCompra = new ArrayList<>();

        minhaCompra.add("Macarrão");
        minhaCompra.add("Arroz");
        minhaCompra.add("Biscoito");
        minhaCompra.add("Pepsi");
        minhaCompra.add("Frango");

        minhaCompra.addLast("Cola rato");
        minhaCompra.remove("Arroz");

        System.out.println(minhaCompra);
    }
}
