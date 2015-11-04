package home.alunoinf.avaliacao.algoritmo22;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo22Test {
    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo22.algoritmo22(-6, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo22.algoritmo22(1, 0);
    }

    @Test
    public void testNumerosPares() throws Exception {
        Assert.assertTrue(Algoritmo22.algoritmo22(1, 1));
    }
    @Test
    public void testNumerosImpares() throws Exception {
        Assert.assertFalse(Algoritmo22.algoritmo22(10, 6));
        Assert.assertFalse(Algoritmo22.algoritmo22(26, 2));
    }
}
