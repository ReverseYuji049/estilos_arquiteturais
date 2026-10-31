package Professor_Archives.Patterns.Builder;

public class Pedido {
    private String lanche;
    private String bebida;
    private boolean batata;

    public Pedido(
        String lanche, 
        String bebida,
        boolean batata
    ){
        this.lanche = lanche;
        this.bebida = bebida;
        this.batata = batata;
    }

    @Override
    public String toString(){
        return 
            "Pedido{" + 
                "lanche= " + lanche + 
                ", bebida= " + bebida + 
                ", batata= " + batata + 
            "}";
    }
}
