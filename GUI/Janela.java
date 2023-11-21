package GUI;

import javax.swing.*;

public class Janela {

    public static void main(String[] args) {
       Componentes frame = new Componentes();//container
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
