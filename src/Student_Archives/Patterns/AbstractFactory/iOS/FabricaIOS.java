package Student_Archives.Patterns.AbstractFactory.iOS;

import Student_Archives.Patterns.AbstractFactory.interfaces.Botao;
import Student_Archives.Patterns.AbstractFactory.interfaces.Fabricas;
import Student_Archives.Patterns.AbstractFactory.interfaces.Input;

public class FabricaIOS implements Fabricas {
    @Override
    public Botao criarBotao() {
        return new BtnIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
