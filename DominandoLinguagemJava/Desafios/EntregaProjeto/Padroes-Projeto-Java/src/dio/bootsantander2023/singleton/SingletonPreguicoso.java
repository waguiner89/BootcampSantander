package dio.bootsantander2023.singleton;

public class SingletonPreguicoso {

    private static SingletonPreguicoso instancia;

    private SingletonPreguicoso(){
        super();
    }

    public static SingletonPreguicoso getInstance() {

        if (instancia == null){
            instancia = new SingletonPreguicoso();
        }
        return instancia;
    }

}
