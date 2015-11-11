package home.alunoinf.avaliacao.algoritmo38;

/**
 * Classe para calcular Hipotenusa.
 */

public class Algoritmo38 {

    /**
     * Classe para calcular Hipotenusa.
     * @param a Cateto.
     * @param b Cateto.
     * @return Hipotenusa
     */
    public static int algoritmo38(int a, int b) {

        int x = a * a;
        int y = b * b;
        int r = raizQuadrada(x + y);
        return r;
    }

    public static int raizQuadrada(int n) {

        /**
         * Classe que calcula raiz-quadrada.
         * @param n Radicando.
         * @return Raiz quadrada.
         */
        int r = 1;

        for(int i = 5; i >= 0; i--) {
            r = (r + (n / r)) / 2;
        }

        return r;
    }
}