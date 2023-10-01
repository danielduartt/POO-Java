package Fundamentos;

public class Variaveis_e_Constantes {
    public static void main(String[] args) {
        System.out.println("Estudando variáveis e constantes");
        System.out.println(2 + 3);
        int n1 = 2;
        int n2 = 3;
        int soma;
        soma = n1 + n2;
        System.out.println(n1 + n2);
        System.out.printf("A soma de %d + %d = %d", n1, n2 ,soma);
        final double pi = 3.14159; // criei uma contante
        double raio = 3.4;
        double area = pi * raio * raio;
        System.out.println(pi * raio * raio);
        raio = 5.4; // posso mudar essa variávei durante o código
        // pi = 10000; vai da erro pois ela é contante, não pode ser mudada durante o código
    }
}
