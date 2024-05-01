public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();

        smartTv.aumentarVolume();
        System.out.println("volume atual: "+smartTv.volume);

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo Status -> Tv ligada? "+smartTv.ligada);


    }
}
