package home.alunoinf.avaliacao.algoritmo48;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo48Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo48.algoritmo48(new int[] { 1, 22, 4, 9 }, -6);
        Algoritmo48.algoritmo48(new int[] { 10, 9, 5 }, 9);
    }

    @Test
    public void testVetor5() {
        int[] a = { 0, 1, 22, 4, 9, 7, 1};
        Algoritmo48.algoritmo48(a, 5);

        int[] expected = { 0, 22, 9, 7, 4, 1, 1 };
        Assert.assertArrayEquals(expected, a);
    }

    @Test
    public void testVetor4() {
        int[] a = { 0, 11, 2, 54, 29 };
        Algoritmo48.algoritmo48(a, 4);

        int[] expected = { 0, 54, 29, 11, 2 };
        Assert.assertArrayEquals(expected, a);
    }

}