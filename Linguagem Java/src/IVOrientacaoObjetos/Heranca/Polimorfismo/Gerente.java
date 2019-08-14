package IVOrientacaoObjetos.Heranca.Polimorfismo;

public class Gerente extends Funcionario {
    @Override
    void calculaBonus() {
        System.out.println("Bonus do gerente.");
    }
}
