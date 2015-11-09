package home.alunoinf.avaliacao.algoritmo42;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo42Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo42.algoritmo42(0);
        Algoritmo42.algoritmo42(-10);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(120, Algoritmo42.algoritmo42(15));
        Assert.assertEquals(28, Algoritmo42.algoritmo42(7));
        Assert.assertEquals(6, Algoritmo42.algoritmo42(3));
    }
}
