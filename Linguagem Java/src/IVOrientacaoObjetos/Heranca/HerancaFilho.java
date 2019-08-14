package IVOrientacaoObjetos.Heranca;

public class HerancaFilho extends HerancaPai {

    private void funcaoEspecifica() {
        System.out.println("Sou específica da Herança Filha.");
    }

    @Override
    public void ola() {
        System.out.println("Sobrescrita da função ola definida na classe pai.");
        super.ola();
    }

    // Overload - Sobrecarga - Métodos com o mesmo nome, mas que diferem na quantidade e tipos de parâmetros
    public void overload(String str) {}
    public void overload(int i) {}
    public void overload(boolean b) {}

    public static void main(String[] args) {

        // Chama a uma função definida na classe pai
        HerancaFilho h = new HerancaFilho();
        h.ola();
        h.funcaoEspecifica();

    }

}