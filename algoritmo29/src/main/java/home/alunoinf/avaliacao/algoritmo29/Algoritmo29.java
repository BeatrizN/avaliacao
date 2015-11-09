package home.alunoinf.avaliacao.algoritmo29;

/**
 * Classe que calcula raiz-quadrada.
 */
public class Algoritmo29 {

    /**
     * Classe que calcula raiz-quadrada.
     * @param n Radicando.
     * @param i Indice.
     * @return Raiz quadrada.
     */
    public static int algoritmo29(int n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        int r = 1;

        while(i >= 0) {
            r = (r + (n / r)) / 2;
            i--;
        }

        return r;
    }
}
