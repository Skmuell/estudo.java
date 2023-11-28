package CentroAutomotivo.src;

public class Carro extends Veiculo {

    private int numPorta;
    private String tipoVolante;

    public Carro(String modelo, int ano, String placa, int numPorta, String tipoVolante){
        super(modelo, ano, placa);
        this.numPorta = numPorta;
        this.tipoVolante = tipoVolante;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }

    public String getTipoVolante() {
        return tipoVolante;
    }

    public void setTipoVolante(String tipoVolante) {
        this.tipoVolante = tipoVolante;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Portas: " + this.numPorta);
        System.out.println("Tipo do Volante: " + this.tipoVolante);
    }
    @Override
    public String toString(){
        return super.getModelo() + " é o modelo, " + super.getAno() + " é o ano, " + super.getPlaca() + " é a placa, " +
                this.numPorta + " é o numero de portas e " + this.tipoVolante + " é o tipo de volante";
    }

    @Override
    public boolean equals(Object obj) {
        Carro carro = (Carro) obj;
        if(super.getPlaca().equals(carro.getPlaca())) {
            return true;
        }else{
            return false;
        }
    }

}
