package home.alunoinf.avaliacao.algoritmo6;

/**
 * Classe para descobrir potencia de numeros naturais.
 */
public class Algoritmo6 {

    /**
     * Classe para descobrir potencia de numeros naturais utilizando mutiplicacao..
     * @param x Base.
     * @param y Expoente.
     * @return Potencia de x^y.
     */
    public static int algoritmo6(int x, int y) {
        if ((x <= 0) || (y <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int p = x;

        while (i < y) {
            p = produto(p, x);
            i++;
        }

        return p;
    }

    public static int produto(int a, int b) {

        /**
         * Classe para calcular produto de dois numeros naturais utilizando soma.
         * @param a primeiro fator.
         * @param b segundo fator.
         * @return Produto de a e b.
         */
        int i = 1;
        int s = 0;

        while (i <= b) {
            s += a;
            i++;
        }

        return s;
    }
}
