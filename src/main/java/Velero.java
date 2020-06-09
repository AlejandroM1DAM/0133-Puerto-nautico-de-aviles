

public class Velero extends Barco {

    private int numMastiles;

    public Velero(String matricula, double eslora, int anoF, Persona propietario,int numMastiles) {
        super(matricula, eslora, anoF, propietario);
        this.numMastiles = numMastiles;
    }
}
