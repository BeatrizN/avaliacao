package home.alunoinf.avaliacao.algoritmo13;

/**
 * Classe para calcular número harmônico.
 */
public class Algoritmo13 {

    /**
     * Classe para calcular número harmônico.
     * Número harmônico = 1/1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n.
     * @param n Número natural.
     * @return Número harmônico.
     */
    public static int algoritmo13(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;
        int s = 1;
        while (i <= n) {
            s = s + 1/i;
            i++;
        }

        return s;
    }
}
