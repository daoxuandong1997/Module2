package Test;

import Cal.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x,y);
        assertEquals(expResult, result);
    }
    @Test
    public void testAdd2(){
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();
        try{
            int result = instance.add(x,y);
            assertFalse(true);
        } catch (Exception e){
            assertTrue(true);
        }
    }
    @Test
    public void testSub(){
        int x = Integer.MIN_VALUE;
        int y = -1;
        Calculator instance = new Calculator();
        try {
            int result = instance.sub(x,y);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }
    }
}
