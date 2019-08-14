package IVOrientacaoObjetos.Objetos;

/**
 * A palavra this se refere a instância de uma classe.
 */
public class PalavraThis {

    // Atributo de classe
    private String nome;

    // nome - Atributo da função
    public PalavraThis(String nome) {

        // Como diferenciar o atributo da classe do atributo da função?
        // A palavra this sempre se refere a classe.
        this.nome = nome;
    }

}
