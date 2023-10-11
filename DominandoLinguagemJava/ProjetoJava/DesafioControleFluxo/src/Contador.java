import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();
        System.out.println("");

        try {
            contar(num1, num2);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = num2 - num1;
            for(int i=1; i <= contagem; i++) {
                System.out.printf("Imprimindo o número %d. %n", i);
            }
        }
    }

}
