package Professor_Archives.SOLID.ISP;

public class Administrador implements IntAdm, IntBibliotecario {
    @Override
    public void gerenciarLivros() {
        System.out.println("Livros");
    }

    @Override
    public void gerenciarUsuario(){
        System.out.println("Usuarios");
    }

    @Override 
    public void emitirRelatorio(){
        System.out.println("Relatorio");
    }
    
}
