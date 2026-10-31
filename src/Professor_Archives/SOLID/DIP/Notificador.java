package Professor_Archives.SOLID.DIP;

public class Notificador {
    private Notificacoes notificacoes;

    public Notificador(Notificacoes notificacoes){
        this.notificacoes = notificacoes;
    }

    public void notificar(String mensagem){
        notificacoes.enviarNotificacoes(mensagem);
    }
}
