package home.alunoinf.avaliacao.algoritmo8;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo8Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
        Algoritmo8.algoritmo8(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMaior() throws Exception {
        Algoritmo8.algoritmo8(55555);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo8.algoritmo8(153));
        Assert.assertFalse(Algoritmo8.algoritmo8(909));
        Assert.assertFalse(Algoritmo8.algoritmo8(10));
    }
}