import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cadenaNumero = "";
        int numero= 0;
        Scanner leer = new Scanner(System.in);

        ImprimirMensaje("Digite el numero de repeticiones de la serie: ");
        cadenaNumero = leer.next();

        if (isNumeric(cadenaNumero)){
            numero = Integer.parseInt(cadenaNumero);
            ImprimirMensaje(sumarNumerosEnSerie(numero));
        }else {
            ImprimirMensaje("No digito un numero.");
        }
    }

    public static String sumarNumerosEnSerie(int numeroDeRepeticiones){
        int resultado = 0;
        for (int i = 1; i <= numeroDeRepeticiones; i++) {
            resultado += 1+i;
        }
        return "La suma de la serie es: " + resultado;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static void ImprimirMensaje(String Mensaje){
        System.out.println(Mensaje);
    }
}