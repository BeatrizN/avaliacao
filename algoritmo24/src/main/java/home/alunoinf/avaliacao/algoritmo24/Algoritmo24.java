package home.alunoinf.avaliacao.algoritmo24;

/**
 *Classe que calcula a divisão de números inteiros utilizando soma.
 */
public class Algoritmo24 {

    /**
     * Classe que calcula a divisão de inteiros utilizando soma.
     * @param x Dividendo.
     * @param y Divisor.
     * @return Quociente.
     */
    public static int algoritmo24(int x, int y) {
        if ((x < 0) || (y <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int d = 0;
        int s = y;

        while (s <= x) {
            s += y;
            d++;
        }

        return d;
    }
}
