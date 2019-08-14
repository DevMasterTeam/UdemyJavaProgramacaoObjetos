package VColecoes;

import java.util.Stack;

/**
 * Stack é uma coleção que representa uma estrutura de dados do tipo LIFO (last-in-first-out).
 * Significa que o último item adicionado será o primeiro item a ser removido.
 */
public class Pilha {

    private static Stack pilhaPratos = new Stack();

    // Faz a impressão dos items da pilha
    private static void imprimeDados() {
        for (int i = 0; i < pilhaPratos.size(); i++) {
            System.out.println(pilhaPratos.get(i));
        }
    }

    public static void main(String[] args) {

        pilhaPratos.push("Prato 1");
        pilhaPratos.push("Prato 2");
        pilhaPratos.push("Prato 3");
        pilhaPratos.push("Prato 4");

        System.out.println("Pilha completa: ");
        imprimeDados();

        // Remove um item
        pilhaPratos.pop();

        System.out.println("Pilha completa: ");
        imprimeDados();

        // Possível ver qual o elemento que está no topo da pilha
        System.out.println(pilhaPratos.peek());

        // Possível limpar todos os items da pilha
        pilhaPratos.clear();

        // Métodos add & remove
        // Ainda é possível acessar e utilizar os métodos add e remove, uma vez que Stack implementa a interface List
        // Porém, ao fazer isso, não se respeita mais o funcionamento de um pilha.

    }

}