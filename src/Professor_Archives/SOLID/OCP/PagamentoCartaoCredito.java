package Professor_Archives.SOLID.OCP;

public class PagamentoCartaoCredito extends Pagamentos {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com Cartão");
    }

}
