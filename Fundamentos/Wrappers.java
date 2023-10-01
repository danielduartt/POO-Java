package Fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner((System.in));

        //byte
        Byte b = 100; // classe que engloba o tipo byte
        Short s = 1000;
        Integer i = Integer.parseInt(entrada.next()); //int
        Long l = 100000000L; //só converte long para long
        System.out.println(b.byteValue());
        System.out.print(s.toString());

        //Bollean
        Boolean bo = Boolean.parseBoolean("true"); //converti um valor string para um valor booelano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        //char
        Character c = '#';
        System.out.println(c + "...");

        //float e double
        Float f = 123.0F;
        Double d = 1234.567;


        entrada.close();
    }
}
