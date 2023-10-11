public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartv = new SmartTv();

        System.out.println("TV ligada: " + smartv.ligada);
        System.out.println("A tv está no canal: " + smartv.canal);
        System.out.println("Volume: " + smartv.volume);
        System.out.println(" ");

        smartv.ligar();
        smartv.aumentarVolume();
        smartv.aumentarVolume();

        smartv.mudarCanal(15);

        System.out.println("TV ligada: " + smartv.ligada);
        System.out.println("Volume: " + smartv.volume);
        System.out.println("A tv está no canal: " + smartv.canal);

        //Comentar em uma linha
        /* Comentar
        em mais de uma linha*/
    }
}
