package home.alunoinf.avaliacao.algoritmo37;

/**
 * Classe para calcular a função Ackerman.
 */
public class Algoritmo37 {

    /**
     * Classe para calcular a função Ackerman utilizando recursividade.
     * Se x == 0 Então A(x, y) = n + 1.
     * Se x > 0 e y == 0 Então A(x, y) = A((x - 1), 1).
     * Se x > 0 e y > 0 Então A(x, y) = A((x - 1), A(x, (y - 1))).
     * @param x Número natural inteiro.
     * @param y Número natural inteiro.
     * @return
     */
    public static int algoritmo37(int x, int y) {
        if ((x < 0) || (y < 0)) {
            throw new IllegalArgumentException("Valor inválido");
        }

        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return algoritmo37(x - 1, 1);
        }

        return (algoritmo37(x - 1, algoritmo37(x, y - 1)));
    }
}