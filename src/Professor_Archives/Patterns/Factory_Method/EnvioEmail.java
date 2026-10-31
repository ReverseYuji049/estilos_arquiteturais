package Professor_Archives.Patterns.Factory_Method;

public class EnvioEmail implements IntNotificacoes{
    @Override
    public void enviar() {
        System.out.println("Enviando por Email");
    }
}
