package Fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; //false
        //                 tabela verdade
        System.out.println(condicao1 && condicao2); //false
        System.out.println(condicao1 || condicao2); //true
        System.out.println(condicao1 && !condicao2); //true
        System.out.println(condicao1 ^ condicao2); // ou exclusivo (^) true
        System.out.println(!condicao1);//false
        System.out.println(!!condicao1);//true
        //=================================DESAFIO===================================
        //trabalho  na terça (V ou F)
        //trabalho na quinta (V ou F)
        // V V = tv de 50 polegadas  32
        Boolean trabalho1 = false;
        Boolean trabalho2 = true;
        String Tv50 = (trabalho1 && trabalho2) ? "Tv de 50 polegadas" : "...";
        String Tv32 = (trabalho1 ^ trabalho2) ? "Tv de 30 polegadas" : "...";
        String sorvete = (trabalho1 || trabalho2) ? "Eba! tomamos sorvete": "Estamos mais saudaveis";
        System.out.println("Compramos uma " + Tv50);
        System.out.println("Compramos uma " + Tv32);
        System.out.println(sorvete);

    }
}
