package home.alunoinf.avaliacao.algoritmo14;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo14Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo14.algoritmo14(0);
        Algoritmo14.algoritmo14(-4);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((1/2 + 1/5), Algoritmo14.algoritmo14(2));
        Assert.assertEquals((1/2 + 1/5 + 1/10 + 1/17), Algoritmo14.algoritmo14(4));
        Assert.assertEquals((1/2 + 1/5 + 1/10 + 1/17 + 1/26 + 1/37 + 1/50), Algoritmo14.algoritmo14(7));
    }
}