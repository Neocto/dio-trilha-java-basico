import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome.");
            var name = scanner.nextLine(); //scanner.next causava um erro para palavras compostas
        System.out.println("Digite a sua agência.");
            var agence = scanner.next(); 
            scanner.nextLine(); 
        System.out.println("Digite o número da sua conta.");
            var account = scanner.nextInt();
            scanner.nextLine();
        System.out.println("Digite o valor do seu saldo.");
            var balance = scanner.nextFloat();
            scanner.nextLine(); // mesmo sem o nextLine, por ser a última linha não teria problema
        System.out.println("Olá "  +  name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agence + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque.");
    scanner.close();
}
}
