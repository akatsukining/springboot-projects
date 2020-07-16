//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
package cn.kgc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //assertTrue( true );
        App app = new App();

        //assertTrue(app.isPrime(7));
        //assertTrue(app.isPrime(17));
        //assertFalse(app.isPrime(27));

        assertEquals(app.isPrime(7), new String("7是素数"));
        assertEquals(app.isPrime(17), new String("17是素数"));
        assertEquals(app.isPrime(27), new String("27不是素数"));
    }
}
