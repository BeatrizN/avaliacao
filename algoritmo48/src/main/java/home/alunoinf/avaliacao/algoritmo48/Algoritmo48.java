package home.alunoinf.avaliacao.algoritmo48;

/**
 * Classe que organiza os valores de um Array em ordem decrescente.
 */
public class Algoritmo48 {

    /**
     * Classe que organiza os valores de um Array em ordem decrescente.
     * @param n número natural correspondentes ao tamanho do array.
     */
    public static void algoritmo48(int [] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("N é maior que o tamanho do vetor!");
        }

        for(int p = n; p >= 1; p--) {
            for(int i = 1; i < p; i++) {
                if (a[i] < a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
    }
}

