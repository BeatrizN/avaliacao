package home.alunoinf.avaliacao.algoritmo25;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo25Test {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo25.algoritmo25(-5, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo25.algoritmo25(2, -1);
    }
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo25.algoritmo25(10, 2));
        Assert.assertEquals(1, Algoritmo25.algoritmo25(3, 2));
        Assert.assertEquals(6, Algoritmo25.algoritmo25(20, 3));
        Assert.assertEquals(18, Algoritmo25.algoritmo25(150, 8));
    }
}
