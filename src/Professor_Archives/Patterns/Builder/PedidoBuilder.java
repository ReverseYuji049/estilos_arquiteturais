package Professor_Archives.Patterns.Builder;

public class PedidoBuilder {
    private String lanche;
    private String bebida;
    private boolean batata;

    public PedidoBuilder lanche(String lanche){
        this.lanche = lanche;
        return this;
    }
    public PedidoBuilder bebida(String bebida){
        this.bebida = bebida;
        return this;
    }
    public PedidoBuilder batata(boolean batata){
        this.batata = batata;
        return this;
    }
    
    public Pedido build(){
        return new Pedido(lanche, bebida, batata);
    }
}
