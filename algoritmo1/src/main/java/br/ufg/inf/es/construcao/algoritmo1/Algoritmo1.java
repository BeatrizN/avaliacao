package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Classe que retorna dia da semana usando uma data de entrada (dd/mm/aaaa).
 */
public class Algoritmo1 {

    /**
     * Classe que retorna dia da semana usando uma data de entrada (dd/mm/aaaa).
     * @param d Dia.
     * @param m Mês.
     * @param a Ano.
     * @return Dia da semana da data de entrada.
     */
    public static int algoritmo1(int d, int m, int a) {
        if (d < 1 || d > 31 || m < 1 || m> 12 || a < 1753) {
            throw new IllegalArgumentException("Data inválida");
        }

        if(m == 1 || m == 2) {
            m += 12;
            a--;
        }

        int s = d + (2 * m) + (3 * (m - 1) / 5) + a + (a / 4) - (a / 100) + (a / 400);
        return (s % 7);
    }
}
