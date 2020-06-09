

public class EmbarcacionAMotor extends Barco{

    private int potencia;

    public EmbarcacionAMotor(String matricula, double eslora, int anoF, Persona propietario,int potencia) {
        super(matricula, eslora, anoF, propietario);
        this.potencia = potencia;
    }
}
