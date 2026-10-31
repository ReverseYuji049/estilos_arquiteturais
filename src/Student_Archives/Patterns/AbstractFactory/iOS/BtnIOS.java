package Student_Archives.Patterns.AbstractFactory.iOS;

import Student_Archives.Patterns.AbstractFactory.interfaces.Botao;

public class BtnIOS implements Botao {

    @Override
    public void renderizarBotao() {
        System.out.println("Btn IOS");
    }
}
