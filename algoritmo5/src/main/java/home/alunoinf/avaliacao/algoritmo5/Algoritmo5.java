package home.alunoinf.avaliacao.algoritmo5;

/**
 * Classe para calcular potencia de números naturais.
 */
public class Algoritmo5 {

    /**
     * Classe para calcular potencia de números naturais utilizando multiplicacao.
     * @param x Base.
     * @param y Expoente.
     * @return Potencia x^y
     */
    public static int algoritmo5(int x, int y){
        if ((x <= 0) || (y < 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int p = 1;
        while (i <= y) {
            p = p * x;
            i++;
        }

        return p;
    }
}