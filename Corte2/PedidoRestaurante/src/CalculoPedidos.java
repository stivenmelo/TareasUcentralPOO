public class CalculoPedidos{

    //region Atributos
    private int primerPlato = 0;
    private int  segundoPlato = 0;
    private int bebida = 0;
    private int postre = 0;
    //endregion

    //region Contructor
    public CalculoPedidos() {
        primerPlato = 12000;
        segundoPlato = 14000;
        bebida = 5000;
        postre = 8000;
    }
    //endregion

    //region getters y setter
    public int getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(int primerPlato) {
        this.primerPlato = primerPlato;
    }

    public int getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(int segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public int getPostre() {
        return postre;
    }

    public void setPostre(int postre) {
        this.postre = postre;
    }
    //endregion

    //region Metodos
    public String CalcularPedido(int primerPlato, int bebida){
        return String.format("su orden de primer plato y una bebida tiene un valor total de %d$",primerPlato+bebida);
    }

    public String CalcularPedido(int primerPlato,int segundoPlato, int bebida){
        return String.format("su orden de primer plato, segundo plato y una bebida tiene un valor total de %d$",primerPlato+segundoPlato+bebida);
    }

    public String CalcularPedido(int primerPlato,int segundoPlato, int bebida,int postre){
        return String.format("su orden de primer plato, segundo plato, una bebida y un postre tiene un valor total de %d$",primerPlato+segundoPlato+bebida+postre);
    }
    //endregion
}
