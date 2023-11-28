package CentroAutomotivo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        List<Veiculo> veiculosAtendidos = new ArrayList<>();

        Carro c1 = new Carro("Corsa", 2012, "KJK8556", 4, "Hidraulico");
        Carro c2 = new Carro("Celta", 2012, "KJK8556", 4, "Hidraulico");
        Carro c3 = c1;

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c1));

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo ao Centro automotivo");
        System.out.println();

        boolean condicao = true;

        while (condicao) {
            System.out.println("MENU:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar Veículos cadastrados");
            System.out.println("3 - Verificar detalhes por placa");
            System.out.println("4 - Sair da aplicação");

            int resposta = scan.nextInt();
            scan.nextLine();

            if (resposta == 1) {
                System.out.println("Você deseja cadastrar:");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Sair da aplicação");
                resposta = scan.nextInt();
                scan.nextLine();

                String modelo = null;
                String placa = null;
                int ano = 0;

                if (resposta == 1 || resposta == 2) {
                    System.out.println("Digite o modelo: ");
                    modelo = scan.nextLine();
                    System.out.println("Digite o ano: ");
                    ano = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a placa: ");
                    placa = scan.nextLine();
                } else {
                    continue;
                }

                if (resposta == 1) {
                    System.out.println("Digite o número de portas: ");
                    int numPortas = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o tipo do volante: ");
                    String tipoVolante = scan.nextLine();
                    veiculos.add(new Carro(modelo, ano, placa, numPortas, tipoVolante));
                } else if (resposta == 2) {
                    System.out.println("Digite o tipo do Motor: ");
                    String tipoMotor = scan.nextLine();
                    veiculos.add(new Moto(modelo, ano, placa, tipoMotor));
                }
            } else if (resposta == 2) {
                System.out.println(veiculos);
            } else if (resposta == 3) {
                System.out.println("Digite a placa para verificar detalhes: ");
                String placaConsulta = scan.nextLine();
                boolean placaEncontrada = false;

                for (Veiculo veiculo : veiculos) {
                    if (veiculo.getPlaca().equals(placaConsulta)) {
                        System.out.println("Detalhes do veículo:");
                        System.out.println(veiculo);
                        veiculosAtendidos.add(veiculo);
                        placaEncontrada = true;
                        break;
                    }
                }

                if (!placaEncontrada) {
                    System.out.println("A placa não faz parte da lista de clientes atendidos.");
                }
            } else if (resposta == 4) {
                condicao = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
