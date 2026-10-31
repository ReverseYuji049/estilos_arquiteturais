package Professor_Archives.SOLID.DIP;

public class EnvioSMS implements Notificacoes {

    @Override
    public void enviarNotificacoes(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
