public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Você está no canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Você está no canal: " + smartTv.canal);
        smartTv.escolherCanal(13);
        System.out.println("Você está no canal: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    }

}
