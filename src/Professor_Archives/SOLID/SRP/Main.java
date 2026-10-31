package Professor_Archives.SOLID.SRP;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Clean Code", "Thiago");
        LivroSalvar repository = new LivroSalvar();
        LivroExibir relatorio = new LivroExibir();

        repository.salvar(livro);
        relatorio.exibir(livro);
    }
}
