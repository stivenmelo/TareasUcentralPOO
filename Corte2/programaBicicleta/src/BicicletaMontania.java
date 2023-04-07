public class BicicletaMontania extends Bicicleta {

    private int suspension;
    public BicicletaMontania(int velocidadActual, int platoActual, int pinionActual, int suspension) {
        super(velocidadActual,platoActual,pinionActual);
        this.suspension = suspension;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public void cambiarSuspension(int suspension){
        this.imprimirMensaje(String.format("Cambio la suspension de %d a %d \n", getSuspension(), suspension));
        setSuspension(suspension);
    }
}
