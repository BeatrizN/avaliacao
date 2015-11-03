package home.alunoinf.avaliacao.algoritmo14;

/**
 * Classe que calcula o somatório de um número.
 */
public class Algoritmo14 {

    /**
     * Classe que calcula o somatório de um número.
     * Somatório n = 1/(1 + 1*1) + 1/(1 + 2*2) + 1/(1 + 3*3) + ... + 1/(1 + (n-1)*(n-1)) + 1(1 + n*n)
     * @param n Número natural.
     * @return Somatório de n.
     */
    public static int algoritmo14(int n){
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int s = 0;
        int d;
        while (i <= n) {
            d = 1 + i * i;
            s = s + 1/d;
            i++;
        }

        return s;
    }
}