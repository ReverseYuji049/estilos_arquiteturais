package Student_Archives.Patterns.FactoryMethod;

public class EnvioEmail implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando por Email");
    }
}