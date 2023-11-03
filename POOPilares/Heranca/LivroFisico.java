package POOPilares.Heranca;

public class LivroFisico extends Livro{

    public double getTaxaImpressao() {
        return taxaImpressao;
    }

    public void setTaxaImpressao(double taxaImpressao) {
        this.taxaImpressao = taxaImpressao;
    }

    private double taxaImpressao;

    public LivroFisico(double valor){
        super(valor); //estou usando o construtor da calsse mãe
        //estou passando o valor no atributo
    }


}
