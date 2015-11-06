package home.alunoinf.avaliacao.algoritmo17;

/**
 * Classe para obtenção do fatorial.
 */
public class Algoritmo17 {

    /**
     * Classe que calcula o fatorial de um número utilizando a função.
     * @param n Número natural.
     * @return Fatorial de n.
     */
    public static int algoritmo17(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = produto(f, i);
            i++;
        }

        return f;
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

