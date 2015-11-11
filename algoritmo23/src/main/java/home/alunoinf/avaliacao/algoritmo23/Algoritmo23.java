package home.alunoinf.avaliacao.algoritmo23;

/**
 * Classe que calcula a soma dos divisores de um número natural.
 */
public class Algoritmo23 {

    /**
     * Classe que calcula a soma dos divisores de um número natural.
     * @param n Número natural.
     * @return Soma dos divisores de n.
     */
    public static int algoritmo23(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        int d = 2;
        int s = 1;

        while (d <= (n / 2)) {
            if((mod(n, d)) == 0) {
                s += d;
            }

            d++;
        }

        return s;
    }

    public static int mod(int x, int y) {

        /**
         * Classe que retorna o resto  da divisão de dois números inteiros utilizando subtração.
         * @param x Dividendo.
         * @param y Divisor.
         * @return Resto.
         */
        int s = x;

        while(s >= y) {
            s -= y;
        }

        return s;
    }
}
