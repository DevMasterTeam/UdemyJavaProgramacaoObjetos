package IVOrientacaoObjetos.Objetos;

/**
 * Variáveis somente declaradas, mas não inicializadas são grandes candidatas a gerar erros.
 * Variáveis de tipo primitivo nunca serão nulas, sempre possuirão um valor default ao ser instanciadas.
 * Já variáveis que são objetos, caso não possuam inicialização, terão o valor nulo (null).
 */
public class ValoresDefault {

    // Tipos primitivos
    private int anoNascimento;
    private String nome;
    private float preco;

    public static void main(String[] args) {
        ValoresDefault valoresDefault = new ValoresDefault();
        System.out.println("int default: " + valoresDefault.anoNascimento);
        System.out.println("String default: " + valoresDefault.nome);
        System.out.println("float default: " + valoresDefault.preco);
    }

}