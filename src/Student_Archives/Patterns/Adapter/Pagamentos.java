package Student_Archives.Patterns.Adapter;

public interface Pagamentos {
    // Valor sempre em reais (R$)
    //void pagar(double valor);

    // Mudança na API
    void pagar(double valor);
}
