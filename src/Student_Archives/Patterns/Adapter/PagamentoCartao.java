package Student_Archives.Patterns.Adapter;

public class PagamentoCartao implements Pagamentos {
    @Override
    public void pagar(double valor) {
        System.out.println("Pago com cartão: R$" + valor);
    }
}
