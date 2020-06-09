

public class Puerto {
    private Alquiler[] amarres;
    private static final int NUMERO_AMARRES = 4;

    public Puerto() {
        amarres = new Alquiler[NUMERO_AMARRES];
    }

    public double alquilarAmarre(int numDias, Barco barco) {
        double precioAmarre = -1;
        int primerAmarreLibre = -1;
        int amarreActual = 0;
        while(amarreActual < 4 && primerAmarreLibre == -1) {
            if(amarres[amarreActual] == null){
                primerAmarreLibre = amarreActual;
                Alquiler alquiler = new Alquiler(barco, numDias);
                amarres[amarreActual] = alquiler;
                precioAmarre = alquiler.getPrecio();
            }
            amarreActual++;
        }

        return precioAmarre;
    }
    public void verEstadoAmarres() {
        String estadoAmarres = "";

        for (int i = 0; i < amarres.length; i++) {
            if (amarres[i] != null) {
                estadoAmarres += "Amarre " + i + ": Ocupado\n";
                estadoAmarres += amarres[i].toString();

            } else {
                estadoAmarres += "Amarre " + i + ": Libre\n";
            }
        }

        System.out.println(estadoAmarres);
    }
    public double liquidarAlquilerAmarre(int amarre) {
        double precioAlquiler = -1;

        if (amarre < amarres.length && amarres[amarre] != null) {
            precioAlquiler = amarres[amarre].getPrecio();
            amarres[amarre] = null;
        }

        return precioAlquiler;
    }
}
