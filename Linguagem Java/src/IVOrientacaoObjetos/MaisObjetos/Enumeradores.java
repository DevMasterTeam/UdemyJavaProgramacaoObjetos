package IVOrientacaoObjetos.MaisObjetos;

public enum Enumeradores {

    BAIXA(1), MEDIA(5), ALTA(10);

    private int id;
    Enumeradores(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

/*
----- Exemplo de utilização

// Classe feita para conseguir chamar classe Enumeradores
public class Main {

    // Possibilidade de usar o enumerador como um tipo de variável
    private Enumeradores prioridade;

    public Main() {
        prioridade = Enumeradores.BAIXA;
    }

    public static void main(String[] args) {

        // Imprimir
        System.out.println(Enumeradores.BAIXA);
        System.out.println(Enumeradores.BAIXA.getId());

        // Iterando na lista de opções
        for (Enumeradores e: Enumeradores.values()) {

            if (e.equals(Enumeradores.ALTA)) {
                System.out.println("Crítico!");
            } else {
                System.out.println(e);
            }
        }
    }
}
*/