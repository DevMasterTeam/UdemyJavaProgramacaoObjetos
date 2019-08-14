package IIControleFluxo;

/**
 * Switch case pode ser usado quando existe possibilidades limitadas de valores para uma variável.
 * O mesmo funcionamento poderia ser alcançado com if/else, porém em alguns casos, a definição de valores desta forma facilita a leitura.
 * Existe também a possibilidade de fornecer um comportamento padrão definido no 'default', caso os valores não satisfaçam a condição.
 * A palavra break dentro de cada validação faz com que a verificação de valores seja terminada e não verifique as próximas condições.
 */
public class FluxoSwitch {

    private void calculaBonus(String cargo, Float salario) {
        switch (cargo) {
            case "Gerente": {

                // Switch case com controle de fluxo
                if (salario <= 2000) {
                    System.out.println("O bônus é de ${salario * 0.5f}");
                } else {
                    System.out.println("O bônus é de ${salario * 0.6f}");
                }

                break;
            }
            case "Supervisor": {
                System.out.println("O bônus é de ${salario * 0.6f}");
                break;
            }
            default: {
                System.out.println("Bônus padrão de R$300,00");
            }
        }
    }

    public static void main(String[] args) {
        FluxoSwitch fluxoWhen = new FluxoSwitch();
        fluxoWhen.calculaBonus("Gerente", 1800f);
        fluxoWhen.calculaBonus("Gerente", 2800f);
        fluxoWhen.calculaBonus("Supervisor", 1300f);
        fluxoWhen.calculaBonus("Técnico", 1200f);
    }

}