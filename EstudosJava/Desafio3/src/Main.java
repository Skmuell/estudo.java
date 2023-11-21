package Desafio3.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculos> Veiculo = new ArrayList<>();

        Veiculo.add(new Carros("Parati","Novo","2011","4"));
        Veiculo.add(new Carros("Onix","Sedan","2023","4"));
        Veiculo.add(new Motos("XRE 300","Rally","2023","300"));

        for(Veiculos funcao : Veiculo){
            funcao.mostrarInfo();
            System.out.println();
        }
    }

}