package IVOrientacaoObjetos.Objetos.Composicao;

/**
 * Classe que define características da pessoa
 */
public class Pessoa {

    public String nome;
    public int anoNascimento;
    public String signo;

    // Composição
    private Endereco endereco;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Atenção aos valores default!
        // Ocasiona erro, pois endereço nunca foi inicializado.
        System.out.println(pessoa.endereco.cidade);

        // pessoa.endereco = new Endereco();
    }
}