package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));//pego valores especificos
        String s = "Boa tarde!";  // Não se modifica o valor original de uma string (obj imutável)
        System.out.println(s.startsWith("BOA"));//inicia com Boa?
        System.out.println(s.toLowerCase().startsWith("boa")); //tranformei em lower case e vi se começa com 'boa'
        System.out.println(s.endsWith("pessoal"));
        System.out.println(s.equals("boa tarde")); //false
        System.out.println(s.equalsIgnoreCase("boa tarde")); //true
    }
}
