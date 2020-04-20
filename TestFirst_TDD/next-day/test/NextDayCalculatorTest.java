import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testCalculatorNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int expDay = 2;
        int expMonth = 1;
        int expYear = 2018;

        int results = NextDayCalculator.calculatorNextDay(day,month,year);
        assertEquals(results, expDay);
    }

    @Test
    void testCalculatorNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int expDay = 1;
        int expMonth = 2;
        int expYear = 2018;

        int resultDay = NextDayCalculator.calculatorNextDay(day,month,year);
        int resultMonth = NextDayCalculator.calculatorNextMonth(day,month,year);
        assertEquals(resultDay, expDay);
        assertEquals(resultMonth, expMonth);
    }

    @Test
    void testCalculatorNextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int expDay = 1;
        int expMonth = 5;
        int expYear = 2018;

        int resultDay = NextDayCalculator.calculatorNextDay(day,month,year);
        int resultMonth = NextDayCalculator.calculatorNextMonth(day,month,year);
        assertEquals(resultDay, expDay);
        assertEquals(resultMonth, expMonth);
    }
    @Test
    void testCalculatorNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int expDay = 1;
        int expMonth = 3;
        int expYear = 2018;

        int resultDay = NextDayCalculator.calculatorNextDay(day,month,year);
        int resultMonth = NextDayCalculator.calculatorNextMonth(day,month,year);
        assertEquals(resultDay, expDay);
        assertEquals(resultMonth, expMonth);
    }

    @Test
    void testCalculatorNextDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int expDay = 1;
        int expMonth = 3;
        int expYear = 2020;

        int resultDay = NextDayCalculator.calculatorNextDay(day,month,year);
        int resultMonth = NextDayCalculator.calculatorNextMonth(day,month,year);
        assertEquals(resultDay, expDay);
        assertEquals(resultMonth, expMonth);
    }

    @Test
    void testCalculatorNextDay5() {
        int day = 31;
        int month = 12;
        int year = 2019;

        int expDay = 1;
        int expMonth = 1;
        int expYear = 2020;

        int resultDay = NextDayCalculator.calculatorNextDay(day,month,year);
        int resultMonth = NextDayCalculator.calculatorNextMonth(day,month,year);
        int resultYear = NextDayCalculator.calculatorNextYear(day,month,year);
        assertEquals(resultDay, expDay);
        assertEquals(resultMonth, expMonth);
        assertEquals(resultYear,expYear);
    }
}