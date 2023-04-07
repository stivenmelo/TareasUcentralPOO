public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int pinionActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinionActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinionActual = pinionActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinionActual() {
        return pinionActual;
    }

    public void setPinionActual(int pinionActual) {
        this.pinionActual = pinionActual;
    }
    public void acelerar(){
        int aumentoVelocidad = getVelocidadActual()*2;
        this.imprimirMensaje(String.format("Acelero, su velocidad aumento de %d a %d \n", getVelocidadActual(), aumentoVelocidad));
        setVelocidadActual(aumentoVelocidad);
    }
    public void frenar(){
        int disminucionVelocidad = getVelocidadActual()/2;
        this.imprimirMensaje(String.format("Freno, su velocidad disminuyó de %d Km/h a %d Km/h \n", getVelocidadActual(), disminucionVelocidad));
        setVelocidadActual(disminucionVelocidad);
    }
    public void cambiarPlato(int plato){
        this.imprimirMensaje(String.format("Cambio el plato del %d al %d \n", getPlatoActual(), plato));
        setPlatoActual(plato);
    }

    public void cambiarPinion(int pinion){
        this.imprimirMensaje(String.format("Cambio el Piñon del %d al %d \n", getPinionActual(), pinion));
        setPinionActual(pinion);
    }

    public void imprimirMensaje(String Mensaje){
        System.out.print(Mensaje);
    }
}
