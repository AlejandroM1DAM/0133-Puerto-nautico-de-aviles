

public class Alquiler {

    private Barco barco;
    private int dias;
    public static final double VALOR_A_MULTIPLICAR_ESLORA = 10;
    public static final double VALOR_A_MULTIPLICAR_BERNUA = 300;

    public Alquiler(Barco barco, int numDias) {
        this.barco = barco;
        dias = numDias;
    }

    public Barco getBarco() {
        return barco;
    }

    public int getNumeroDias() {
        return dias;
    }
    public double getPrecio() {
        double precio = dias * (VALOR_A_MULTIPLICAR_ESLORA * barco.getEslora());

        precio += (VALOR_A_MULTIPLICAR_BERNUA * barco.getCoeficienteDeBernua());
        return precio;
    }
    @Override
    public String toString() {
        String aDevolver = "Barco: " + barco.toString();
        aDevolver += "Días: " + dias + "\n";
        aDevolver += "Precio: " + getPrecio() + "\n";
        return aDevolver;

    }
}
