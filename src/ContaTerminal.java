import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        float saldoConta = scanner.nextFloat();

        System.out.println("A conta do(a) "+ nomeCliente +" foi criada com " + saldoConta + " reais, o numero da conta é"+numeroConta+"e a agência é"+agencia);

    }
}