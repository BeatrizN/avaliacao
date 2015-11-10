package home.alunoinf.avaliacao.algoritmo33;

/**
 * Classe para verificar CPF.
 */
public class Algoritmo33 {

    /**
     * Classe para verificar CPF.
     * @param d Número do CPF.
     * @return Se o CPF for válido retorna TRUE senão retorna FALSE.
     */
    public static boolean algoritmo33(int[] d) {

        if (d.length != 12) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
        }

        for (int i = 1; i <= 11; i++) {
            if ((d[i] > 9) || (d[i] < 0)) {
                throw new IllegalArgumentException("Dígito inválido");
            }
        }

        int sj = 0;
        int sk = 0;

        for(int i = 1; i <= 9; i++) {
            sj += i * d[i];
        }

        for(int i = 1; i <= 9; i++) {
            sk += i * d[i + 1];
        }

        int j = mod(mod(sj, 11), 10);
        int k = mod(mod(sk, 11), 10);

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