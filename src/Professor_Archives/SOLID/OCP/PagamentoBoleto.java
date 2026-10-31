package Professor_Archives.SOLID.OCP;

public class PagamentoBoleto extends Pagamentos{
    @Override 
    public void pagar(double valor){
        System.out.println("Pagando com Boleto");
    }

}
