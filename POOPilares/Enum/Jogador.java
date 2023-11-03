package POOPilares.Enum;

public class Jogador {


    int vida = 100;
    int x;
    int y;
    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
            }
        return true;
        }
    public boolean atacar(Jogador oponente){
        int deltax = Math.abs(this.x - oponente.x);
        int deltay = Math.abs((this.y - oponente.y));

        if(deltax == 0 && deltay == 1){
            oponente.vida -=10;
            return true;
        }else if(deltax == 1 && deltay == 0){
            oponente.vida -= 10;
            return true;
        }else{
            return false;
        }

    }



}
