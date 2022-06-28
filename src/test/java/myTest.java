import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class myTest {


    @Test
    public void test1(){
        Calculate c = new Calculate();
        double sum = c.add(10,30.5);
        assertEquals(40.5, sum, 0.00001);
    }

    @Test
    public void test2(){
        Calculate c = new Calculate();
        double sub = c.substract(50.7,30.5);
        assertEquals(20.2, sub, 0.00001);
    }

    @Test
    public void test3(){
        Calculate c = new Calculate();
        double mult = c.multiply(11.4,30.5);
        assertEquals(347.7, mult, 0.00001);
    }

    @Test
    public void test4(){
        Calculate c = new Calculate();
        double div = c.devide(30.99,1.5);
        assertEquals(20.66, div, 0.00001);
    }
}
