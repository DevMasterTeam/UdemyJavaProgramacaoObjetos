package IIIArrays.Exercicios;

/*

1. Considere o código abaixo para ser usado no exercício. Qual o índice que possui a maior String?
String nomes[] = {"Natasha Alianovna Romanoff", "Stephen Vincent Strange", "Anthony Edward Stark"};

2. Escreva uma função capaz de receber um array de float e retornar a média dos valores.
Teste com os arrays abaixo:
float valores[] = {14f, 5.3f, 63.5f, 34f, 15f};
float valores[] = {};
float valores[] = null;
Validações:
Se o array for vazio ou nulo, retornar 0.

3. (Desafio) Considere a função abaixo responsável por calcular o fatorial de um número:
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

Toda vez que essa função é chamada, o cálculo do fatorial é executado passando por todos os passos.
Por exemplo, fazer a chamada a função fatorial(7) e fatorial(7) executará os mesmos passos.
É possível melhorar a performance desta função? Seria possível salvar o valor de um número fatorial
e caso esse mesmo número seja chamado, retornar valor já calculado ao invés de executar todo o cálculo novamente?
Considere que o maior número para calcular o fatorial seja 10. Caso o valor seja maior que 10, retornar 0.

4. Considere a seguinte matriz quadrada que representa as notas de 4 alunos em 4 matérias:
float matriz[][] = {{8.8f, 9, 7.6f, 4}, {8.9f, 9.7f, 9.4f, 8.9f}, {10, 10, 9, 9}, {4.7f, 9.9f, 9.2f, 8.9f}};
Qual a média da sala?


*/

public class Arrays {

    private int maiorString() {
        String nomes[] = {"Stephen Vincent Strange", "Anthony Edward Stark", "Natasha Alianovna Romanoff"};

        int tamanho = nomes[0].length();
        int index = 0;
        for (int i = 1; i < nomes.length; i++) {
            if (nomes[i].length() > tamanho) {
                tamanho = nomes[i].length();
                index = i;
            }
        }
        return index;
    }

    private float media(float[] valores) {

        if (valores == null || valores.length == 0) {
            return 0;
        }

        float soma = 0;
        int index = 0;

        while (index < valores.length) {
            soma += valores[index];
            index++;
        }

        return soma / valores.length;
    }

    long[] fatorial = new long[10];
    private long fatorial(int n) {

        if (n > 10)
            return 0;

        if (n == 0 || n == 1)
            return 1;

        if (fatorial[n - 1] != 0) {
            System.out.println("Cálculo evitado.");
            return fatorial[n - 1];
        }

        long resultado = 1;
        int numeroFatorial = n;
        while (numeroFatorial > 1) {
            resultado *= numeroFatorial;
            numeroFatorial--;
        }

        System.out.println("Cálculo feito.");
        fatorial[n - 1] = resultado;

        return resultado;
    }

    private void mediaSala() {
        float matriz[][] = {{8.8f, 9, 7.6f, 4}, {8.9f, 9.7f, 9.4f, 8.9f}, {10, 10, 9, 9}, {4.7f, 9.9f, 9.2f, 8.9f}};

        int linhas = matriz.length;
        int colunas = matriz[0].length;
        float soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Média: " + (soma / (linhas * colunas)));
    }

}