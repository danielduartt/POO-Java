package POOPilares.Heranca;

public class Cadastro {

    public static void main(String[] args) {
        Autor autor = new Autor();
        Livro umlivro = new Livro(1.0);
        umlivro.setNome("Java: Como programar");
        Ebook e = new Ebook(50.0);
        e.setNome("Python para iniciantes"); //Exemplo de métodos de instância
        //Métodos statics não dependem do objeto, a classe ja consegue chamar
        e.alicarDesconto(0.1);
        System.out.println(e.getValor());

    }



}
