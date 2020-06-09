

public abstract class Barco {
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    public Barco(String matricula, double eslora, int anoF, Persona propietario) {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = anoF;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public abstract int getCoeficienteDeBernua();

}
