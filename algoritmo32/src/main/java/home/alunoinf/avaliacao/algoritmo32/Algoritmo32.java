package home.alunoinf.avaliacao.algoritmo32;

/**
 * Classe para calcular sequencia de Fibonacci.
 */
public class Algoritmo32 {

    /**
     * Classe para calcular sequencia de Fibonacci.
     * n == 0  F(n) = 0.
     * n == 1 F(n) = 1.
     * n >= 2 F(n) = F(n - 1) + F(n - 2).
     * @param n Número natural .
     * @return Valor correspondente ao termo n na sequencia.
     */
    public static int algoritmo32(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        int a = 0;
        int c = 1;

        if ((n == 0) || (n == 1)) {
            return n;
        }

        int i = 2;

        while (i <= n) {
            int t = c;
            c += a;
            a = t;
            i++;
        }

        return c;
    }
}


