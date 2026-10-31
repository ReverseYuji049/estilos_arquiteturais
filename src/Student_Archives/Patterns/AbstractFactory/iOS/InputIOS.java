package Student_Archives.Patterns.AbstractFactory.iOS;

import Student_Archives.Patterns.AbstractFactory.interfaces.Input;

public class InputIOS implements Input {

    @Override
    public void renderizarInput() {
        System.out.println("Input IOS");
    }
}
