package home.alunoinf.avaliacao.algoritmo17;

        import org.junit.Assert;
        import org.junit.Test;

public class Algoritmo17Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo17.algoritmo17(0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(6, Algoritmo17.algoritmo17(3));
        Assert.assertEquals(120, Algoritmo17.algoritmo17(5));
        Assert.assertEquals(3628800, Algoritmo17.algoritmo17(10));
    }
}
