public class Main {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(10,1,4);
        Bicicleta tuBicicleta = new Bicicleta(15,5,9);
        BicicletaMontania BicicletaMontania = new BicicletaMontania(20,5,8,4);
        BicicletaTandem tuBicicletaTandem = new BicicletaTandem(12,2,4,2);

        miBicicleta.imprimirMensaje(String.format("En mi bicicleta voy a %d KM/h por que tengo el plato %d y el piñon %d \n",
                miBicicleta.getVelocidadActual(), miBicicleta.getPlatoActual(),miBicicleta.getPinionActual()));

        tuBicicleta.imprimirMensaje(String.format("En tu bicicleta vas a %d KM/h por que tienes el plato %d y el piñon %d \n",
                tuBicicleta.getVelocidadActual(), tuBicicleta.getPlatoActual(),tuBicicleta.getPinionActual()));

        BicicletaMontania.imprimirMensaje(String.format("En mi bicicleta monataña vas a %d KM/h por que tienes el plato %d , el piñon %d y una suspención de %d \n",
                BicicletaMontania.getVelocidadActual(), BicicletaMontania.getPlatoActual(),BicicletaMontania.getPinionActual(), BicicletaMontania.getSuspension()));

        BicicletaMontania.cambiarSuspension(20);

        BicicletaMontania.imprimirMensaje(String.format("En mi bicicleta monataña vas a %d KM/h por que tienes el plato %d , el piñon %d y una suspención de %d \n",
                BicicletaMontania.getVelocidadActual(), BicicletaMontania.getPlatoActual(),BicicletaMontania.getPinionActual(), BicicletaMontania.getSuspension()));

        tuBicicletaTandem.imprimirMensaje(String.format("En tu bicicleta tadem vas a %d KM/h por que tienes el plato %d , el piñon %d y con %d asientos \n",
                tuBicicletaTandem.getVelocidadActual(), tuBicicletaTandem.getPlatoActual(),tuBicicletaTandem.getPinionActual(), tuBicicletaTandem.getNumAsientos()));

        tuBicicletaTandem.cambiarNumAsientos(3);

        tuBicicletaTandem.imprimirMensaje(String.format("En tu bicicleta tadem vas a %d KM/h por que tienes el plato %d , el piñon %d y con %d asientos \n",
                tuBicicletaTandem.getVelocidadActual(), tuBicicletaTandem.getPlatoActual(),tuBicicletaTandem.getPinionActual(), tuBicicletaTandem.getNumAsientos()));


    }
}