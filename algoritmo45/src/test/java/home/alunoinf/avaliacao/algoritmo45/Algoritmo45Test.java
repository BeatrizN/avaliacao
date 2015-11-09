package home.alunoinf.avaliacao.algoritmo45;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo45Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo45.algoritmo45(new int[] { 81, 21, 23 }, -6);
        Algoritmo45.algoritmo45(new int[] { 1, 2, 31}, 5);
    }
}
