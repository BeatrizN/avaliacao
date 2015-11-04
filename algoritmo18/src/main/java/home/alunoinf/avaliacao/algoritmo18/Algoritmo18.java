package home.alunoinf.avaliacao.algoritmo18;

/**
 * Classe para obtenção do logaritmo natural simples.
 */
public class Algoritmo18 {

    /**
     * Classe que calcula logaritmo natural simples, utilizando potencia e fatorial.
     * @param n numero natural.
     * @param k número natural.
     * @return logaritmo.
     */
    public static int algoritmo18(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k inválido");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = potencia(n, i);
            long f = fatorial(i);
            e += p / f;
            i++;
        }

        return (int) e;
    }

    public static int potencia(int base, int expoente) {
        int i = 1;
        int p = 1;

        while(i <= expoente) {
            p = p * base;
            i++;
        }

        return p;
    }

    public static int fatorial(int i) {
        if (i == 1) {
            return 1;
        }

        return i * fatorial(i - 1);
    }
}
