package home.alunoinf.avaliacao.algoritmo32;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo32Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo32.algoritmo32(-20);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, Algoritmo32.algoritmo32(0));
        Assert.assertEquals(1, Algoritmo32.algoritmo32(1));
        Assert.assertEquals(8, Algoritmo32.algoritmo32(6));
        Assert.assertEquals(89, Algoritmo32.algoritmo32(11));
    }
}

