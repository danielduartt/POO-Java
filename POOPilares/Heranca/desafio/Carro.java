package POOPilares.Heranca.desafio;

public class Carro {


    public int velocidade;
    public int limiteDevelocidade;
    int aceleracao;
    public void acelerar(){
        if (velocidade < limiteDevelocidade){
            velocidade += aceleracao;
        }else{
            System.out.println("Limite de velocidade atingindo");
        }
    }

    public void freiar(){
        if (velocidade > 0){
            if ((velocidade - 5) < 0){
                velocidade = 0;
            }else{
                velocidade = velocidade - 5;
            }
        }else{
            System.out.println("Você está parado");
        }
    }




}
