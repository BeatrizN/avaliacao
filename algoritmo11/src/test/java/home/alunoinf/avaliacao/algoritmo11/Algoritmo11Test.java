package home.alunoinf.avaliacao.algoritmo11;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo11Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo11.algoritmo11(0, 10);
        Algoritmo11.algoritmo11(5, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo11.algoritmo11(1, -10);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo11.algoritmo11(25, 15));
        Assert.assertEquals(7, Algoritmo11.algoritmo11(49, 7));
        Assert.assertEquals(1, Algoritmo11.algoritmo11(23, 2));
    }
}