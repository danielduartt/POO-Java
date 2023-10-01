package Fundamentos;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class UsandoImporte {
    public static void main(String[] args) {
        String s = "Bom Dia!";

        Date d = new Date();
        JButton j = new JButton();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Testando o scanner: ");
        int idade = entrada.nextInt();
        System.out.println(idade);

        entrada.close();

    }
}
