package IVOrientacaoObjetos.MaisObjetos.Exercicios;

/*

1. Escreva uma classe chamada Temperatura que seja capaz de converter Celsius para outras escalas de temperatura.
Ao criar os métodos, considere-os estáticos.
Considere também, as formulas de conversão abaixo:

- Celsius para Fahrenheit => F = (9 × Celsius/5) + 32)
- Celsius para Kelvin => K = Celsius + 273.15

*/

public class ExerciciosMaisObjetos {

    private static float celsiusFahrenheit(float graus) {
        return (9 * graus /5) + 32;
    }

    private static float celsiusKelvin(float graus) {
        return graus + 273.15f;
    }

}
