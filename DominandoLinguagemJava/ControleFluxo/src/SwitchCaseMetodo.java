import java.util.Scanner;

public class SwitchCaseMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        double valor;

        System.out.println("Digite qual doce você prefere: 1-Bala - 2-Chicletes - 3-Pudim - 4-Suspirão");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                valor = 0.10;
                System.out.printf("Bala sai R$ %.2f cada", valor);
                break;
            case 2:
                valor = 0.20;
                System.out.printf("Chiclete sai R$ %.2f cada", valor);
                break;
            case 3:
                valor = 2.00;
                System.out.printf("Pudim sai R$ %.2f a fatia", valor);
                break;
            case 4:
                valor = 1.50;
                System.out.printf("Suspirão sai R$ %.2f cada", valor);
                break;
            default:
                System.out.println("Escolha entre 1 e 4");
        }
    }
}
