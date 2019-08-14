package IVOrientacaoObjetos.Heranca;

/**
 * Herança é uma funcionalidade em orientação a objetos que permite fazer a especialização de classes.
 * A classe HerancaPai é a classe pai de HerancaFilha.
 * A classe HerancaFilha é a especialização de HerancaPai, possuindo uma função a mais.
 * É possível que as classes especializadas tenham métodos e parâmetros a mais declarados.
 *
 * Para que uma classe possa ser herdada, é necessário que sua visibilidade seja publica.
 * No Java não existe herança múltipla, ou seja, só é possível herdar de uma classe, nunca mais de uma.
 * */
public class HerancaPai {
    public void ola() {
        System.out.println("Olá, Mundo!");
    }
}