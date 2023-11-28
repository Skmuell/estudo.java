package CentroAutomotivo.src;

public abstract class Veiculo {
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo(String modelo, int ano, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
