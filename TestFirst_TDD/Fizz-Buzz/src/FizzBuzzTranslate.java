public class FizzBuzzTranslate {
    public static String translate(int number){
        boolean isFizz = (number % 3 == 0 && number % 5 != 0);
        boolean isBuzz = (number % 5 == 0 && number % 3 != 0);
        boolean isFizzBuzz = (number % 3 == 0 && number % 5 == 0);

        if (isFizz)
            return "Fizz";
        else if (isBuzz)
            return "Buzz";
        else if (isFizzBuzz)
            return "FizzBuzz";
        else{
            if (number > 0 && number < 100)return readNum(number);
            else return "Khong doc duoc";
        }
    }
    public static String readNum(int number){
        String read = "";
        int ones = number % 10, tens = number / 10;
        switch (tens){
            case 1:
                read += "mot";
                break;
            case 2:
                read += "hai";
                break;
            case 3:
                read += "ba";
                break;
            case 4:
                read += "bon";
                break;
            case 5:
                read += "nam";
                break;
            case 6:
                read += "sau";
                break;
            case 7:
                read += "bay";
                break;
            case 8:
                read += "tam";
                break;
            case 9:
                read += "chin";
                break;
        }
        read += " ";
        switch (ones){
            case 1:
                read += "mot";
                break;
            case 2:
                read += "mot";
                break;
            case 3:
                read += "ba";
                break;
            case 4:
                read += "bon";
                break;
            case 5:
                read += "nam";
                break;
            case 6:
                read += "sau";
                break;
            case 7:
                read += "bay";
                break;
            case 8:
                read += "tam";
                break;
            case 9:
                read += "chin";
                break;
        }
        return read;
    }
}
