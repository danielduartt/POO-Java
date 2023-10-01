package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.toUpperCase(); // transforma tudo em maiusculo
        System.out.println(s);
        s = s.replace("X", "Senhora").toUpperCase();
        System.out.println(s);
        s = s.concat("!!!");
        System.out.println(s);
        System.out.println("Leo".replace("e", "eoooo").concat("!!!!!!"));
        String y = "Bom Dia X".replace("X", "Gui");
        System.out.println(y.length());

    }
}
