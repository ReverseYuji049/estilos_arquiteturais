package Professor_Archives.Patterns.Prototype;

public class Contrato implements ContratoPrototype {
    private String tipo;
    private double valor;

    public Contrato(
        String tipo,
        double valor
    ){
        this.tipo = tipo;
        this.valor = valor; 
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    @Override 
    public ContratoPrototype clone(){
        return new Contrato(this.tipo, this.valor);
    }

    @Override
    public String toString(){
        return 
            "Contrato{ " 
                + "tipo= " + tipo 
                + ", valor= " + valor + "}";
    }
}
