/*Vamos criar um sistema de plano telefônico
    onde o sistema pedriá para o usuário escolher entre 3 planos
    BASIC, Media ou TURBO
    Basic: 100 minutos de ligação
    Media: 100 minutos de ligação + Whats e Instagram grátis
    TURBO: 100 minutos de ligação, Whats e Instagram grátis + 5Gb de YouTube */

import java.util.Scanner;

public class PlanoTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("Escolha seu plano: 1-BASIC - 2-MEDIA - 3-TURBO");
        escolha = scanner.nextInt();
        System.out.println("");
        System.out.println("Você terá direito a:");

        switch (escolha){
            case 3:
                System.out.println("5Gb de YouTube");
            case 2:
                System.out.println("Whats e Instagram grátis");
            case 1:
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Escolha entre 1 e 3");
        }


    }
}
