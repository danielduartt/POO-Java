package POOPilares.Heranca.desafio;

public class Corrida {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari(15,220);
        Fiat f2 = new Fiat(5,120);

        f1.acelerar();
        f2.acelerar();
        f1.acelerar();
        f2.acelerar();
        f1.acelerar();
        f2.acelerar();
        System.out.println(f1.velocidade);
        System.out.println(f2.velocidade);
        f1.freiar();
        f2.freiar();
        System.out.println(f1.velocidade);
        System.out.println(f2.velocidade);



    }
}
