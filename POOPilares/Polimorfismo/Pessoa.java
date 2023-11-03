package POOPilares.Polimorfismo;

public class Pessoa {
    private double peso;

    public double getPeso(){
        return peso;
    }
    public void setPeso(double pesoNovo){
        if(pesoNovo >= 0){
            peso=pesoNovo;
        }
    }


    public Pessoa(double peso){
        setPeso(peso);
    }
    // Polimorfismo Estático!
    //SobreCarga do método
    /*public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer(Sorvete sorvete){
        this.peso += sorvete.getPeso();
    }*/

    //Polimorfismo Dinâmico
    public void comer(Comida comida){this.peso += comida.getPeso();}


}
