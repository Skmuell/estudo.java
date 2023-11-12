package restaurante;

public class Pedido {

    private String nomePrato;
    private int quantidade;

    private double precoUnitario;

    public String getNomePrato(){
        return this.nomePrato;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double calcularPreco(){
        return this.precoUnitario * this.quantidade;
    }

    public void informacao(){
        System.out.println("Oi, o nome do prato é " + this.nomePrato + " " + "e esse é o preço = " + this.precoUnitario);
    }
}

