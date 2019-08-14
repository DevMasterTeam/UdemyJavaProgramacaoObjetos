package IIControleFluxo;

public class FluxoWhile {

    public static void main(String[] args) {

        // while executa uma sequência de instruções enquanto a condição for verdadeira.
        int indice = 1;
        while (indice < 10) {
            System.out.print("indice: " + indice + " ");
            indice++;
        }

        System.out.println();
        System.out.println("-------------");

        // do..while executa uma sequência de instruções enquanto a condição for verdadeira.
        // Extremamente parecido com while, porém do..while executa as intruções dentro do corpo no mínimo uma vez,
        // considerando que a validação ocorre somente no final.
        int indiceDoWhile = 1;
        do {
            System.out.print("indiceDoWhile: " + indiceDoWhile);
            indiceDoWhile++;
        } while (indiceDoWhile < 0);

    }
}