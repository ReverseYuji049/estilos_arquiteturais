package Student_Archives.Patterns.AbstractFactory.aplicacao;

import Student_Archives.Patterns.AbstractFactory.interfaces.Botao;
import Student_Archives.Patterns.AbstractFactory.interfaces.Fabricas;
import Student_Archives.Patterns.AbstractFactory.interfaces.Input;

public class Renderizador {

    private final Fabricas fabrica;

    public Renderizador(Fabricas fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
