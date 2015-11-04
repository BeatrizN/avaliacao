package home.alunoinf.avaliacao.algoritmo23;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo23Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo23.algoritmo23(0);
        Algoritmo23.algoritmo23(-9);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(8, Algoritmo23.algoritmo23(10));
        Assert.assertEquals(1, Algoritmo23.algoritmo23(3));
        Assert.assertEquals(22, Algoritmo23.algoritmo23(20));
        Assert.assertEquals(9, Algoritmo23.algoritmo23(15));
    }
}
