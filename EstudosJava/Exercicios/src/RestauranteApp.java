public class RestauranteApp {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        produto1.setNome("Tapioca");
        produto1.setPreco(3);
        Produto produto2 = new Produto();
        produto2.setNome("Café");
        produto2.setPreco(2);

        Pedido pedido1 = new Pedido();
        pedido1.setProduto(produto1);
        pedido1.setQuantidade(2);
        pedido1.precoTotal();

        Pedido pedido2 = new Pedido();
        pedido2.setProduto(produto2);
        pedido2.setQuantidade(2);
        pedido2.precoTotal();

        System.out.println("Esse é o nome do produto1 = " + produto1.getNome()+ " " + "e esse é o nome do produto2 = " + produto2.getNome());
    }
}
