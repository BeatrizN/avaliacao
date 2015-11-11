package home.alunoinf.avaliacao.algoritmo42;

/**
 * Classe que soma os primeiros números naturais.
 */
public class Algoritmo42 {

    /**
     * Classe que soma desde os primeiros naturais até o numero fornecio (n) utilizando recursividade.
     * @param n número natural.
     * @return soma.
     */
    public static int algoritmo42(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        if ( n == 1) {
            return 1;
        } else {
            return (algoritmo42(n - 1) + n);
        }
    }
}
