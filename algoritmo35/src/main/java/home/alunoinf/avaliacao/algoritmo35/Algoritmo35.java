package home.alunoinf.avaliacao.algoritmo35;

/**
 * Classe para calcular a Fórmula de  LUHN.
 */
public class Algoritmo35 {

    /**
     * Classe para calcular a Fórmula de LUHN.
     * @param n Vetor ne tamanho >= 2.
     * @return O resultado da formula em relaçaõ ao vetor.
     */
    public static int algoritmo35(int[] n) {
        if (n.length < 2) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
        }

        int k = n.length;
        int i = 0; // Acumula parcelas ímpares.
        int p = 0; // Acumula parcelas pares.
        int l = k - 1; // Remove dígitos verificador do cômputo.
        boolean a = false;

        while(l >= 0) {
            if (a) {
                p += n[l]; // Acumula parcelas ímpares.
            } else {
                int t = n[l] * 2; // Dobro do elemento de ordem ímpar.
                i = i + t / 10 + mod(t, 10); // Acumula dígitos de t.
            }

            l--;
            a = !a;
        }

        return (10 - mod(i + p, 10));
    }

    public static int mod(int x, int y) {

        /**
         * Classe que retorna o resto  da divisão de dois números inteiros utilizando subtração.
         * @param x Dividendo.
         * @param y Divisor.
         * @return Resto.
         */
        int s = x;

        while(s >= y) {
            s -= y;
        }

        return s;
    }
}


