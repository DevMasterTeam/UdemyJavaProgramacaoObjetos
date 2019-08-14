package IVOrientacaoObjetos.Objetos.Exercicios;

/*

Exercício.
Considere a classe abaixo. É possível reescrevê-la de maneira a melhorar o entendimento e manutenção?
Considere assuntos como construtor, encapsulamento, uso de funções e tratamento de exceções.
Há alguma validação a mais que poderia ser incluída?

*/
public class CaixaAutomatico {

    public float saldo = 50000;

    public void saque(float valor) throws Exception {

        if (valor < 0) {
            throw new Exception("Não é possível sacar um valor negativo.");
        }

        if (saldo > 0) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Saque efetuado.");
            }
        }
    }

    public void recarga(float valorRecarga) {
        if (saldo == 0) {
            saldo += valorRecarga;
        } else {
            saldo = saldo + valorRecarga;
        }
    }

    public static void main(String[] args) {
        CaixaAutomatico caixa = new CaixaAutomatico();

        try {

            // Primeiro cliente vai fazer um saque
            if (caixa.saldo > 0) {
                caixa.saque(100);
            }

            // Segundo cliente vai fazer um saque
            try {
                if (caixa.saldo > 0) {
                    caixa.saque(3000);
                }
            } catch (Exception e) {
                throw e;
            }

            // Depois de dois saques, melhor repor o dinheiro
            caixa.recarga(1000);

            // Mais um cliente vai fazer um saque
            caixa.saque(1000000);

        } catch (Exception e) {
            System.out.println("Algo de errado ocorreu..");
        }

    }

}
