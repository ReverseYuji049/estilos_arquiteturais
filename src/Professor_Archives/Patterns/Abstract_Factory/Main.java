package Professor_Archives.Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String tipo = "andr"; 

        if(tipo.equals("ios")){
            Fabricas fabricaIOS = new FabricaIOS();

            Botao btnIOS = fabricaIOS.criarBotao();
            Input inputIOS = fabricaIOS.criarInput();

            btnIOS.renderizarBotao();
            inputIOS.renderizarInput();

        }else if (tipo.equals("andr")){
            Fabricas fabricaAndr = new FabricaAndroid();

            Botao btnAndr = fabricaAndr.criarBotao();
            Input inputAndr = fabricaAndr.criarInput();

            btnAndr.renderizarBotao();
            inputAndr.renderizarInput();
        }
    }
}
