public class Main {
    public static void main(String[] args) {
        CalculoPedidos orden = new CalculoPedidos();
        System.out.println(orden.CalcularPedido(orden.getPrimerPlato(),orden.getBebida()));

        System.out.println(orden.CalcularPedido(orden.getPrimerPlato(), orden.getSegundoPlato(),orden.getBebida()));

        System.out.println(orden.CalcularPedido(orden.getPrimerPlato(), orden.getSegundoPlato(),orden.getBebida(), orden.getPostre()));
    }
}