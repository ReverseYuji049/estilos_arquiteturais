package Student_Archives.Patterns.Decorator;

public class Acucar extends Decoradores {

    public Acucar(Bebidas bebidas) {
        super(bebidas);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com adicional de açúcar";
    }
    // Aumenta o preço da bebida
    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.50;
    }
}
