

public class Barco {
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
}
