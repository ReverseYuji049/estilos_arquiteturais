package Student_Archives.Patterns.AbstractFactory.aplicacao;

import Student_Archives.Patterns.AbstractFactory.Android.FabricaAndroid;
import Student_Archives.Patterns.AbstractFactory.iOS.FabricaIOS;
import Student_Archives.Patterns.AbstractFactory.interfaces.Fabricas;

public class Main {
    static void main() {
        Fabricas fabricaAndroid = new FabricaAndroid();
        Renderizador renderizadorAndroid = new Renderizador(fabricaAndroid);

        renderizadorAndroid.renderizar();

        Fabricas fabricaIOS = new FabricaIOS();
        Renderizador renderizadorIOS = new Renderizador(fabricaIOS);

        renderizadorIOS.renderizar();
    }
}
