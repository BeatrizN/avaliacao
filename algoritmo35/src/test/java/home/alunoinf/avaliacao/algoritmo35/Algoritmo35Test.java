package home.alunoinf.avaliacao.algoritmo35;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo35Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        int a[] = { 2 };
        Algoritmo35.algoritmo35(a);
    }

    @Test
    public void testCasosTriviais() {
        int [] a = { 1, 3, 2, 4, 8 };
        Assert.assertEquals(10, Algoritmo35.algoritmo35(a));

        int [] b = { 7, 5, 2, 2, 4, 1, 2 };
        Assert.assertEquals(1, Algoritmo35.algoritmo35(b));
    }
}