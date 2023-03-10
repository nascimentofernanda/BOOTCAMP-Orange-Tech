package aulas.básico.exercícios;

public class TiposVariaveis {
    
    public static void main (String [] args) {
        int idade = 28;
        System.out.println(idade);

        float altura = 1.69F;
        //A variável float deve sempre ter um F no final da sua declaração
        System.out.println(altura);

        final long CPF = 99934574254L;
        //A variável long deve sempre ter um L no final da sua declaração
        //A palavra final antes do tipo de variável indica que o valor dela não pode ser alterado
        System.out.println(CPF);

        int numero1 = 2;
        int numero2 = 4;

        String resultado = numero1!=numero2 ? "verdadeiro" : "falso";
        //Operador ternário (condição) ? (resultado se verdadeiro) : (resultado se falso)
        System.out.println(resultado);

        String sobrenome = "Freitas";
        String sobrenome2 = "Nascimento";
        System.out.println(sobrenome.equals(sobrenome2));
        //equals é a formaadequada para comparar objetos (variáveis não numéricas)

        // && operdaor lógico E
        // || operador lógico OU

        
    }
}
