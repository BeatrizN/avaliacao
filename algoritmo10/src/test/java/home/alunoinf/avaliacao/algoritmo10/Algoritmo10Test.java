package home.alunoinf.avaliacao.algoritmo10;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo10Test {

    @Test(expected = IllegalArgumentException.class)
    public void testVetorInvalido() throws Exception {
        int[] a = {2, 7, 6, 10, 8};
        Algoritmo10.algoritmo10(a, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int a[] = {1, 0, 9, 5};
        Algoritmo10.algoritmo10(a, 1);
    }

    @Test
    public void testQuatroNaoPrimoCincoPrimo() {
        int[] a = new int[6];
        Algoritmo10.algoritmo10(a, 5);

        int[] expected = { 0, 0, 0, 0, 1, 0 };
        Assert.assertArrayEquals(expected, a);
    }

    @Test
    public void testUltimoPrimoSendoDezenove() {
        int[] a = new int[20];
        Algoritmo10.algoritmo10(a, 19);

        int[] expected = { 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 };
        Assert.assertArrayEquals(expected, a);
    }

    @Test
    public void testSessentaNaoPrimo() {
        int[] a = new int[61];
        Algoritmo10.algoritmo10(a, 60);
        Assert.assertEquals(1, a[40]);
        Assert.assertEquals(0, a[17]);
        Assert.assertEquals(1, a[26]);
        Assert.assertEquals(0, a[53]);
    }
}
