

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

    @Override
    public String toString() {
        String aDevolver = "Matrícula: " + matricula + "\n";
        aDevolver += "Eslora: " + eslora + "\n";
        aDevolver += "Año de fabricación: " + anoFabricacion + "\n";
        aDevolver += "Propietario: " + propietario.toString();
        return aDevolver;
    }
}
