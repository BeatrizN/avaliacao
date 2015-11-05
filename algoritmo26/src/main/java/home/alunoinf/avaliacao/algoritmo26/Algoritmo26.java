package home.alunoinf.avaliacao.algoritmo26;

/**
 * Classe que retorna o resto  da divisão de dois números inteiros.
 */
public class Algoritmo26 {

    /**
     * Classe que retorna o resto  da divisão de dois números inteiros utilizando subtração.
     * @param x Dividendo.
     * @param y Divisor.
     * @return Resto.
     */
    public static int algoritmo26(int x, int y) {
        if ((x <= 0) || (y <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        int d = divideSubtracao(x, y);
        return x - (d * y);
    }

    public static int divideSubtracao(int x, int y) {
        int d = 0;
        int s = x;

        while (s >= y) {
            s -= y;
            d++;
        }

        return d;
    }
}
