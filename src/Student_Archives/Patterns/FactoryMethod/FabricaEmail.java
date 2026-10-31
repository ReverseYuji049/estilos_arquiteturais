package Student_Archives.Patterns.FactoryMethod;

public class FabricaEmail extends FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioEmail();
    }
}
