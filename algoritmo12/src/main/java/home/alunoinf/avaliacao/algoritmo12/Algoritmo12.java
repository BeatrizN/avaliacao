package home.alunoinf.avaliacao.algoritmo12;

/**
 * Classe para descobrir MDC de dois numeros naturais.
 */
public class Algoritmo12 {

    /**
     * Classe para descobrir o Máximo Divisor Comum de dois numeros naturais utilizando subtracao.
     * @param a Número natural.
     * @param b Número natural.
     * @return MDC.
     */
    public static int algoritmo12(int a, int b) {
        if ((a < b) || (b <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        while (a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}