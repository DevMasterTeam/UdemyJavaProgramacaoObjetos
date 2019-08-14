package IIControleFluxo;

public class FluxoFor {

    public static void main(String[] args) {

        // Repete o mesmo código até que a condição seja falsa
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

            // Possível de fazer verificações de fluxo
            if (i == 5) {

                // Para sair de um laço de repetição
                break;
            }

        }

        // É possível declarar uma variável dentro do for, como mostrado acima
        // Também possível declarar fora e usá-la dentro do dor
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // No exemplo abaixo, temos um for sem inicialização de variável, uma vez que valor já foi iniciado
        int j = 0;
        for (; j < 10; j++) {
            System.out.print(j + " ");
        }

        // O código abaixo fará com que o programa seja executado sem critério de parada.
        // Chamado de loop infinito.
        // for (;;) { }

    }

}
