package home.alunoinf.avaliacao.algoritmo3;

/**
 * Classe que soma os primeiros numeros naturais.
 */
public class Algoritmo3 {

    /**
     * Classe que soma desde os primeiros naturais até o numero fornecio (n).
     * @param n número natural.
     * @return soma.
     */
    public static int algoritmo3(int n){
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }

        return s;
    }
}
