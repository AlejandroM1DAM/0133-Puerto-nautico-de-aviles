

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
        if(barco instanceof Velero) {
            precio += (VALOR_A_MULTIPLICAR_BERNUA * ((Velero) barco).getNumMastiles());
        }
        else if (barco instanceof Yate) {
            precio += (VALOR_A_MULTIPLICAR_BERNUA * (((Yate) barco).getPotencia() + ((Yate) barco).getNumCamarotes()));
        }
        else if (barco instanceof EmbarcacionAMotor) {
            precio += (VALOR_A_MULTIPLICAR_BERNUA * ((EmbarcacionAMotor) barco).getPotencia());
        }

        return precio;
    }
}
