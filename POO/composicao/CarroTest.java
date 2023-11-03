package POO.composicao;
//relação 1 para 1
public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado() ? "Ligado" : "Desligado");
        c1.ligar();
        System.out.println(c1.estaLigado() ? "Ligado" : "Desligado");
        System.out.println(c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.freiar();
        c1.freiar();
        c1.freiar();
        c1.freiar();
        c1.freiar();
        c1.freiar();
        System.out.println(c1.motor.giros());
    }
}
