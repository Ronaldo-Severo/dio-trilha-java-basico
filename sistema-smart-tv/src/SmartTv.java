public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Novo volume: " + volume);
        }

    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Novo volume: " + volume);
        }

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Novo canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Novo canal: " + canal);
    }
}