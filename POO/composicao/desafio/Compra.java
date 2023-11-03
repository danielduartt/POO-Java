package POO.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    Cliente cliente; //fiz a relação bidirecional
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }
    void addItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome,preco);
        this.itens.add(new Item(produto, quantidade));
    }
    double valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }




}
