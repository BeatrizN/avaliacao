package home.alunoinf.avaliacao.algoritmo18;

/**
 * Classe para obtenção do logaritmo natural simples.
 */
public class Algoritmo18 {

    /**
     * Classe que calcula logaritmo natural simples, utilizando potencia e fatorial.
     * @param n numero natural.
     * @param k número natural.
     * @return logaritmo.
     */
    public static int algoritmo18(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = potencia(n, i);
            long f = fatorial(i);
            e += p / f;
            i++;
        }

        return (int) e;
    }

    public static int potencia(int x, int y) {

        /**
         * Classe para calcular potencia de números naturais utilizando multiplicacao.
         * @param x Base.
         * @param y Expoente.
         * @return Potencia x^y
         */
        int i = 1;
        int p = 1;

        while(i <= y) {
            p *= x;
            i++;
        }

        return p;
    }

    public static int fatorial(int n) {

        /**
         * Classe que calcula o fatorial de um número.
         * @param n Número natural.
         * @return Fatorial de n.
         */
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f *= i;
            i++;
        }

        return f;
    }
}

