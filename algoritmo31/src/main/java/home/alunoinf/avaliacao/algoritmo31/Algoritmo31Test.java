package home.alunoinf.avaliacao.algoritmo31;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo31Test {

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int a[] = {1, 0 ,9, 5};
        Algoritmo31.algoritmo31(2, 0, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUltimoParametroInvalido() throws Exception {
        int [] a = {2, 7, 0};
        Algoritmo31.algoritmo31(3, 0, a);
    }

    @Test
    public void testCasosTriviais() {
        int [] a = {3, -2, -4, -8};
        Assert.assertEquals(-11, Algoritmo31.algoritmo31( 1, 3, a));

        int [] b = {3, 2, 5, 1, 4};
        Assert.assertEquals(99, Algoritmo31.algoritmo31(2, 4, b));
    }
}