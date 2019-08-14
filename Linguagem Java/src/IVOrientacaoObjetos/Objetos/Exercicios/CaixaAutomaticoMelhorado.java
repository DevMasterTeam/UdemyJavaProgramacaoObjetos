package IVOrientacaoObjetos.Objetos.Exercicios;

/**
 * Resolução do exercício descrito na classe CaixaAutomatico
 */
public class CaixaAutomaticoMelhorado {

    private float saldo = 50000;

    public void saque(float valor) throws Exception {

        if (valor < 0) {
            throw new Exception("Não é possível sacar um valor negativo.");
        }

        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque efetuado.");
        } else {
            throw new Exception("Não há dinheiro disponível em caixa.");
        }
    }

    public void recarga(float valorRecarga) throws Exception {

        if (valorRecarga <= 0) {
            throw new Exception("Valor de recarga deve ser maior que zero.");
        }

        saldo += valorRecarga;
    }

    public static void main(String[] args) {
        CaixaAutomaticoMelhorado caixa = new CaixaAutomaticoMelhorado();

        try {

            // Primeiro cliente vai fazer um saque
            caixa.saque(100);

            // Segundo cliente vai fazer um saque
            caixa.saque(3000);

            // Depois de dois saques, melhor repor o dinheiro
            caixa.recarga(1000);

            // Mais um cliente vai fazer um saque
            caixa.saque(1000000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
