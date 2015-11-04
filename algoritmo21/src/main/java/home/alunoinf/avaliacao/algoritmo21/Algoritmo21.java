package home.alunoinf.avaliacao.algoritmo21;

/**
 * Classe para verificar se um número é um quadrado perfeito.
 */
public class Algoritmo21 {

    /**
     * Classe que verifica se um número é um quadrado perfeito.
     * @param k Número natural.
     * @return Se k for um quadrado perfeito retorna TRUE senão retorna FALSE.
     */
    public static boolean algoritmo21 (int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int q = 1;

        while(q < k) {
            i += 2;
            q += i;
        }

        return q == k;
    }
}
