package Student_Archives.Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItensSistema {

    private String nome;
    private List<ItensSistema> pasta = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItensSistema novoItem){
        pasta.add(novoItem);
    }

    @Override
    public void abrir() {
        System.out.println("Pasta: " + nome);
    }
}
