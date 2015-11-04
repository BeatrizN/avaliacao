package home.alunoinf.avaliacao.algoritmo25;

/**
 *Classe que calcula a divisão de números inteiros utilizando subtração.
 */
public class Algoritmo25 {

    /**
     * Classe que calcula a divisão de inteiros utilizando subtração.
     * @param x Dividendo.
     * @param y Divisor.
     * @return Quociente.
     */
    public static int algoritmo25(int x, int y) {
        if ((x < 0) || (y <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int d = 0;
        int s = x;

        while (s >= y) {
            s -= y;
            d++;
        }

        return d;
    }
}
