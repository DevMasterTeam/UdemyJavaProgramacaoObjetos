package IVOrientacaoObjetos.Heranca.Polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Analista();

        MainPolimorfismo main = new MainPolimorfismo();
        main.bonus(f1);
        main.bonus(f2);
    }

    private void bonus(Funcionario funcionario) {
        funcionario.calculaBonus();
    }

}
