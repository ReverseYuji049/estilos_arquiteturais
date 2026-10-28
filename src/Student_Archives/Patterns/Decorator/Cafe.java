package Student_Archives.Patterns.Decorator;

public class Cafe implements Bebidas {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 2.50;
    }
}
