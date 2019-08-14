package IIIArrays;

/**
 * Um array pode ter mais de uma dimensão. Pode ser definido como um array de arrays.
 */
public class ArrayMultidimensional {

    // Uma matriz 4x4 - 4 linhas e 4 colunas - Sem valores
    int[][] numeros = new int[4][4];

    // Uma matriz já inicializada
    float matriz[][] = {{8.8f, 9, 7.6f, 4}, {8.9f, 9.7f, 9.4f, 8.9f}, {10, 10, 9, 9}, {4.7f, 9.9f, 9.2f, 8.9f}};

    public static void main(String[] args) {
        ArrayMultidimensional arr = new ArrayMultidimensional();

        // Como percorrer uma matriz
        for (int i = 0; i < arr.numeros.length; i++) {
            for (int j = 0; j < arr.numeros[i].length; j++) {
                System.out.print(arr.numeros[i][j] + " ");
            }
            System.out.println();
        }
    }

}
