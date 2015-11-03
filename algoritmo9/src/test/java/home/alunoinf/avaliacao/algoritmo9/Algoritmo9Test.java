package home.alunoinf.avaliacao.algoritmo9;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo9Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
        Algoritmo9.algoritmo9(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo9.algoritmo9(23));
        Assert.assertTrue(Algoritmo9.algoritmo9(31));
        Assert.assertFalse(Algoritmo9.algoritmo9(26));
        Assert.assertFalse(Algoritmo9.algoritmo9(910));
    }
}