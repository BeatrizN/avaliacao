package home.alunoinf.avaliacao.algoritmo4;

/**
 * Classe para calcular produto de dois numeros naturais.
 */
public class Algoritmo4 {

    /**
     * Classe para calcular produto de dois numeros naturais utilizando soma.
     * @param a primeiro fator.
     * @param b segundo fator.
     * @return Produto de a e b.
     */
    public static int algoritmo4(int a, int b) {
        if ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = 1;
        int s = 0;

        while (i <= b) {
            s += a;
            i++;
        }

        return s;
    }
}
