package home.alunoinf.avaliacao.algoritmo38;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo38Test {

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo38.algoritmo38(4, 3));
        Assert.assertEquals(26, Algoritmo38.algoritmo38(24, 10));
        Assert.assertEquals(15, Algoritmo38.algoritmo38(12, 9));
    }
}