package home.alunoinf.avaliacao.algoritmo36;

/**
 * Classe para calcular a quantidade de soluções possíveis para a equacão: 2x + 3y + 5z 7w = 210.
 */

public class Algoritmo36 {

    /**
     * Classe para calcular a quantidade de soluções possíveis para a equacão: 2x + 3y + 5z 7w = 210.
     * Com x variando de 1 a 96 inclusive.
     * Com y variando de 1 a 65 inclusive.
     * Com z variando de 1 a 39 inclusive.
     * Com w variando de 1 a 28 inclusive.
     * @return A quantidades de soluões possíveis para a equação.
     */
    public static int algoritmo36() {
        int s = 0;

        for(int x = 1; x <= 96; x++) {
            for(int y = 1; y <= 65; y++) {
                for(int z = 1; z <= 39; z++) {
                    for(int w = 1; w <= 28; w++) {
                        if ((2 * x + 3 * y + 5 * z + 7 * w) == 210) {
                            s++;
                        }
                    }
                }
            }
        }

        return s;
    }
}