package Student_Archives.Patterns.Decorator;

public abstract class Decoradores implements Bebidas {
    protected Bebidas bebida;

    public Decoradores(Bebidas bebida) {
        this.bebida = bebida;
    }
}
