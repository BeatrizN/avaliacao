package home.alunoinf.avaliacao.algoritmo15;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo15Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo15.algoritmo15(0);
        Algoritmo15.algoritmo15(-2);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((4/1 - 4/3 + 4/5), Algoritmo15.algoritmo15(3));
        Assert.assertEquals((4/1 - 4/3 + 4/5 - 4/7 + 4/9), Algoritmo15.algoritmo15(5));
        Assert.assertEquals((4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13 - 4/15), Algoritmo15.algoritmo15(8));
    }
}
