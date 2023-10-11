public class AnatomiaJava {

    public static void main(String[] args) {
        System.out.println("Olá mundo todo!");
        System.out.println("");

        String pNome = "Wagner";
        String sNome = "Camargo Vaz";

        String NomeCompleto = NomeCompleto(pNome, sNome);

        System.out.println(NomeCompleto);
    }

    public static String NomeCompleto (String pNome, String sNome){
        return "Resultado: " + pNome.concat(" ").concat(sNome);
    }

}
