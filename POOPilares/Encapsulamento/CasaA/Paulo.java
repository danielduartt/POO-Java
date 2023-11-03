package POOPilares.Encapsulamento.CasaA;

public class Paulo {

    //Paulo mora na mesma Casa(pacote) da Ana
    Ana esposa = new Ana();
    void testeAcessos(){
        /* segredo = "...";
           facoDentroDeCasa = "..."; //default
           String formaDeFalar = "...";
           String todosSabem = "..."; */

        //System.out.println(esposa.segredo); //apenas ela sabe
        System.out.println(esposa.facoDentroDeCasa); // o predro ver, pois está no mesmo pacote
        System.out.println(esposa.formaDeFalar); //o filho tbm ver, mas o pedro ver pois está no mesmo pacote
        System.out.println(esposa.todosSabem); // todos podem ver
    }
}
