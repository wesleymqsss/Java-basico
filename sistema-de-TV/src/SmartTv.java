public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 8;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal (){
        canal++;
    }

    public void dimunuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: "+volume);
        
    }
    public void dimunuirVolume(){
        volume--;
        System.out.println("diminuindo volume para: "+volume);
        
    }
    public void  ligar(){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }
}
