package Professor_Archives.SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.pagar(100.00);
        
        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
        pagamentoCartaoCredito.pagar(100.00);
        

    }
}
