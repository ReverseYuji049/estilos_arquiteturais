package Student_Archives.Patterns.Composite;

public class Main {
    static void main() {
        Pasta home = new Pasta("Home");
        Pasta docs = new Pasta("Docs");

        Arquivo foto = new Arquivo("Foto");
        Arquivo contrato = new Arquivo("Contrato");

        // Objetos compondo outros
        home.adicionarItem(docs);
        home.adicionarItem(foto);
        home.adicionarItem(contrato);
        home.abrir();

    }
}
