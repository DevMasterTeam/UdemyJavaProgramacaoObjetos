package IVOrientacaoObjetos.MaisObjetos;

/**
 * Os modificadores de visibilidade:
 * public, private, protected
 *
 * Vale a pena destacar que não são aplicadas apenas à classes, mas também métodos e atribuos.
 * Também é válido para construtores, uma vez que também são métodos.
 *
 * public
 * Uma classe, método ou atributo public é acessível pela classe, pacote e classes externas ao pacote.
 *
 * private
 * Uma classe, método ou atributo private é acessível somente pela classe.
 * A classe principal não pode receber private ou protected ou o Java vai gerar um erro.
 * A classe principal pode ter o modificador public ou ser deixado sem modificar algum.
 * Se deixado sem nenhum modificador, se diz default e se torna visível para as classes do mesmo pacote.
 *
 * protected
 * Uma classe, método ou atributo private é acessível pelas classe no mesmo pacote.
 *
 * */

/*

Classe, atributos e método acessível para o projeto
public class Visibilidade {
    public String nome;
    public void hello() { }
}

// Atributo nome só é visível dentro da classe
public class Visibilidade {
    private String nome;
    public void hello() { }
}

// Nem atributo nem método visível fora da classe, somente acesso interno
public class Visibilidade {
    private String nome;
    private void hello() { }
}

// Métodos e atributo protected, visível somente dentro do pacote
class Visibilidade {
    protected String nome;
    protected void hello() { }
}

* */

class Visibilidade {}