package Professor_Archives.SOLID.ISP;

public class Main {
    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.gerenciarLivros();

        Administrador administrador = new Administrador();
        administrador.emitirRelatorio();
        administrador.gerenciarLivros();
        administrador.gerenciarUsuario();
    }
}
