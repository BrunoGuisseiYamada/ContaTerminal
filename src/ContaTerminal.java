import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número da conta: ");
                int numeroConta = scanner.nextInt();
                    scanner.nextLine();

            System.out.print("Digite a agência: ");
                String agencia = scanner.nextLine();

            System.out.print("Digite o nome do cliente: ");
                 String nomeCliente = scanner.nextLine();

            System.out.print("Digite o saldo: ");
                double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
