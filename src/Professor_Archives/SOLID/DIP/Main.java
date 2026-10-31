package Professor_Archives.SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        Notificacoes envioEmail = new EnvioEmail();
        Notificador notificador = new Notificador(envioEmail);
        
        notificador.notificar("Teste");
        Notificacoes envioSMS = new EnvioSMS();
        Notificador notificador2 = new Notificador(envioSMS);
        
        notificador2.notificar("Teste");
    }
}
