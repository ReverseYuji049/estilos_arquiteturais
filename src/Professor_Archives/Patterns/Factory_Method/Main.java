package Professor_Archives.Patterns.Factory_Method;

// A classe Main representa o consumidor da Factory
public class Main {
    public static void main(String[] args) {
        // InstÂncia de uma notificação por email
        IntNotificacoes notificacoes = new FabricaNotificacoes()
            .criarNotificacoes("email");

        // Executa o envio por e-mail
        notificacoes.enviar();
    }
}
