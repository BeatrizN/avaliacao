package home.alunoinf.avaliacao.algoritmo45;

/**
 * Classe que Imprime Array.
 */
public class Algoritmo45 {

    /**
     * Classe que imprime Array.
     * @param n número natural que indica o tamanho do vetor.
     * @return soma.
     */
    public static void algoritmo45(int [] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("tamanho vetor");
        }

        int i = 1;

        while(i <= n) {
            System.out.print(a[i]);
            i++;
        }
    }
}
