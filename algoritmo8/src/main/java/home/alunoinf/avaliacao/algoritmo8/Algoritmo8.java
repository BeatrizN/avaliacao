package home.alunoinf.avaliacao.algoritmo8;

/**
 * Classe para implementação da propriedade do número 153.
 */
public class Algoritmo8 {

    /**
     * Classe para implementação da propriedade do número 153.
     * Utilizada para saber se a soma do cubo de seus algarismos de um número de entrada é igual à ele mesmo.
     * @param n 0 <= número <= 999.
     * @return Se o numero tem essa propriedade retorna TRUE senão, retorna FALSE.
     */
    public static boolean algoritmo8(int n) {
        if ((n < 0) || (n > 999)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = n / 100;
        int j = (n - 100*i) / 10;
        int k = n % 10;
        return (i*i*i + j*j*j + k*k*k) == n;
    }
}