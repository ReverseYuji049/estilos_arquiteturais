package Professor_Archives.Patterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(
            "CLT",
            1000    
        );

        Contrato contratoJoao = (Contrato) contrato.clone();
        contratoJoao.setTipo("PJ");
        contratoJoao.setValor(15000);

        System.out.println(contrato);
        System.out.println(contratoJoao);
    }
}
