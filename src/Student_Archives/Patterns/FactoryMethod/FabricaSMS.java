package Student_Archives.Patterns.FactoryMethod;

public class FabricaSMS extends FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioSMS();
    }
}
