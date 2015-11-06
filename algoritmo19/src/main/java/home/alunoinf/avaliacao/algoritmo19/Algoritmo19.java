package home.alunoinf.avaliacao.algoritmo19;

/**
 * Classe para obtenção do logaritmo natural simples.
 */
public class Algoritmo19 {

    /**
     * Classe que calcula logaritmo natural simples.
     * @param n numero natural.
     * @param k número natural.
     * @return logaritmo.
     */
    public static int algoritmo19(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 2;
        double e = n + 1;
        double t = n;

        while (i <= k) {
            t = t * n / i;
            e += t;
            i++;
        }
        
        return (int) e;
    }
}



