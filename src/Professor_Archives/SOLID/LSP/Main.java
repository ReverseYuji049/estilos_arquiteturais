package Professor_Archives.SOLID.LSP;

public class Main {
    public static void main(String[] args) {
        ItemBiblioteca item = new ItemBiblioteca();
        item.emprestar();

        LivroBiblioteca livro = new LivroBiblioteca();
        livro.emprestar();
    }
}
