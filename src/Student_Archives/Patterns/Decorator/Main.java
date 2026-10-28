package Student_Archives.Patterns.Decorator;

public class Main {
    static void main() {
        Bebidas cafe = new Cafe();

        // Preço do café sem açúcar
        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());

        // Instância do objeto Acucar
        cafe = new Acucar(cafe);

        // Novo preço do café com adiciona de açúcar
        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());
    }
}
