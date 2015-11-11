package home.alunoinf.avaliacao.algoritmo30;

/**
 * Classe para calcular polinomios.
 */
public class Algoritmo30 {

    /**
     * Classe para calcular polinomios.
     * p(x) = a[n] * x^n + a[n-1] * x^(n-1) + ... + a[2] * x^2 + a[1] * x + a[0].
     * @param x Número.
     * @param g Número inteiro.
     * @param a Vetor.
     * @return Polinomio.
     */
    public static int algoritmo30(int x, int g, int[] a) {
        if ((g < 1) || (a[g] == 0)) {
            throw new IllegalArgumentException("g menor que zero ou a igual a zero");
        }

        int p = a[0];
        int i = 1;
        int t = potencia(x, g);

        while (i <= g) {
            t = potencia(x, i);
            p = (p + a[i] * t);
            i += 1;
        }

        return p;
    }

    public static int potencia(int x, int y) {

        /**
         * Classe para calcular produto de dois numeros naturais utilizando soma.
         * @param x primeiro fator.
         * @param y segundo fator.
         * @return Produto de x * y.
         */
        int i = 1;
        int p = 1;

        while (i <= y) {
            p *= x;
            i++;
        }

        return p;
    }
}

