package home.alunoinf.avaliacao.algoritmo27;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo27Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo27.algoritmo27(0, 33);
        Algoritmo27.algoritmo27(-9, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo27.algoritmo27(62, -3);
    }
    
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, Algoritmo27.algoritmo27(60, 2));
        Assert.assertEquals(1, Algoritmo27.algoritmo27(9, 2));
        Assert.assertEquals(3, Algoritmo27.algoritmo27(48, 5));
        Assert.assertEquals(2, Algoritmo27.algoritmo27(10, 8));
    }
}
