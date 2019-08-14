package IIControleFluxo.Exercicios;

/*
1 - Seu programa será responsável por apresentar as condições climáticas de uma cidade usando duas informações; temperatura e chuva.
Os cenários abaixo descrevem as entradas e saídas.
    Se estiver chovendo e temperatura menor ou igual a zero:
        - Neve
    Se estiver chovendo e temperatura maior que zero:
        - Chuva
    Se não estiver chovendo:
        - Clima limpo e sem chuvas
Escreva uma função que receba os valores para chuva e temperatura e imprima na tela os valores de acordo com os cenários.
Obs: Considere a temperatura em Celsius.

2 - Escreva um programa que seja capaz de calcular o valor total de uma compra seguindo as regras abaixo:
Se a quantidade do produto comprada for maior ou igual a 5, o custo é de 2 reais. Se a quantidade do produto for menor do que 5, o custo é 2,5 reais.
Validações:
Se a quantidade for menor ou igual a zero, retorne custo zero.

3. Antônio possui uma agenda muito agitada e não consegue se lembrar das suas atividades de acordo com o dia da semana.
    Segunda-feira -> Aula de flauta e futebol à noite
    Terça-feira -> Estudos de programação e leitura
    Quarta-feira -> Inglês e conversação
    Quinta-feira -> Trabalho de conclusão de curso
    Sexta-feira -> Livre
Escreva um programa que de acordo com o dia da semana, informe qual a atividade Antônio deve fazer.

4 - O departamento de tecnologia da faculdade YEST é responsável por gerar o endereço de email de um aluno usando seu nome e último sobrenome seguindo a regra:
Email: primeira letra do nome + último sobrenome + “@yest.com”
Escreva uma função que retorne uma String contendo o email do aluno. Por hora, não se preocupe com emails repetidos.
Validações:
Caso nome ou sobrenome não sejam informados, retorne a string “ERRO - Dados obrigatórios!”

*/

public class IfElseSwitch {

    private void climaTemperatura(boolean chuva, int temperatura) {
        if (chuva && temperatura <= 0) {
            System.out.println("Neve");
        } else if (chuva) {
            System.out.println("Chuva");
        } else {
            System.out.println("Clima limpo e sem chuvas");
        }
    }

    private float custoProduto(int quantidade) {
        if (quantidade <= 0) {
            return 0;
        } else if (quantidade < 5) {
            return quantidade * 2.5f;
        } else {
            return quantidade * 2;
        }
    }

    /**
     * Considera-se:
     * Segunda - 1
     * Terça - 2
     * Quarta - 3
     * Quinta - 4
     * Sexta - 5
     */
    private String agendaAntonio(int diaSemana) {
        switch (diaSemana) {
            case 1: {
                return "Aula de flauta e futebol à noite";
            }
            case 2: {
                return "Estudos de programação e leitura";
            }
            case 3: {
                return "Inglês e conversação";
            }
            case 4: {
                return "Trabalho de conclusão de curso";
            }
            case 5: {
                return "Livre";
            }
            default: {
                return "Sem dados";
            }
        }
    }

    private String emailYEST(String nome, String sobrenome) {
        if ("".equals(nome) || "".equals(sobrenome)) {
            return "ERRO - Dados obrigatórios!";
        } else {
            return (nome.charAt(0) + sobrenome + "@yest.com").toLowerCase();
        }
    }

}
