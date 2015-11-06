package home.alunoinf.avaliacao.algoritmo9;

/**
 * Classe para verificar se um numero e primo ou nao.
 */
public class Algoritmo9 {

    /**
     * Classe para verificar se um numero e primo ou não.
     * @param n Número de entrada.
     * @return Se o número é Primo retorna TRUE senão, retorna FALSE.
     */
    public static boolean algoritmo9(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;

        while (i <= (n - 1)) {
            if ((n % 2) == 0) {
                return false;
            }

            i++;
        }

        return true;
    }
}

