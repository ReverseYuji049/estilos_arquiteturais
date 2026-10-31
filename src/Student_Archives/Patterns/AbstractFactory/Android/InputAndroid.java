package Student_Archives.Patterns.AbstractFactory.Android;

import Student_Archives.Patterns.AbstractFactory.interfaces.Input;

public class InputAndroid implements Input {

    @Override
    public void renderizarInput() {
        System.out.println("Input Android");
    }
}
