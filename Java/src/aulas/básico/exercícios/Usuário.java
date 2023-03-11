package aulas.básico.exercícios;

public class Usuário {
    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Inicial: " +smartTv.canal);
        System.out.println("Volume Inicial: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);
    
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);
    
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal escolhido: "+smartTv.canal);
    }   

}
