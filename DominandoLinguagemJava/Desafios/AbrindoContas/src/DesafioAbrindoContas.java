import java.util.Scanner;

public class DesafioAbrindoContas {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldo = scanner.nextDouble();
        System.out.println("");

        // Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Conta: " + conta.numero);
        System.out.println("Nome do Titular: " + conta.titular);
        System.out.println("Saldo Atual: R$" + conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
