package Professor_Archives.Patterns.Abstract_Factory;

public class FabricaAndroid implements Fabricas {
    @Override
    public Botao criarBotao() {
        return new BtnAndroid() ;
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
