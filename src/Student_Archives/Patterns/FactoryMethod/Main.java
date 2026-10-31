package Student_Archives.Patterns.FactoryMethod;

public class Main {
    static void main() {
        IntNotificacoes notificacaoEmail = new FabricaEmail().criarNotificacoes();
        notificacaoEmail.enviar();

        IntNotificacoes notificacaoSMS = new FabricaSMS().criarNotificacoes();
        notificacaoSMS.enviar();
    }
}
