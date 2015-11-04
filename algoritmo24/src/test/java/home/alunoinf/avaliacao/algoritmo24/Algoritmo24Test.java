package home.alunoinf.avaliacao.algoritmo24;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo24Test {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo24.algoritmo24(-5, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo24.algoritmo24(2, -1);
    }
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo24.algoritmo24(10, 2));
        Assert.assertEquals(0, Algoritmo24.algoritmo24(1, 2));
        Assert.assertEquals(6, Algoritmo24.algoritmo24(20, 3));
        Assert.assertEquals(18, Algoritmo24.algoritmo24(150, 8));
    }
}


