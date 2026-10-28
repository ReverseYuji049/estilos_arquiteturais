package Student_Archives.Patterns.Composite;

public class Arquivo implements ItensSistema {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println("Item: " + nome);
    }
}
