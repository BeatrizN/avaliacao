package home.alunoinf.avaliacao.algoritmo22;

/**
 * Classe para verificar se a soma dos divisores de um numero de entrada é igual ao outro (também de entrada).
 */
public class Algoritmo22 {

    /**
     * Classe para verificar se a soma dos divisores de um numero de entrada é igual ao outro (também de entrada)
     * e vice-versa.
     * @param n Número natural.
     * @param m Número natural.
     * @return Se forem iguais retorna TRUE senão retorna FALSE.
     */
    public static boolean algoritmo22 (int n, int m) {
        if ((n < 1)|| (m < 1)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int sn = somaDivisores(n);
        int sm = somaDivisores(m);

        return ((sn == m) && (sm == n));
    }

    public static int somaDivisores(int n) {

        /**
         * Classe que calcula a soma dos divisores de um número natural.
         * @param n Número natural.
         * @return Soma dos divisores de n.
         */
        int d = 2;
        int s = 1;

        while (d <= (n / 2)) {
            if((n % d) == 0) {
                s += d;
            }

            d++;
        }

        return s;
    }
}
