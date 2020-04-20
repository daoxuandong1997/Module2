public class NextDayCalculator {
    public static int calculatorNextDay(int day, int month, int year){
        if (day < maxDay(month,year) && day > 0) {
            day = day + 1;
            return day;
        }else return 1;
    }
    public static int calculatorNextMonth(int day, int month, int year){
        if (day == maxDay(month,year) && month < 12){
            month = month + 1;
        }else if (month == 12)
            month = 1;
        else throw new RuntimeException("Out of month");
        return month;
    }
    public static int calculatorNextYear(int day, int month, int year){
        if (month == 12)
            year = year + 1;
        return year;
    }

    public static int maxDay(int month, int year){
        switch (month){
            case 2:
                if (isLeapYear(year))
                return 29;
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    return true;
                }return false;
            } return true;
        } return false;
    }
}
