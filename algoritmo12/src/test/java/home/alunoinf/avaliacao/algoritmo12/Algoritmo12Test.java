package home.alunoinf.avaliacao.algoritmo12;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo12Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo12.algoritmo12(0, 10);
        Algoritmo12.algoritmo12(5, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo12.algoritmo12(1, -10);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo12.algoritmo12(25, 15));
        Assert.assertEquals(10, Algoritmo12.algoritmo12(50, 20));
        Assert.assertEquals(1, Algoritmo12.algoritmo12(23, 2));
    }
}
