package home.alunoinf.avaliacao.algoritmo19;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo19Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo19.algoritmo19(0, 10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo19.algoritmo19(3, 1);
    }
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo19.algoritmo19(2, 2));
        Assert.assertEquals((5 + 16/2 + 64/6), Algoritmo19.algoritmo19(4, 3));
        Assert.assertEquals((2 + 1/2 + 1/6 + 1/24 + 1/120), Algoritmo19.algoritmo19(1, 5));
    }
}