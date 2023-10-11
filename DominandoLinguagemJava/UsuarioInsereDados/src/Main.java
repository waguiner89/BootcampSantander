import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println(" ");

        System.out.printf("Olá, me chamo %s %s! %n", nome, sobrenome);
        System.out.printf("Tenho %d anos! %n", idade);
        System.out.printf("E tenho %.2fcm de altura!", altura);
        System.out.println(" ");
    }
}
