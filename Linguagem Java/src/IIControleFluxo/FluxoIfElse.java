package IIControleFluxo;

/**
 * Operador ternário
 * (expressão) ? instrução caso expressão seja verdadeira : instrução caso expressão seja falsa
 * Exemplo: (10 == 10) ? true : false
 */
public class FluxoIfElse {

    private String maiorDeIdade(int idade) {

        // boolean validacao = idade == 18;
        // boolean validacao = idade > 18;
        // boolean validacao = idade >= 18;
        // boolean validacao = idade < 18;
        // boolean validacao = idade <= 18;
        // boolean validacao = idade != 18;

        // O controle de fluxo if/else tem o poder de alterar o fluxo do programa baseado numa condição.
        // Quando a expressão dentro do if é verdadeira, o código relacionado ao if é executado.
        // if (expressao)

        if (idade >= 18) {
            return "Maior de idade.";
        } else {
            return "Menor de idade.";
        }
    }

    // Operador ternário
    private String maiorDeIdadeTernario(int idade) {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }

    // Cálulo de bônus de funcionário
    // Importante notar a possibliade do controle de fluxo aninhado, ou seja, um dentro do outro.
    private void bonusFuncionario(int anosEmpresa) {
        if (anosEmpresa == 0) {
            System.out.println("Bônus padrão: R$200,00");
        } else {
            if (anosEmpresa >= 1 && anosEmpresa < 3) {
                System.out.println("Bônus: R$400,00");
            } else if (anosEmpresa >= 3 && anosEmpresa < 5) {
                System.out.println("Bônus: R$100,00");
            } else {
                System.out.println("Bônus: R$2000,00");
            }
        }
    }

    public static void main(String[] args) {

        FluxoIfElse fluxoIfElse = new FluxoIfElse();
        System.out.println(fluxoIfElse.maiorDeIdade(15));
        System.out.println(fluxoIfElse.maiorDeIdade(25));

        System.out.println(fluxoIfElse.maiorDeIdadeTernario(15));
        System.out.println(fluxoIfElse.maiorDeIdadeTernario(25));

        fluxoIfElse.bonusFuncionario(0);
        fluxoIfElse.bonusFuncionario(1);
        fluxoIfElse.bonusFuncionario(4);
        fluxoIfElse.bonusFuncionario(10);

    }

}