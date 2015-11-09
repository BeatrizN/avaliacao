package home.alunoinf.avaliacao.algoritmo28;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo28Test {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo28.algoritmo28(0, 8, 1);
        Algoritmo28.algoritmo28(-33, 1, 8);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo28.algoritmo28(3, -1, 8);
        Algoritmo28.algoritmo28(3, 0, 8);
    }
}
