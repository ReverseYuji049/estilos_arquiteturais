package Student_Archives.Patterns.Adapter;

// Essa classe é um Adapter
public class PagamentoPix implements Pagamentos {

    // Chamada e configuração da API (simulação)
    private PixAPIExterna pixAPI;

    public PagamentoPix(PixAPIExterna pixAPI) {
        this.pixAPI = pixAPI;
    }

    @Override
    public void pagar(double valor) {
        // Mudança na API: pagamento em dólar
        valor = valor / 5.20;
        // Consumo da API
        pixAPI.pgtPix(valor);
    }
}
