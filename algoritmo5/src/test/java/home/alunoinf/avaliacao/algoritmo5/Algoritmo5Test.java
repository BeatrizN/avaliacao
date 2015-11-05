package home.alunoinf.avaliacao.algoritmo5;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo5Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo5.algoritmo5(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Algoritmo5.algoritmo5(1, -10);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(100000, Algoritmo5.algoritmo5(10, 5));
        Assert.assertEquals(49, Algoritmo5.algoritmo5(7, 2));
        Assert.assertEquals(81, Algoritmo5.algoritmo5(3, 4));
    }
}