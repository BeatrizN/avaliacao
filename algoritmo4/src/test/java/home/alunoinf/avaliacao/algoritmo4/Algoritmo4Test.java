package home.alunoinf.avaliacao.algoritmo4;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo4Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo4.algoritmo4(-2, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Algoritmo4.algoritmo4(1, -10);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(50, Algoritmo4.algoritmo4(10, 5));
        Assert.assertEquals(63, Algoritmo4.algoritmo4(7, 9));
        Assert.assertEquals(19600, Algoritmo4.algoritmo4(20, 980));
    }
}
