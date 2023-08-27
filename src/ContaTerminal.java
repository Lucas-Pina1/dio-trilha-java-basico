import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar? Digite as informaçoes a seguir para criar sua conta");

        System.out.println("Por favor, digite o seu nome");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o valor do deposito inicial de criação de conta:");
        double saldo = sc.nextDouble();

        Integer numeroConta = 1021;

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque",
                nome, agencia, numeroConta, saldo);

        sc.close();

    }
}
