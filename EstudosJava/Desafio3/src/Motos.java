package Desafio3.src;

public class Motos extends Veiculos {

    public String tipoDeMotorMoto;

    public Motos(String nome, String modelo, String ano, String tipoDeMotorMoto){
        super(nome, modelo, ano);
        this.tipoDeMotorMoto = tipoDeMotorMoto;
    }


    public String getTipoDeMotorMoto() {
        return tipoDeMotorMoto;
    }

    public void setTipoDeMotorMoto(String tipoDeMotorMoto) {
        this.tipoDeMotorMoto = tipoDeMotorMoto;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de motor: " + this.tipoDeMotorMoto);
    }
}
