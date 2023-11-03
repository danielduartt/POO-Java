package POOPilares.Heranca;

public class Livro {
    private String nome;
    String descricao;
    String isbn;
    private double valor;
    boolean impressao;

    public Livro(double valor){
        this.valor = valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public boolean alicarDesconto(double valor){
        this.valor = this.valor - (this.valor * valor);
        return true;
    }
}
