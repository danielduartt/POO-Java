package POOPilares.Heranca;

public class Ebook extends Livro{
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private int codigo;

   public Ebook(double valor){
       super(valor);
   }
    @Override //Estou sobrescrevendo o método da classe mãe
    //A idle vai direto na classe filha
    //Sobrescrita de método
    public double getValor() {
        return super.getValor();
    }
    @Override
    public void setValor(double valor){
        super.setValor(valor);
    }

    @Override //Reescrita de método
    public boolean alicarDesconto(double valor){
        if (valor > 0.4){
            System.out.println("Não aplicado");
            return false;
        }else{
            double desconto = this.getValor() * valor;
            this.setValor(this.getValor() - desconto);
            System.out.println("Aplicado");
            return true;
        }
    }

}
