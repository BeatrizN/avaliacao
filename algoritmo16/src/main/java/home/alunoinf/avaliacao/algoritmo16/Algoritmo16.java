package home.alunoinf.avaliacao.algoritmo16;

/**
 * Classe para obtenção do fatorial.
 */
public class Algoritmo16 {

    /**
     * Classe que calcula o fatorial de um número.
     * @param n Número natural.
     * @return Fatorial de n.
     */
    public static int algoritmo16(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 2;
        int f = 1;
        while (i <= n) {
            f = f * i;
            i++;
        }

        return f;
    }
}