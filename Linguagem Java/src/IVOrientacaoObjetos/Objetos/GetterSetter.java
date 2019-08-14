package IVOrientacaoObjetos.Objetos;

/**
 * É costume e um padrão da programação Java não deixar acesso a atributos diretamente.
 * Sempre que o acesso a uma variável é necessária, deve-se criar método Getter e Setter.
 *
 * Getter é responsável por devolver o valor da variável.
 * Setter é responsável por atribuir o valor a variável.
 *
 * Aqui encontramos o conceito de encapsulamento.
 * Os métodos são usados para obter e atribuir valores, porém não é conhecido qual a implementação dentro de cada um.
 * É possível implementar lógica dentro do getter ou setter, caso necessário.
 * */
public class GetterSetter {

    // Atributo privado
    private String nome;
    private int idade;

    // Getter - Público para obter o valor da variável
    public String getNome() {
        return nome;
    }

    // Setter - Público para atribuir o valor da variável
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Só é possível obter o valor da idade, não é possível trocar
    public int getIdade() {
        return idade;
    }
}
