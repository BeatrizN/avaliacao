package home.alunoinf.avaliacao.algoritmo46;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo46Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo46.algoritmo46(new int[] { 4, 2, 3, 8, 25, 4 }, -6);
        Algoritmo46.algoritmo46(new int[] { 1, 2, 3, 4 }, 5);
    }

    @Test
    public void testCasosTriviais() {
        int [] a = {0, 12, 1, 3, 2, 4, 8};
        Assert.assertEquals(16, Algoritmo46.algoritmo46(a, 3));
        Assert.assertEquals(30, Algoritmo46.algoritmo46(a, 6));
    }
}