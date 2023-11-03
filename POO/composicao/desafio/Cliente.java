package POO.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    String email;
   final  ArrayList<Compra> compras = new ArrayList<Compra>();


   Cliente(String nome){
       this.nome = nome;
   }


    void addCompra(Compra compra){
        this.compras.add(compra);
    }

    double GastoTotal(){
       double total = 0;

        for(Compra compra: compras){
           total += compra.valorTotal();
        }
        return total;
    }
}
