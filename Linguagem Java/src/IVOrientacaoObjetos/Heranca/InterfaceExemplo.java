package IVOrientacaoObjetos.Heranca;

/**
 * Interfaces podem conter declarações de métodos que serão obrigatoriamente sobrescritos.
 * Os métodos que serão sobrescritos precisam estar com assinatura e tipo de retorno definido, não pode haver corpo.
 *
 * A diferença de interface com classe abstrata é que interfaces não existe nenhum método que possua corpo.
 * Interface não pode ter método ou atributo privado, tudo é público.
 *
 * É possível que uma classe implemente mais de uma interface, não há problema.
 * */
public interface InterfaceExemplo {

    // Variável que não pode ter seu valor alterado
    // Não é uma boa prática manter uma variável na interface, pelo fato de que uma interface
    // representa um contrato e a ideia é que esse contrato não possua estado.
    // Ou seja, que não existam variáveis.
    // int valor = 10;

    void ligar(int potencia);
    void desligar();

}

/*
public class Main implements InterfaceExemplo {

    @Override
    public void ligar(int potencia) {
        System.out.println(potencia);
    }

    @Override
    public void desligar() {

    }
}
*/