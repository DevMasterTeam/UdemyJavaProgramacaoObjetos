package IIControleFluxo.Exercicios;

/*

1. Imprima todos os números de 10 a 220.

2. Imprima todos os números de 10 a 220 que são pares.

3. Um investimento possui um rendimento de 8% ao ano.
Considerando um investimento inicial de 100 mil, quantos anos demoram até que o valor acumulado seja maior que 1 milhão?

4. No exercício acima, considere que seja adicionado 50 mil reais ao capital após o terceiro ano. Quantos anos demoram até que o valor acumulado seja maior que 1 milhão?
Para fins de cálculo, primeiro aplique o rendimento e posteriormente adicione o capital.

5. Escreva uma função capaz de inverter uma String, ou seja, ao receber "abc", a função deve ser capaz de retornar "cba".
Resolva o exercício de duas maneiras, uma delas usando o controle de fluxo for e outra while.

6. Fatorial é um número natural inteiro positivo, o qual é representado por n!
O fatorial de um número é calculado pela multiplicação desse número por todos os seus antecessores até chegar ao número 1.
Note que nesses produtos, o zero (0) é excluído.
O fatorial é representado por: n! = n . (n – 1) . (n – 2) . (n – 3)!

Fatorial de 0: 0! (lê-se 0 fatorial)
0! = 1

Fatorial de 1: 1! (lê-se 1 fatorial)
1! = 1

Fatorial de 2: 2! (lê-se 2 fatorial)
2! = 2 . 1 = 2

Fatorial de 3: 3! (lê-se 3 fatorial)
3! = 3 . 2 . 1 = 6

Fatorial de 4: 4! (lê-se 4 fatorial)
4! = 4. 3 . 2 . 1 = 24

Escreva um algoritmo que seja capaz de receber um número N e calcule seu fatorial.

7. Considere uma escada de tamanho n = 4
#
##
###
####

Perceba que o número de linhas é igual o número do tamanho da escada.
Perceba também que a quantidade de # é igual ao tamanho da escada na última linha.
Escreva um algoritmo que seja capaz de receber um número N e escrever a escada de acordo com o tamanho.

*/

public class ForWhileDoWhile {

    private void numeros10220() {
        for (int i = 10; i <= 220; i++) {
            System.out.println(i);
        }
    }

    private void numeros10220Pares() {
        for (int i = 10; i <= 220; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private void investimento() {
        float capital = 100000;
        int anos = 0;
        while (capital < 1000000) {
            capital *= 1.08;
            anos++;
        }
        System.out.println(anos + " anos.");
    }

    private void investimento2() {
        float capital = 100000;
        int anos = 0;
        while (capital < 1000000) {
            capital *= 1.08;

            if (anos > 3) {
                capital += 50000;
            }

            anos++;
        }
        System.out.println(anos + " anos.");
    }

    private String inverteString(String str) {
        String invertida = "";

        /*for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }*/

        int tamanho = str.length() - 1;
        while (tamanho >= 0) {
            invertida += str.charAt(tamanho);
            tamanho--;
        }

        return invertida;
    }

    private long fatorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        long resultado = 1;
        while (n > 1) {
            resultado *= n;
            n--;
        }
        return resultado;
    }

    private String escreveEscada(int n) {

        String str = "";
        int contador = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < contador; j++) {
                str += "#";
            }
            contador++;
            str += "\n";
        }

        return str;
    }

}