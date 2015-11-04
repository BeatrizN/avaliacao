package home.alunoinf.avaliacao.algoritmo26;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo26Test {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo26.algoritmo26(0, 33);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo26.algoritmo26(62, -0);
    }
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, Algoritmo26.algoritmo26(18, 2));
        Assert.assertEquals(1, Algoritmo26.algoritmo26(7, 2));
        Assert.assertEquals(2, Algoritmo26.algoritmo26(2501, 3));
        Assert.assertEquals(4, Algoritmo26.algoritmo26(20, 8));
    }
}
