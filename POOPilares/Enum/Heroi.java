package POOPilares.Enum;

public class Heroi extends Jogador {
    @Override
    public boolean atacar(Jogador oponente) {
        int deltax = Math.abs(this.x - oponente.x);
        int deltay = Math.abs((this.y - oponente.y));

        if (deltax == 0 && deltay == 1) {
            oponente.vida -= 40;
            return true;
        } else if (deltax == 1 && deltay == 0) {
            oponente.vida -= 40;
            return true;
        } else {
            return false;
        }
    }
}
