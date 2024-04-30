import java.util.*;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o seu nome: ");
        String nomeDoCliente = scanner.next();

        System.out.print("Digite o seu saldo em conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
