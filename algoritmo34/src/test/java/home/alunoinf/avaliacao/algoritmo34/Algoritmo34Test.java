package home.alunoinf.avaliacao.algoritmo34;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo34Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroTamanhoInvalido() throws Exception {
        int [] a = {1, 0 ,9, 5, 8, 6, 4};
        Algoritmo34.algoritmo34(a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroValoresInvalido() throws Exception {
        int [] a = {0, 8, 2, 6, 1, 10 ,9, 5, 6, 4, 3, 7};
        Algoritmo34.algoritmo34(a);
        int [] b = {0, 3, 2, 6, -2, 4, 5, 1, 5, 3, 4, 2};
        Algoritmo34.algoritmo34(b);
    }

    @Test
    public void testCPFValido() throws Exception {
        int [] a = {0, 2, 5, 6, 3, 1, 5, 8, 0, 1, 0, 1};
        Assert.assertTrue(Algoritmo34.algoritmo34(a));
        int [] b = {0, 1, 1, 3, 1, 1, 5, 1, 0, 1, 8, 0};
        Assert.assertFalse(Algoritmo34.algoritmo34(b));
    }

    @Test
    public void testCPFInvalido() throws Exception {
        int [] b = {0, 2, 5, 6, 3, 1, 5, 8, 0, 1, 9, 7};
        Assert.assertFalse(Algoritmo34.algoritmo34(b));
    }
}