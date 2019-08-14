package IVOrientacaoObjetos.Objetos;

/**
 * Um construtor é um método chamado no momento que uma classe é instanciada.
 * É muito comum que no construtor haja a atribuição de valores para os atributos da classe.
 * <p>
 * Mesmo que uma classe não possua construtor explícitamente declarado, existe ainda um construtor
 * default que permite que a classe seja iniciada.
 * <p>
 * É possível que uma classe tenha mais do que um construtor.
 * Em muitos casos, é normal que ao instaciar uma classe, nem todos os valores do construtor estejam presentes.
 * Por isso, existe mais de um construtor.
 * <p>
 * Para que uma classe seja instanciável, o contrutor deve estar acessível. Se por algum motivo o construtor
 * for declarado como privado, a classe não poderá ser instanciada.
 */
public class Construtores {

    // Construtor explícitamente declarado
    public Construtores() {
    }

    // Mais um construtor
    public Construtores(String str) {
    }

    // Mais um construtor
    public Construtores(String str, int valor) {
    }


    public static void main(String[] args) {

        // Instancia da classe usando os três construtores disponíveis
        Construtores c1 = new Construtores();
        Construtores c2 = new Construtores("Construtor");
        Construtores c3 = new Construtores("Construtor", 100);
    }

}