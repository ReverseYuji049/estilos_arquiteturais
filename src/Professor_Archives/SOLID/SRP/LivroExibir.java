package Professor_Archives.SOLID.SRP;

public class LivroExibir {
    public void exibir(Livro livro){
        System.out.println("O título é: " + livro.getTitulo());
        System.out.println("O autor é: " + livro.getAutor());
    }
}
