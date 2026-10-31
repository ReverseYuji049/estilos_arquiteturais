package Student_Archives.Patterns.AbstractFactory.Android;

import Student_Archives.Patterns.AbstractFactory.interfaces.Botao;

public class BtnAndroid implements Botao {

    @Override
    public void renderizarBotao() {
        System.out.println("Btn Android");
    }
}
