package br.ufg.inf.es.construcao.algoritmo1;

import br.ufg.inf.es.construcao.algoritmo1.Algoritmo1;
import org.junit.Assert;
import org.junit.Test;

public class Algoritmo1Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroDiaInvalido() throws Exception {
        Algoritmo1.algoritmo1(0, 2, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroDiaInvalido() throws Exception {
        Algoritmo1.algoritmo1(33, 5, 1910);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroMesInvalido() throws Exception {
        Algoritmo1.algoritmo1(30, -5, 1910);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoParametroMesInvalido() throws Exception {
        Algoritmo1.algoritmo1(15, 13, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuintoParametroAnoInvalido() throws Exception {
        Algoritmo1.algoritmo1(30, 5, 1010);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo1.algoritmo1(25, 10, 2015));
        Assert.assertEquals(6, Algoritmo1.algoritmo1(26, 10, 2015));
        Assert.assertEquals(0, Algoritmo1.algoritmo1(27, 10, 2015));
        Assert.assertEquals(1, Algoritmo1.algoritmo1(28, 10, 2015));
        Assert.assertEquals(2, Algoritmo1.algoritmo1(29, 10, 2015));
        Assert.assertEquals(3, Algoritmo1.algoritmo1(30, 10, 2015));
        Assert.assertEquals(4, Algoritmo1.algoritmo1(31, 10, 2015));
    }
}
