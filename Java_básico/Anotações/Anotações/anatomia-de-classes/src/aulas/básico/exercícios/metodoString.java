package aulas.básico.exercícios;
public class metodoString {
    public static void main (String [] args){
       
        String primeiroNome = "Fernanda";
        String segundoNome = "Carla";
        
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        //variáveis devem iniciar com letra minúscula e tbm seguir o padrão camelCase
        //variáveis que não devem ser alteradas devem ser escritas com letras maiúsculas e a palavra final antes da declaração
        //variáveis não podem conter espaços e NUNCA iniciar com número
        //os únicos símbolos permitidos são: _ ou $
        //as declarações de variáveis são feitas: Tipo Nome = Atribuição
        System.out.println(nomeCompleto);
        
        }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome + segundoNome;
        }   
}
