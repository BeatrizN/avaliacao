package home.alunoinf.avaliacao.algoritmo28;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo28Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo28.algoritmo28(0, 8, 1);
        Algoritmo28.algoritmo28(-33, 1, 8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo28.algoritmo28(3, -1, 8);
        Algoritmo28.algoritmo28(3, 0, 8);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(13, Algoritmo28.algoritmo28(26, 2, 3));
        Assert.assertEquals(2, Algoritmo28.algoritmo28(6, 3, 16));
        Assert.assertEquals(27, Algoritmo28.algoritmo28(81, 3, 1));
        Assert.assertEquals(921, Algoritmo28.algoritmo28(1842, 2, 1));
        Assert.assertEquals(3, Algoritmo28.algoritmo28(10, 3, 8));
    }
}
