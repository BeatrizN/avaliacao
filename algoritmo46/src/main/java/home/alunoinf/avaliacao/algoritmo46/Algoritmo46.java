package home.alunoinf.avaliacao.algoritmo46;

/**
 * Classe que soma os primeiros números de Array.
 */
public class Algoritmo46 {

    /**
     * Classe que soma os n primeiros números de um Array.
     * @param n número natural.
     * @return soma dos n primeiros números do Array.
     */
    public static int algoritmo46(int [] a, int n){
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("N é maior que o tamanho do vetor!");
        }

        int s = 0;
        int i = 1;

        while(i <= n) {
            s += a[i];
            i++;
        }

        return s;
    }
}

