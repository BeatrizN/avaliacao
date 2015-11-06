package home.alunoinf.avaliacao.algoritmo20;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo20Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo20.algoritmo20(0, 5, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo20.algoritmo20(3, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Algoritmo20.algoritmo20(3, 2, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((36/24), Algoritmo20.algoritmo20(10, 2, 3));
        Assert.assertEquals((21/12) , Algoritmo20.algoritmo20(9, 3, 2));
        Assert.assertEquals(2, Algoritmo20.algoritmo20(10, 10, 1));
        Assert.assertEquals((42/26), Algoritmo20.algoritmo20(4, 2, 5));
    }
}
