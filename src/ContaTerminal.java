import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite o numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite o Saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("ola " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + ", e seu saldo " + saldo +  " já está disponível para saque" );

    }
}