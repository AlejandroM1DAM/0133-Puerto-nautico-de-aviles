

public class EmbarcacionAMotor extends Barco{

    private int potencia;

    public EmbarcacionAMotor(String matricula, double eslora, int anoF, Persona propietario,int potencia) {
        super(matricula, eslora, anoF, propietario);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public int getCoeficienteDeBernua() {
        return potencia;
    }

    @Override
    public String toString() {
        String aDevolver = super.toString();
        aDevolver += "Potencia: " + potencia + "\n";
        return aDevolver;
    }
}
