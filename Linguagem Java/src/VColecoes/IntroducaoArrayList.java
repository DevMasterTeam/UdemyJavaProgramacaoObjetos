package VColecoes;

import java.util.ArrayList;

/**
 * Coleções em Java são classes e interfaces criadas para auxiliar no uso de arrays.
 * Comparados com a declaração de um array - int[] arr = new int[10]; As coleções trazem métodos
 * úteis para manipulação dos dados.
 */
public class IntroducaoArrayList {

    // Declaração do ArrayList
    private static ArrayList nomes = new ArrayList();

    // Faz a impressão dos items do array
    private static void imprimeArray() {
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }

    public static void main(String[] args) {

        // Um ArrayList pode receber quantos items for necessário
        // Seu tamanho em memória é alocado de acordo com a necessidade.
        nomes.add("Gabriel");
        nomes.add("Tony");
        nomes.add("Andre");
        nomes.add("Natalia");

        System.out.println("Array completo: ");
        imprimeArray();

        System.out.println();
        // Possível remover passando o objeto
        nomes.remove("Tony");

        // Possível remover passando o index
        // nomes.remove(0);

        System.out.println("Array sem Tony: ");
        imprimeArray();

        // Verfifica se a lista está vazia - true/false
        nomes.isEmpty();

        // Verifica se contém o elemento - true/false
        nomes.contains("Gabriel");

        System.out.println();
        System.out.println("Gabriel está na posição: " + nomes.indexOf("Gabriel"));

        // Remove todos os items do array
        nomes.clear();

    }

}