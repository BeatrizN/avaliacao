package home.alunoinf.avaliacao.algoritmo7;

/**
 * Classe da PROPIEDADE3025
 * Para saber se o quadrado da soma dos dois digitos mais significativos de um numeros (n)
 * com seus dois digitos menos significativos é igual a ele mesmo (n).
 */
public class Algoritmo7 {

    /**
     * Classe da PROPIEDADE3025
     * Para saber se o quadrado da soma dos dois digitos mais significativos de um numeros (n)
     * com seus dois digitos menos significativos é igual a ele mesmo (n).
     * @param n número n >=0 E n <= 9999.
     * @return se o número possue a propriedade 3025.
     */
    public static boolean algoritmo7(int n) {
        if ((n > 9999) || (n < 0)) {
            throw new IllegalArgumentException("Número inválido");
        }

        int i = n / 100;
        int j = n % 100;
        boolean propriedade3025 = ((i + j) * (i + j)) == n;
        return propriedade3025;
    }
}