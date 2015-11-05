package home.alunoinf.avaliacao.algoritmo28;

/**
 * Classe que calcula divisão.
 */
public class Algoritmo28 {

    /**
     * Classe que calcula divisão utilizando produto, mos (resto) e divideSoma.
     * @param a Dividendo.
     * @param b Divisor.
     * @param k Número de casas decimais.
     * @return Quociente.
     */
    public static int algoritmo28(int a, int b, int k) {
        if ((a <= 0) || (b <= 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int d = divideSomas(a, b);
        System.out.printf("%d", d);
        int r = mod(a, b);

        if(r != 0) {
            System.out.printf(",");
        }

        while ((r != 0) && (k > 0)) {
            r = produto(10, r);
            d = divideSomas(r, b);
            System.out.printf("%d", d);
            r = mod(r, b);
            k--;
        }

        System.out.printf("\n");
        return d;
    }

    public static int mod(int x, int y) {
        int s = x;

        while(s >= y) {
            s -= y;
        }

        return s;
    }

    public static int produto(int a, int b) {
        int i = 1;
        int s = 0;

        while (i <= b) {
            s += a;
            i++;
        }
        return s;
    }

    public static int divideSomas(int x, int y) {

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
