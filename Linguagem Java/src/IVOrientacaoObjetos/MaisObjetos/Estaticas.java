package IVOrientacaoObjetos.MaisObjetos;

/**
 * Ele muda o escopo de um método ou atributo.
 * Com o static, ao invés deles pertencerem à instância do objeto, eles pertencem à classe.
 *
 *
 * Um campo estático é aquele que está disponível em uma classe de forma única para toda a aplicação.
 * Ele não está vinculado a uma instância da classe.
 * Ele pertence a classe em si e é compartilhado por todas as instâncias (objetos)
 * desta classe criadas durante a execução da aplicação.
 *
 * Os métodos static podem ser chamados sem uma instância. São ótimos como utilitários.
 * Métodos estáticos não podem acessar variáveis de instância.
 *
 * */
public class Estaticas {

    public Estaticas() {
        CONSTANTE++;
    }

    private int valor;

    static int CONSTANTE = 10;
    static void metodo() {
        // Não é possível acessar, pois valor depende de uma instância da classe
        // System.out.println(valor);
    }

}

/*
public class Main {

    public static void main(String[] args) {

        new Estaticas();
        System.out.println(Estaticas.CONSTANTE);
        new Estaticas();
        System.out.println(Estaticas.CONSTANTE);
        new Estaticas();
        System.out.println(Estaticas.CONSTANTE);
        Estaticas.metodo();
    }

}
*/