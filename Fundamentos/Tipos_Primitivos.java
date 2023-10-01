package Fundamentos;

public class Tipos_Primitivos {
    public static void main(String[] args) {

        /*     8 tipos em Java
        * Valores Inteiros:
        *   byte : 1 byt = 8 bits
        *   short : 2 byts
        *   int :   4 byts
        *   long : 8 byts
        *
        * Valores Flutuantes (fracionários):
        *   float: 4 byts
        *   double: 8 byts
        *
        * Letra:
        *   char: um caractere em aspas simples => 'a' ':' '?'
        *
        * Booleano:
        *   boolean: False/True
        * */
        /*
        * double a = 3; valor literal por padrão será inteiro
        * double b = 3.21 por padrão é é double
        *  Obs:
        *   Não da para converter um tipo maior para um tipo menor
        *   tipo converter um número long para int(pois pode ter a perca de informação)
        * */

        //Informações funcionários
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; //tenho que indidicar que passou de um número inteiro, por isso coloco o L
        //Numeros reais
        float salario = 11_445.44F; // indico para o java que estou usando um literal float, pois o padrão é double no java, e to querendo
        //colocar um literal do tipo double no float, por isso devo colcoar o F no final
        double vendasAcumuladas = 2_991_797_103.01;
        //Booleano
        boolean estadeFerias = false; // pode colocar true;
        //Caracteres
        char status = 'a';
        System.out.println(anosDeEmpresa);
        System.out.println(numeroDeVoos);
        System.out.println(pontosAcumulados);
        System.out.println(salario);
        System.out.println(vendasAcumuladas);
        System.out.println(estadeFerias);
        System.out.println(estadeFerias);
        System.out.println(status);
    }
}
