package VColecoes;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics é a capacidade de definir o tipo de dado que será usado em uma coleção a fim de evitar erros de conversão.
 */
public class Generics {

    // Usando a interface para definir um ArrayList - Polimorfismo
    // Um conjunto de dados de tipo definido - String
    private static List<String> listaNomes = new ArrayList<>();

    public static void main(String[] args) {

        // Agora só é possível definir o tipo de dados declarado na variável
        listaNomes.add("Tony");
        listaNomes.add("Natalia");
        listaNomes.add("Anthony");

        // Não permitido
        // listaNomes.add(10);

        // Adiciona na segunda posição
        listaNomes.add(2, "Henrique");

        // Verifica se existe o elemento na lista
        listaNomes.contains("Tony");

        // Verifica se a lista está vazia - Ainda ocorre erro caso seja nula
        listaNomes.isEmpty();

        // Separa somente uma parte da lista
        listaNomes.subList(0, 2);

        // Remove o index
        listaNomes.remove(2);

    }

}