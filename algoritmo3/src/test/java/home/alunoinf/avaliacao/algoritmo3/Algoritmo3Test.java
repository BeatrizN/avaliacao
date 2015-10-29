package home.alunoinf.avaliacao.algoritmo3;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo3Test {

    @Test(expected = IllegalArgumentException.class)
    public void tesPrimeiroParametroInvalido() throws Exception {
        Algoritmo3.algoritmo3(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo3.algoritmo3(-9);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((5 * 6 / 2), Algoritmo3.algoritmo3(5));
        Assert.assertEquals((100 * 101 / 2), Algoritmo3.algoritmo3(100));
    }
}
