package Geral;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import operacoes.operacoesEstatisticas;

public class operacoesEstatisticasTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public operacoesEstatisticasTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( operacoesEstatisticasTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMediana()
    {
        ArrayList<Double> dados = new ArrayList<>();
        dados.add(1.0);
        dados.add(2.0);
        dados.add(3.0);
        dados.add(4.0);
        dados.add(5.0);

        double resultado = operacoesEstatisticas.calcularMediana(dados);
        assertEquals(3.0, resultado, 0.001);
    }
}
