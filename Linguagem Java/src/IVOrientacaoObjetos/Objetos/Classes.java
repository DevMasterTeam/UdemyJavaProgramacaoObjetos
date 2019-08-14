package IVOrientacaoObjetos.Objetos;

/**
 * Qualquer arquivo Java deve necessariamente ter uma classe com o mesmo nome do arquivo.
 * Uma classe tem necessariamente um nome e não precisa ter métodos ou atributos.
 * Mesmo uma classe vazia sem métodos e atributos ainda precisa das chaves {} para que seja compilada.
 * No exemplo abaixo, temos uma classe com um método e um atributo.
 * <p>
 * Os métodos são considerados comportamentos da classe e também são referenciados como funções.
 * Os atributos são as características da classe. Os dados que ela carrega.
 */
public class Classes {

    // Atributo inteiro chamado 'id'
    private int id;

    public String ola() {
        return "Olá, mundo!";
    }

    // Exemplo de como instanciar uma classe e acessar atributos e métodos
    public static void main(String[] args) {

        // Instanciar uma classe
        Classes classes = new Classes();
        System.out.println(classes.id);
        System.out.println(classes.ola());

    }
}

// Este é o formato mais simples de uma classe, sem métodos ou atributos
// public class Classes { }