package home.alunoinf.avaliacao.algoritmo31;

/**
 * Classe para calcular polinomios Horner.
 */
public class Algoritmo31 {

    /**
     * Classe para calcular polinomios Horner.
     * @param x Número que multiplica cada valor do vetor.
     * @param g Número inteiro.
     * @param a Vetor
     * @return Valor do polinomio de Horner.
     */
    public static int algoritmo31(int x, int g, int[] a) {
        if (g < 1) {
            throw new IllegalArgumentException("Número 'g' inválido");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = (p * x + a[i]);
            i--;
        }

        return p;
    }
}



