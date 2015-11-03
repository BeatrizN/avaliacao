package home.alunoinf.avaliacao.algoritmo13;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo13Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo13.algoritmo13(0);
        Algoritmo13.algoritmo13(-9);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((3/2), Algoritmo13.algoritmo13(2));
        Assert.assertEquals((1 + 1/2 + 1/ 3 + 1/4 + 1/5), Algoritmo13.algoritmo13(5));
        Assert.assertEquals((1 + 1/2 + 1/ 3 + 1/4 + 1/5 + 1/6 + 1/7), Algoritmo13.algoritmo13(7));
    }
}
