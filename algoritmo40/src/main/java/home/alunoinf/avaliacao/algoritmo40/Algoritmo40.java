package home.alunoinf.avaliacao.algoritmo40;

/**
 * Classe para calcular se um número é igual a soma do fatórial de seus algarismos.
 */

public class Algoritmo40 {

    /**
     * Classe para calcular se um número é igual a soma do fatórial de seus algarismos.
     * @param n Número natural inteiro 0 <= n <= 999.
     * @return Se um número é igual a soma do fatórial de seus algarismos retorna TRUE senão retorna FALSE.
     */

    public static boolean algoritmo40(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("Número inválido");
        }

        int a = n / 100;
        int b = (n - 100 * a) / 10;
        int c = n % 10;
        int s = fatorial(a) + fatorial(b) + fatorial(c);
        return (s == n);
    }

    public static int fatorial(int n) {

        /**
         * Classe que calcula o fatorial de um número.
         * @param n Número natural inteiro.
         * @return Fatorial de n.
         */
        if (n == 0) {
            return 0;
        }
        else {
            int i = 2;
            int f = 1;

            while (i <= n) {
                f *= i;
                i++;
            }

           return f;
        }
    }
}
