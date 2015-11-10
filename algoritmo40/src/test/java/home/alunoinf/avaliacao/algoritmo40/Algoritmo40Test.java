package home.alunoinf.avaliacao.algoritmo40;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo40Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroDiaInvalido() throws Exception {
        Algoritmo40.algoritmo40(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroDiaInvalido() throws Exception {
        Algoritmo40.algoritmo40(1310);
    }

    @Test
    public void testAtendePropriedade() throws Exception {

        Assert.assertTrue(Algoritmo40.algoritmo40(1));
        Assert.assertTrue(Algoritmo40.algoritmo40(2));
        Assert.assertTrue(Algoritmo40.algoritmo40(145));
    }

    @Test
    public void testNaoAtendePropriedade() throws Exception {
        Assert.assertFalse(Algoritmo40.algoritmo40(10));
        Assert.assertFalse(Algoritmo40.algoritmo40(26));
        Assert.assertFalse(Algoritmo40.algoritmo40(234));
    }
}