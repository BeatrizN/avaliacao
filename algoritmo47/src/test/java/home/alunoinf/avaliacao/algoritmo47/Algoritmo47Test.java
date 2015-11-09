package home.alunoinf.avaliacao.algoritmo47;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo47Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo47.algoritmo47(new int[] { 15, 8 }, -6);
        Algoritmo47.algoritmo47(new int[] { 1, 2, 8, 71 }, 5);
    }

    @Test
    public void testCasosTriviais() {
        int [] a = { 0, 2, 4, 3, 2, 5, 8 };
        Assert.assertEquals(4, Algoritmo47.algoritmo47(a, 6));
        int [] b = { 0, 2, 15, 10 };
        Assert.assertEquals(9, Algoritmo47.algoritmo47(b, 3));
    }
}