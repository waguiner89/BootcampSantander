public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String paginaAtual = "Nehnhuma página atual";

    public void tocar() {
        musicaAtual = "Música em reprodução";
        System.out.println("Tocando música.");
    }

    public void pausar() {
        musicaAtual = "Música pausada";
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        musicaAtual = "Música selecionada: " + musica;
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        paginaAtual = "Página atual: " + url;
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    // Método para obter a música atual e a página atual
    public void exibirStatus() {
        System.out.println("Status do iPhone:");
        System.out.println("Música atual: " + musicaAtual);
        System.out.println("Página atual: " + paginaAtual);
    }
}