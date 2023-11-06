public class Restaurante {
    public static void main(String[] args){
        Pedido pedido = new Pedido();
        pedido.setNomePrato("Pizza");
        pedido.setPrecoUnitario(2);
        pedido.setQuantidade(4);
        pedido.calcularPreco();
        pedido.informacao();
    }
}
