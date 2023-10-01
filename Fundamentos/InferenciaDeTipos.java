package Fundamentos;

public class InferenciaDeTipos {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);
        var b = 4.5; // o java infere qual o tipo de valor colocado dentro
        System.out.println(b);
        var c = "Teste";
        System.out.println(c);
        c = "Outro Testo";
        System.out.println(c);//só nao posso mudar o tipo dela, se começou de um tipo vai terminar nele
        double d; // variável declarada
        d = 14.5; // variavel inicializada
        System.out.println(d); //usada!
        // o var nao pode fazer isso, pois tem que inicializada logo
    }
}
