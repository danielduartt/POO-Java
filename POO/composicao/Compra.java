package POO.composicao;

import java.util.ArrayList;

//Uma compra tem vário itens
//relação 1 -> n
public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Item item){
        this.itens.add(item);
    }

    void MostrarItens(){
        for(Item item: itens){
            System.out.println(item.nome);
        }
    }

    double ValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }



}
