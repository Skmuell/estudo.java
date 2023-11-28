package CentroAutomotivo.src;

public class Moto extends Veiculo {
    private String tipoMotor;

    public Moto(String modelo, int ano, String placa, String tipoMotor) {
        super(modelo, ano, placa);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo do Motor: " + this.tipoMotor);
    }

    @Override
    public String toString(){
        return super.getModelo() + " é o modelo," + super.getAno() + " é o ano, " + super.getPlaca() + " é a placa, " +
                this.getTipoMotor() + " é o tipo de motor";
    }

    @Override
    public boolean equals(Object obj) {
        Moto moto = (Moto) obj;
        if(super.getPlaca().equals(moto.getPlaca())) {
            return true;
        }else{
            return false;
        }
    }

}
