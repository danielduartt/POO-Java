package POOPilares.ClassesAbstratas;

public abstract class Mamifero extends Animal{

    @Override //a partir desse momento as classes filhas vão ter a opção de implementar esse método
    public String mover(){
        return "Usando as patas";
    }
    public abstract String mamar();

}
