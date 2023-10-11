import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class RepeticaoForEach {
    public static void main(String[] args) {
        String alunos [] = {"Wagner", "Verônica", "Sofia"};

        for (String aluno : alunos){
            System.out.printf("Nome do aluno é: %s %n", aluno);
        }
    }
}
