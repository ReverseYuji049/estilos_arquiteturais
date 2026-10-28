package Student_Archives.Patterns.AbstractFactory;

public class FabricaAndroid implements Fabricas{

    @Override
    public Botao criarBotao() {
        return new BtnAndroid();
    }

    @Override
    public Input criarInput() {
        return null;
    }
}
