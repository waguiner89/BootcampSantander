import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
            System.out.println(" ");

            System.out.printf("Olá, me chamo %s %s. %n", nome, sobrenome);
            System.out.printf("Tenho %d anos. %n", idade);
            System.out.printf("Minha altura é %.2fcm.", altura);
            System.out.println(" ");
        }
        catch (InputMismatchException e ){
            System.out.println("Os campos 'Idade' e 'Altura' devem conter somente números!");
            System.out.print("Use 'vírgula' ao invés de 'ponto' no campo 'Altura'!");

        }
    }
}