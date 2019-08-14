package IIIArrays;

/**
 * Array é uma sequência de elementos. Útil quando é necessário armazenar vários valores de um mesmo tipo.
 */
public class Introducao {

    // Declaração de um array vazio. Para declarar um array, um tamanho deve ser sempre especificado.
    // Isso faz com que o tamanho correto sejaalocado na memória quando o programa é executado.
    long[] numeros = new long[10];

    // Declaração de um array já preenchido
    // Aqui não especificamos o tamanho, porém o compilador sabe que é um array de 4 posições
    // considerando os valores informados.
    long numerosDeclarados[] = {1, 2, 3, 4};

    public static void main(String[] args) {

        Introducao introducao = new Introducao();

        // Um array possui um tamanho
        System.out.println(introducao.numeros.length);

        // Seus elementos podem ser manipulados
        introducao.numeros[0] = 100;
        introducao.numerosDeclarados[0] = 100;

        // Muita atenção ao tamanho de um array
        // No exemplo da variável 'numeros', seu tamanho é 10,
        // mas o index de um array SEMPRE começa em 0. Ou seja, da posição 0 até a 9.
        // A posição 10 não existe, ela não foi reservada no momento da declaração.

        // Erro - ArrayIndexOutOfBoundsException
        // System.out.println(introducao.numeros[10]);

        // Uma maneira rápida e simplificada do controle de fluxo 'for'
        for (long item : introducao.numeros) {
            System.out.println(item);
        }
    }

}