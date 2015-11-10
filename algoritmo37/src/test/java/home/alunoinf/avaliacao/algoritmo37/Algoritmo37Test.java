package home.alunoinf.avaliacao.algoritmo37;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo37Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo37.algoritmo37(-5, 8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo37.algoritmo37(9, -6);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, Algoritmo37.algoritmo37(0, 0));
        Assert.assertEquals(2, Algoritmo37.algoritmo37(1, 0));
        Assert.assertEquals(2, Algoritmo37.algoritmo37(0, 1));
        Assert.assertEquals(5, Algoritmo37.algoritmo37(1, 3));
        Assert.assertEquals(11, Algoritmo37.algoritmo37(2, 4));
        Assert.assertEquals(61, Algoritmo37.algoritmo37(3, 3));
    }
}