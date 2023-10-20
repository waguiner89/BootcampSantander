import java.util.Scanner;

public class DesafioAUltimaTransacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        if (partes.length != 4) {
            System.out.println("Formato de entrada inválido. Use o formato: data,hora,descricao,valor");
            return;
        }

        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);

        Transacao transacao = new Transacao(data, hora, descricao, valor);
        transacao.imprimir();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f%n", this.valor);
    }
}
