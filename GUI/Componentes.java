package GUI;

import javax.swing.*;
import java.awt.*; //o layout é do awt
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Componentes extends JFrame implements ActionListener {

    private JButton ok, coracao;
    public Componentes(){
        super("Componentes");
        setLayout(new FlowLayout());
        Icon icone = new ImageIcon("images.png.jpg");
        ok = new JButton("Ok");
        add(ok);
        coracao = new JButton("Amor!");
        add(coracao);

        coracao.addActionListener(this); //monitorando o botão
        ok.addActionListener(this); // monitorando o botão

    }
    //AcitionEvent a para botões
    //Ação para o clique
    public void actionPerformed(ActionEvent a ){
        if(a.getSource() == ok ){
            JOptionPane.showMessageDialog(null, "Clicou no ok");
        }
        if(a.getSource() == coracao){
            JOptionPane.showMessageDialog(null, "Clicou no coração");
        }
    }

}
