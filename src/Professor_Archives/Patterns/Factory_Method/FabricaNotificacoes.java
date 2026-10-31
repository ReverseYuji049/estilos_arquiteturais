package Professor_Archives.Patterns.Factory_Method;

// Classe Factory: cria objetos de notificação
public class FabricaNotificacoes {
    // Recebe o tipo de notificação
    public IntNotificacoes criarNotificacoes(String tipo){
        if(tipo.equals("sms")){
            return new EnvioSMS();
        } else if (tipo.equals("email")){
            return new EnvioEmail();
        }else{
            throw new IllegalArgumentException("Tipo Notificação Inválida");
        }
    }
}
