import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testTranslateFizz() {
        int number = 3;

        String expStr = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expStr,result);
    }
    @Test
    void testTranslateBuzz() {
        int number = 5;

        String expStr = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expStr,result);
    }
    @Test
    void testTranslateReadNum() {
        int number = 23;

        String expStr = "hai ba";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expStr,result);
    }
    @Test
    void testTranslateFizzBuzz() {
        int number = 15;

        String expStr = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expStr,result);
    }
    @Test
    void testTranslateCannotReadNum() {
        int number = 121;

        String expStr = "Khong doc duoc";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expStr,result);
    }
}