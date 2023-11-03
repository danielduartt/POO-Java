package POOPilares.Encapsulamento;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.idade = -30; //alterando o valor
        System.out.println(p1.idade); //lendo o valor
        p1.SetIdade(30);
        System.out.println(p1.GetIdade());
        p1.SetIdade(280);
        System.out.println(p1.GetIdade());
    }
}
