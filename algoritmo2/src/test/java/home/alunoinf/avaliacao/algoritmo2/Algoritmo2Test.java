package home.alunoinf.avaliacao.algoritmo2;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo2Test {

    @Test
    public void testNumerosPares() throws Exception {
        Assert.assertTrue(Algoritmo2.algoritmo2(1394));
        Assert.assertTrue(Algoritmo2.algoritmo2(682));
    }

    @Test
    public void testNumerosImpares() throws Exception {
        Assert.assertFalse(Algoritmo2.algoritmo2(523));
        Assert.assertFalse(Algoritmo2.algoritmo2(2597));
    }
}
