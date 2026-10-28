package Student_Archives.Patterns.Adapter;

public class Main {
    static void main() {
        Pagamentos pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.pagar(50.00);

        // Não é necessário se consumo de API for real
        PixAPIExterna pix = new PixAPIExterna();

//        Pagamentos pagamentoPix = new PagamentoPix(50.00);
    }
}
