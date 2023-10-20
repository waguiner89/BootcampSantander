package dio.bootsantander2023.singleton;

public class SingletonEncapsula {

    private static class InstanceHolder {
        public static SingletonEncapsula instancia = new SingletonEncapsula();
    }

    private SingletonEncapsula(){
        super();
    }

    public static SingletonEncapsula getInstancia() {
        return InstanceHolder.instancia;
    }

}
