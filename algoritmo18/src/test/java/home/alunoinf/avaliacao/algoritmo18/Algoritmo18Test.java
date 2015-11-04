package home.alunoinf.avaliacao.algoritmo18;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo18Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo18.algoritmo18(0, 8);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo18.algoritmo18(3, 1);
    }
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo18.algoritmo18(2, 2));
        Assert.assertEquals((5 + 16/2 + 64/6), Algoritmo18.algoritmo18(4, 3));
    }
}


