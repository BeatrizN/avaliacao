package home.alunoinf.avaliacao.algoritmo21;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo21Test {
    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo21.algoritmo21(-6);
    }

    @Test
    public void testNumerosPares() throws Exception {
        Assert.assertTrue(Algoritmo21.algoritmo21(9));
        Assert.assertTrue(Algoritmo21.algoritmo21(10000));
    }
    @Test
    public void testNumerosImpares() throws Exception {
        Assert.assertFalse(Algoritmo21.algoritmo21(10));
        Assert.assertFalse(Algoritmo21.algoritmo21(26));
    }
}
