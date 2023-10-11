import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo;
        double valorSolicitado;

        System.out.print("Digite o seu saldo atual: R$ ");
        saldo = scanner.nextDouble();

        System.out.print("Digite quanto deseja sacar: R$ ");
        valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.printf("Saldo atual: R$ %.2f", saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
