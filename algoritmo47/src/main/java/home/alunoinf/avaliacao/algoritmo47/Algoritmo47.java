package home.alunoinf.avaliacao.algoritmo47;

/**
 * Classe que calcula média aritmetica dos valores de um Array.
 */
public class Algoritmo47 {

    /**
     * Classe calcula média aritmetica dos valores de um Array.
     * @param n número natural correspondentes ao tamanho do array.
     * @return Média aritmetica dos valores de um Array.
     */
    public static int algoritmo47(int [] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        if (a.length != (n + 1)) {
            throw new IllegalArgumentException("N é maior que o tamanho do vetor!");
        }

        int s = somaArray(a, n);
        return (int) s / n;
    }

    public static int somaArray(int [] a, int n) {

        /**
         * Classe que soma os n primeiros números de um Array.
         * @param n número natural.
         * @return soma dos n primeiros números do Array.
         */
        int s = 0;
        int i = 1;

        while(i <= n) {
            s += a[i];
            i++;
        }

        return s;
    }
}
