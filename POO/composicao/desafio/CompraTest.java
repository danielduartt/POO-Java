package POO.composicao.desafio;

public class CompraTest {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 1, 100);
        compra1.addItem(new Produto("Notebook", 2000), 2);
        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 10,10);
        compra2.addItem(new Produto("Impressora", 998.90), 1);
        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);
        System.out.println(cliente.GastoTotal());

    }
}
