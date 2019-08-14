package IVOrientacaoObjetos.Objetos;

/**
 * Ao se criar a instância de uma classe usando a palavra new, é criado um objeto.
 * Esse objeto será alocado na memória e referenciado pela variável usada para istanciá-lo.
 */
public class MultiplasInstancias {

    private int valor;

    public static void main(String[] args) {

        // Criação de uma instância
        MultiplasInstancias m1 = new MultiplasInstancias();
        m1.valor = 100;

        // Aqui não ocorre a instância de uma classe, mas sim referência a um objeto já existente
        MultiplasInstancias m2 = m1;

        // Ao fazer a ação abaixo o valor referenciado é atualizado, ou seja, o valor referente a instância m1
        m2.valor = 200;

        System.out.println("M1: " + m1.valor);
        System.out.println("M2: " + m2.valor);
    }

}
