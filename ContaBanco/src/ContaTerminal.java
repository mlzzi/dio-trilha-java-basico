import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao Banco X");

        //TODO: obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        //TODO: obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite seu Saldo:");
        Double saldo = scanner.nextDouble();

        //TODO: exibir a mensagem conta criada
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}