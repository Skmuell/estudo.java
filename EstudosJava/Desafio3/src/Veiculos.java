package Desafio3.src;

public abstract class Veiculos {

    public String nomeVeiculo;
    public String modelo;
    public String ano;

    public Veiculos(String nomeVeiculo, String modelo, String ano){
        this.nomeVeiculo = nomeVeiculo;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nomeVeiculo;
    }

    public void setNome(String nome) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public void mostrarInfo() {
        System.out.println("Nome do veiculo: "+ this.nomeVeiculo);
        System.out.println("Modelo do veiculo: "+ this.modelo);
        System.out.println("Ano do veiculo: " + this.ano);
    }
}
