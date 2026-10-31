package Student_Archives.Patterns.AbstractFactory.Android;

import Student_Archives.Patterns.AbstractFactory.interfaces.Botao;
import Student_Archives.Patterns.AbstractFactory.interfaces.Fabricas;
import Student_Archives.Patterns.AbstractFactory.interfaces.Input;

public class FabricaAndroid implements Fabricas {

    @Override
    public Botao criarBotao() {
        return new BtnAndroid();
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
