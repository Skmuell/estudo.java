package Desafio3.src;

public class Carros extends Veiculos {

    public String numeroPortasCarro;

    public Carros(String nome , String modelo, String ano, String numeroPortasCarro) {
        super(nome, modelo, ano);
        this.numeroPortasCarro = numeroPortasCarro;
    }


    public String getNumeroPortasCarro() {
        return numeroPortasCarro;
    }

    public void setNumeroPortasCarro(String numeroPortasCarro) {
        this.numeroPortasCarro = numeroPortasCarro;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de motor: " + this.numeroPortasCarro);
    }
}
