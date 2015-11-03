package home.alunoinf.avaliacao.algoritmo16;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo16Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo16.algoritmo16(0);
        Algoritmo16.algoritmo16(-85);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(6, Algoritmo16.algoritmo16(3));
        Assert.assertEquals(120, Algoritmo16.algoritmo16(5));
        Assert.assertEquals(3628800, Algoritmo16.algoritmo16(10));
        Assert.assertEquals(479001600, Algoritmo16.algoritmo16(12));
    }
}