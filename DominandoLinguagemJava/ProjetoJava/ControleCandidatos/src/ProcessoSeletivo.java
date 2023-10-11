import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Wagner", "Verônica", "Sofia", "Joey", "Timóteo"};
        for (String candidato: candidatos){
            entrandoContato(candidato);
        }
    }
    static void entrandoContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.printf("Conseguimos contato com %s na %dª tentativa. %n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com %s, número máximo de 3 tentativas realizadas. %n", candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Wagner", "Verônica", "Sofia", "Joey", "Timóteo"};

        System.out.println("LIsta dos candidatos com o índice: ");

        for (int indice=0; indice < candidatos.length; indice++){
            System.out.printf("O candidato nº%d é o %s. %n", indice+1, candidatos[indice]);
        }
        System.out.println(" ");
        System.out.printf("Forma abreviada de interação For Each!");

        for(String candidato: candidatos){
            System.out.printf("O candidato selecionado foi o %s. %n", candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Wagner", "Verônica", "Sofia", "Joey", "Timóteo", "Pumba", "Pelézinho", "Maradona", "Gokuzinho", "Tobby"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este salário %.2f. %n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga. %n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
