package POO.composicao;

public class Carro {
    Motor motor = new Motor(); //atributo de instância
    void acelerar(){
        motor.fatorInjecao += 0.4;
    }
    void freiar(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
        }
    }
    void ligar(){
        if(motor.ligado == false){
            motor.ligado = true;
        }else{
            System.out.println("Motor ligado");
        }
    }
    void desligar(){
        if(motor.ligado == true){
            motor.ligado = false;
        }else{
            System.out.println("Motor já desligado");
        }
    }
    boolean estaLigado(){
        return motor.ligado;
    }


}
