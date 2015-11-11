package home.alunoinf.avaliacao.algoritmo11;

/**
 * Classe para descobrir MDC de dois números naturais.
 */
public class Algoritmo11 {

    /**
     * Classe para descobrir o Máximo Divisor Comum de dois numeros naturais.
     * @param a Número natural.
     * @param b Número natural.
     * @return MDC.
     */
    public static int algoritmo11(int a, int b) {
        if ((a < b) || (b <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
