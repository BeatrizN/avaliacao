package home.alunoinf.avaliacao.algoritmo10;

/**
 * Classe para implementação do crivo de Eratóstenes.
 */
public class Algoritmo10 {

    /**
     * Classe para implementação do crivo de Eratóstenes.
     * Se o número for primo recebe o valor 0, senão recebe o valor 1.
     * @param a Vetor de inteiros.
     * @param n Numeros de termos do vetor.
     */
    public static void algoritmo10(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Número menor que dois");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho do vetor");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Número menor que zero");
            }
        }

        int i = 2;

        while(i <= n/2) {
            if (a[i] == 0) {
                int c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }

            i++;
        }
    }
}
