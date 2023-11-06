public class ContaTeste {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1000);
        conta1.creditar(500);
        conta1.debitar(200);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        Conta conta2 = new Conta(2000);
        conta2.creditar(1000);
        conta2.debitar(500);
        System.out.println("Saldo da conta2: " + conta2.getSaldo());
    }
}