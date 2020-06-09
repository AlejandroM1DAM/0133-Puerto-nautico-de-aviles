

public class Yate extends EmbarcacionAMotor {

    private int numCamarotes;

    public Yate(String matricula, double eslora, int anoF, Persona propietario,int potencia, int numC) {
        super(matricula, eslora, anoF, propietario, potencia);
        numCamarotes = numC;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }
    /*

    @Override
    public int getCoeficienteDeBernua() {
        return getPotencia() + numCamarotes;
    }

     */
}
