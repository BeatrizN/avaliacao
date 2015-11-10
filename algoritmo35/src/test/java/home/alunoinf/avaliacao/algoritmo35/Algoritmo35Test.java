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
    public void testCasoTrivial() {
        int [] a = { 0, 3, 2, 4, 8 };
        Assert.assertEquals(2, Algoritmo35.algoritmo35(a));
        int [] b = { 0, 5, 2, 2, 4, 1, 2 };
        Assert.assertEquals(6, Algoritmo35.algoritmo35(b));
    }
}