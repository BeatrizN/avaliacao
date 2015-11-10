package home.alunoinf.avaliacao.algoritmo33;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo33Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroTamanhoInvalido() throws Exception {
        int [] a = {1, 0 ,9, 5};
        Algoritmo33.algoritmo33(a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroValoresInvalido() throws Exception {
        int [] a = {0, 8, 2, -9, 1, 0 ,9, 5, 6, 4, 3, 7};
        Algoritmo33.algoritmo33(a);
        int [] b = {0, 3, 2, 6, 2, 4, 5, 1, 45, 3, 4, 2};
        Algoritmo33.algoritmo33(b);
    }

    @Test
    public void testCPFValido() throws Exception {
        int [] a = {0, 2, 5, 6, 3, 1, 5, 8, 0, 1, 0, 1};
        Assert.assertTrue(Algoritmo33.algoritmo33(a));
        int [] b = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        Assert.assertFalse(Algoritmo33.algoritmo33(b));
    }

    @Test
    public void testCPFInvalido() throws Exception {
        int [] b = {0, 2, 5, 6, 3, 1, 5, 8, 0, 1, 9, 7};
        Assert.assertFalse(Algoritmo33.algoritmo33(b));
    }
}


