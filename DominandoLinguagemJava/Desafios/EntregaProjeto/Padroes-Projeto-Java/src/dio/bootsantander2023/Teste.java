package dio.bootsantander2023;

import dio.bootsantander2023.facade.Facade;
import dio.bootsantander2023.singleton.SingletonEncapsula;
import dio.bootsantander2023.singleton.SingletonMenosPreguicoso;
import dio.bootsantander2023.singleton.SingletonPreguicoso;
import dio.bootsantander2023.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Singleton
        SingletonPreguicoso lazy = SingletonPreguicoso.getInstance();
        System.out.println(lazy);
        lazy = SingletonPreguicoso.getInstance();
        System.out.println(lazy);

        SingletonMenosPreguicoso eager = SingletonMenosPreguicoso.getInstance();
        System.out.println(eager);
        eager = SingletonMenosPreguicoso.getInstance();
        System.out.println(eager);

        SingletonEncapsula holder = SingletonEncapsula.getInstancia();
        System.out.println(holder);
        holder = SingletonEncapsula.getInstancia();
        System.out.println(holder);


        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Wagner", "01551-000");
    }
}
