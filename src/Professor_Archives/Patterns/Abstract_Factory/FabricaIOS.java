package Professor_Archives.Patterns.Abstract_Factory;

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
