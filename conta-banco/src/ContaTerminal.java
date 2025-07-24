import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
    System.out.println("Por favor, digite seu nome.");
        var name = scanner.nextLine(); //scanner.next causava um erro para palavras compostas
    System.out.println("Digite a sua agência.");
        var agence = scanner.next();    
    System.out.println("Digite o número da sua conta.");
        var account = scanner.nextInt();
    System.out.println("Digite o valor do seu saldo.");
        var balance = scanner.nextFloat();
    System.out.println("Olá "  +  name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agence + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
