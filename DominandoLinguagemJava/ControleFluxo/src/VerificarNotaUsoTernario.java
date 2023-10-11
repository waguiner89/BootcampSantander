import java.util.Scanner;

public class VerificarNotaUsoTernario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.print("Digite sua nota: ");
        nota = scanner.nextInt();

        String resultado = nota >=6 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
