public class BicicletaTandem extends Bicicleta{
    private int numAsientos;

    public BicicletaTandem(int velocidadActual, int platoActual, int pinionActual, int numAsientos) {
        super(velocidadActual, platoActual, pinionActual);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void cambiarNumAsientos(int numAsientos){
        this.imprimirMensaje(String.format("Cambio el numero de asientos de %d a %d \n", getNumAsientos(), numAsientos));
        setNumAsientos(numAsientos);
    }
}

