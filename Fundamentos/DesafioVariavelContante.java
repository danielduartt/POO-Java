package Fundamentos;

public class DesafioVariavelContante {
    public static void main(String[] args) {
        System.out.println("================Fahrenheit para Celsius================");
        final double FATOR = 5.0/9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE ) * FATOR;
        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE ) * FATOR;
        System.out.println("O resulto é " + celsius +" °C.");

    }
}
