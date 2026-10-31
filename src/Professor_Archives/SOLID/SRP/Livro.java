package Professor_Archives.SOLID.SRP;

public class Livro {
    private final String titulo;
    private final String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return  titulo;
    }

    public String getAutor(){
        return autor;
    }
}
