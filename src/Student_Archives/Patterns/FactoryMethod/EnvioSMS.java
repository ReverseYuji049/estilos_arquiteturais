package Student_Archives.Patterns.FactoryMethod;

public class EnvioSMS implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando por SMS");
    }
}
