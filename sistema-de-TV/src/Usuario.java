public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();

        smartTv.aumentarVolume();
<<<<<<< HEAD
        
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+smartTv.canal);
        
        System.out.println("volume atual: "+smartTv.volume);
        System.out.println("TV ligada? "+smartTv.ligada);
        
=======
        System.out.println("volume atual: "+smartTv.volume);

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
>>>>>>> 09976d584c6ed0bac441c7dc7589e96b6aea5edd
        

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo Status -> Tv ligada? "+smartTv.ligada);


    }
}
