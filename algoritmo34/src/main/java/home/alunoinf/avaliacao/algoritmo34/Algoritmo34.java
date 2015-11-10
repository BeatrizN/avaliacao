package home.alunoinf.avaliacao.algoritmo34;

/**
 * Classe para verificar CPF.
 */
public class Algoritmo34 {

    /**
     * Classe para verificar CPF.
     * O primeiro dígito é d[1] (letra a) até d[11].
     * Os dígitos verificadores são, respectivamente, d[10] e d[11] (j e k).
     * @param d Número do CPF.
     * @return Se o CPF for válido retorna TRUE senão retorna FALSE.
     */
    public static boolean algoritmo34(int[] d) {

        if (d.length != 12) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
        }

        for (int i = 1; i <= 11; i++) {
            if ((d[i] > 9) || (d[i] < 0)) {
                throw new IllegalArgumentException("Dígito inválido");
            }
        }

        int c = 8;
        int p = d[9]; // p iniciado com o dígito i.
        int s = d[9]; // s iniciado com o dígito i.

        while (c >= 1) {
            p += d[c];
            s += p;
            c--;
        }

        int j = mod(mod(s, 11), 10);
        int k = mod(mod((s - p + 9 * j), 11), 10);

        return ((j == d[10]) && (k == d[11]));
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