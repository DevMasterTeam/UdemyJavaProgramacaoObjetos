package IVOrientacaoObjetos.Heranca.Polimorfismo;

public class Analista extends Funcionario {
    @Override
    void calculaBonus() {
        System.out.println("Bonus do analista.");
    }
}
