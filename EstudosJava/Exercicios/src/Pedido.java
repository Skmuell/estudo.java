public class Pedido {
    private int quantidadeProduto;
    private Produto produto;

    public int getQuantidade() {
        return this.quantidadeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeProduto = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void precoTotal(){
        System.out.println(this.quantidadeProduto * produto.precoProduto);
    }

}
