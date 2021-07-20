package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp()");
        c = new Calculator();
    }



    @Test
    public void addition() {
        System.out.println("1");
        assertEquals(6,c.addition(3,3));
    }

    @Test
    public void substraction() {
        System.out.println("2");
        assertEquals(7,c.substraction(10,3));
    }

    @Test(expected = ArithmeticException.class)
    public void division() {
        System.out.println("3");
        assertEquals(1,c.division(1,0),0);
    }

    @Test(timeout = 150)
    public void timeout() {
        System.out.println("4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}