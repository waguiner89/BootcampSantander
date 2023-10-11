public class FormatarCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        }
        catch (CepInvalidoException e){
            e.printStackTrace();
        }
    }
    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8 )
            throw new CepInvalidoException();
            return "12.345-678";
    }
}
