package POOPilares.Encapsulamento.CasaB;

import POOPilares.Encapsulamento.CasaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void testeAcessos(){
        /* segredo = "...";
           facoDentroDeCasa = "..."; //default
           String formaDeFalar = "...";
           String todosSabem = "..."; */

        //System.out.println(esposa.segredo); //apenas ela sabe
        //System.out.println(sogra.facoDentroDeCasa); // o predro ver, pois está no mesmo pacote
        //System.out.println(sogra.formaDeFalar); //o filho tbm ver, mas o pedro ver pois está no mesmo pacote
        System.out.println(sogra.todosSabem); // todos podem ver
    }


}
