package Fundamentos;

public class OperadorUnario {
    public static void main(String[] args) {
        //Atribuição
        int a = 3;
        int b = a;
        int c = a + b;
        c += b;
        c -= a;
        c *= b;
        c /= a;
        c %= 2; // 0 ou 1 para saber se é par ou impar
        //Operadores unarios
        a++; //a += 1 / a = a + 1
        a--;
        //primeiro pega o valor depois decrementa
        ++b;
        --b; // b = b - 1;
        //primeiro decrementa
        System.out.println("2" == "2"); // true
        String s = new String("2");
        System.out.println("2" == s);//false
        System.out.println("2".equals(s));
        String s2 = "        2          ";
        System.out.println("2" == s2.trim());//o trim tira os espaços em branco false
        System.out.println("2".equals(s2.trim()));//true


    }
}
