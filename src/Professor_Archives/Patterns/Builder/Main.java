package Professor_Archives.Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
            .bebida("Coca-Zero")
            .build();

        System.out.println(pedido);
    }
}
