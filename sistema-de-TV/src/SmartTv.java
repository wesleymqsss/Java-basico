public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 8;

<<<<<<< HEAD
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal (){
        canal++;
    }

    public void dimunuirCanal(){
        canal--;
    }

=======
>>>>>>> 09976d584c6ed0bac441c7dc7589e96b6aea5edd
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