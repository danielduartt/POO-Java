package POOPilares.Encapsulamento.CasaB;

import POOPilares.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcessos(){
        /* segredo = "...";
           facoDentroDeCasa = "..."; //default
           String formaDeFalar = "...";
           String todosSabem = "..."; */
        //System.out.println(mae.segredo); //apenas ela sabe
        //System.out.println(mae.facoDentroDeCasa); // o pedro nao ver, pois está em outra casa
        //System.out.println(mae.formaDeFalar);//apesar de morar em outra casa, ele sabe, pois herdou dela
        //nesse caso estou tentando acessar via instância e não pela herança
        System.out.println(formaDeFalar);//agora eu tenho acesso pela herança

        System.out.println(mae.todosSabem); //todos podem ver
    }

}
