package POO.composicao;

public class CompraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "JP";
        c1.addItem(new Item("Caneta", 20,7.45));
        c1.addItem(new Item("Borracha", 12,3.89));
        c1.itens.add(new Item("Cadernos", 3,18.79));
        System.out.println(c1.itens.size());
        c1.MostrarItens();
        System.out.println(c1.ValorTotal());
    }
}
