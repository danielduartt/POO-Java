package Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class ConversaoTiposPrimitivos {
/*
Byte -> Short -> int -> long (não tme perigo de perder informação) faz de forma Implícita
long -> int (perde informação) tem que fazer de forma Explicíta

int -> float  (3) -> (float) =  3.0 Implícita /(3.2) -> int = 3 (perde informação) Explícita
Java não ver o valor, ela leva em consideração do tipo

 */
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);
        float b = 1.2f;
        System.out.println(b);
        //Usando o cast (Explícito)
        float c = (float)3.2;  //lembre-se se eu nao fizer o cast ou colocar o f
                              // por padrão, o número será double
        int d = 120;
        byte e = (byte)c;
        System.out.println(d);
        double f = 6.999999999;
        int g = (int) f;
        System.out.println(g);

//Número -> String
        Integer num1 = 10000;
        System.out.println(num1.toString());
        System.out.println(num1.toString().length());
        int num2 = 10000;
        String sla = Integer.toString(10);

        System.out.println(Integer.toString(num2).length());
        System.out.println(("" + num2).length()); //modo perebão
//String -> Número
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número: ");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número: ");

        System.out.println(valor1 + valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        System.out.println(numero1 + numero2);
//====================================DESAFIO============================================

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário1 :");
        String salario1 = input.nextLine().replace(',','.');
        System.out.print("Digite o salário2 :");
        String salario2 = input.nextLine().replace(',','.');
        System.out.print("Digite o salário3 :");
        String salario3 = input.nextLine().replace(',','.');
        double media = (Double.parseDouble(salario1) +
                Double.parseDouble(salario2) +
                Double.parseDouble(salario3)) / 3;
        System.out.printf("A média dos 3 salários é: %.2f", media);

        input.close();
    }

}
