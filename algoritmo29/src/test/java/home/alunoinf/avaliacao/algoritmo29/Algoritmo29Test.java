package home.alunoinf.avaliacao.algoritmo29;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo29.algoritmo29(0, 3);
        Algoritmo29.algoritmo29(-12, 3);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(3, Algoritmo29.algoritmo29(9, 2));
        Assert.assertEquals(9, Algoritmo29.algoritmo29(81, 3));
        Assert.assertEquals(5, Algoritmo29.algoritmo29(25, 2));
    }
}
