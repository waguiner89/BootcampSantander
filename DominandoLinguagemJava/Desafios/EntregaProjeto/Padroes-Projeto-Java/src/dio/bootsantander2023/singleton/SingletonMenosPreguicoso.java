package dio.bootsantander2023.singleton;

public class SingletonMenosPreguicoso {

    private static SingletonMenosPreguicoso instancia = new SingletonMenosPreguicoso();

    private SingletonMenosPreguicoso(){
        super();
    }

    public static SingletonMenosPreguicoso getInstance() {
        return instancia;
    }
}
