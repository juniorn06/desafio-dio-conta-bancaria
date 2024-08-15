import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.print("Informe o número da conta: ");
        conta.setNumero(sc.nextInt());
        System.out.print("Informe o número da agência: ");
        conta.setAgencia(sc.nextLine());
        sc.nextLine();
        System.out.print("Informe o nome do cliente: ");
        conta.setNomeCliente(sc.nextLine());
        System.out.print("Informe o saldo do cliente: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println(conta.toString());
    }
}