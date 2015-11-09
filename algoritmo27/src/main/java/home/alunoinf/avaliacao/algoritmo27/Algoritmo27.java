package home.alunoinf.avaliacao.algoritmo27;

/**
 * Classe que retorna o resto  da divisão de dois números inteiros.
 */
public class Algoritmo27 {

    /**
     * Classe que retorna o resto  da divisão de dois números inteiros utilizando subtração.
     * @param x Dividendo.
     * @param y Divisor.
     * @return Resto.
     */
    public static int algoritmo27(int x, int y) {
        if ((x <= 0) || (y < 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int s = x;

        while(s >= y) {
            s -= y;
        }

        return s;
    }
}