package home.alunoinf.avaliacao.algoritmo15;

/**
 * Classe para obtenção do valor de Pi.
 */
public class Algoritmo15 {

    /**
     * Classe para obtenção do valor de Pi envolvendo um total de n termos.
     * Quanto maior o valor de n mais preciso será o valor de Pi.
     * @param n Número natural.
     * @return Pi.
     */
    public static long algoritmo15(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;

        while (i <= n) {
            d += 2;
            s = -1 * s;
            p += (4 * s) / d;
            i++;
        }

        return p;
    }
}
