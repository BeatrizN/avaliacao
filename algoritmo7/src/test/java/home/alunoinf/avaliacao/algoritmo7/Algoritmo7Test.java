package home.alunoinf.avaliacao.algoritmo7;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo7Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
        Algoritmo7.algoritmo7(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMaior() throws Exception {
        Algoritmo7.algoritmo7(51555);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo7.algoritmo7(3025));
        Assert.assertFalse(Algoritmo7.algoritmo7(9009));
        Assert.assertFalse(Algoritmo7.algoritmo7(910));
    }
}