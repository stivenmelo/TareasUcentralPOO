public class Main {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(10,1,4);
        Bicicleta tuBicicleta = new Bicicleta(15,5,9);

        miBicicleta.imprimirMensaje(String.format("En mi bicicleta voy a %d KM/h por que tengo el plato %d y el piñon %d \n",
                miBicicleta.getVelocidadActual(), miBicicleta.getPlatoActual(),miBicicleta.getPinionActual()));

        tuBicicleta.imprimirMensaje(String.format("En tu bicicleta vas a %d KM/h por que tienes el plato %d y el piñon %d \n",
                tuBicicleta.getVelocidadActual(), tuBicicleta.getPlatoActual(),tuBicicleta.getPinionActual()));
    }
}