import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you need to read: ");
        short number = sc.nextShort();
        while (number < 0){
            System.out.print("The number must be greater than zero: ");
            number = sc.nextShort();
        }

        int ones = number % 10, tens = (number / 10) % 10, hundred = number / 100;
        String readNum = "";
        if (number < 10){
            switch (number){
                case 0:
                    readNum += "zero";
                    break;
                case 1:
                    readNum += "one";
                    break;
                case 2:
                    readNum += "two";
                    break;
                case 3:
                    readNum += "three";
                    break;
                case 4:
                    readNum += "four";
                    break;
                case 5:
                    readNum += "five";
                    break;
                case 6:
                    readNum += "six";
                    break;
                case 7:
                    readNum += "seven";
                    break;
                case 8:
                    readNum += "eight";
                    break;
                case 9:
                    readNum += "nine";
                    break;
            }
        }
        // doc so < 20 va > 10
        else if (number < 20){
            switch (ones){
                case 0:
                    readNum += "ten";
                    break;
                case 1:
                    readNum += "eleven";
                    break;
                case 2:
                    readNum += "twelve";
                    break;
                case 3:
                    readNum += "thirdteen";
                    break;
                case 4:
                    readNum += "fourteen";
                    break;
                case 5:
                    readNum += "fifteen";
                    break;
                case 6:
                    readNum += "sixteen";
                    break;
                case 7:
                    readNum += "seventeen";
                    break;
                case 8:
                    readNum += "eighteen";
                    break;
                case 9:
                    readNum += "nineteen";
                    break;
            }
        }
        // doc so < 1000 va > 20
        else if (number >= 20 && number < 1000){
           if (hundred != 0) {
               switch (hundred) {
                   case 1:
                       readNum += "one";
                       break;
                   case 2:
                       readNum += "two";
                       break;
                   case 3:
                       readNum += "three";
                       break;
                   case 4:
                       readNum += "four";
                       break;
                   case 5:
                       readNum += "five";
                       break;
                   case 6:
                       readNum += "six";
                       break;
                   case 7:
                       readNum += "seven";
                       break;
                   case 8:
                       readNum += "eight";
                       break;
                   case 9:
                       readNum += "nine";
                       break;
               }
               readNum += " hundred and ";
           }
           if (tens == 1){
                   switch (ones){
                       case 0:
                           readNum += "ten";
                           break;
                       case 1:
                           readNum += "eleven";
                           break;
                       case 2:
                           readNum += "twelve";
                           break;
                       case 3:
                           readNum += "thirdteen";
                           break;
                       case 4:
                           readNum += "fourteen";
                           break;
                       case 5:
                           readNum += "fifteen";
                           break;
                       case 6:
                           readNum += "sixteen";
                           break;
                       case 7:
                           readNum += "seventeen";
                           break;
                       case 8:
                           readNum += "eighteen";
                           break;
                       case 9:
                           readNum += "nineteen";
                           break;
                   }
           }else {
               switch (tens) {
                   case 2:
                       readNum += "twen";
                       break;
                   case 3:
                       readNum += "third";
                       break;
                   case 4:
                       readNum += "for";
                       break;
                   case 5:
                       readNum += "fif";
                       break;
                   case 6:
                       readNum += "six";
                       break;
                   case 7:
                       readNum += "seven";
                       break;
                   case 8:
                       readNum += "eigh";
                       break;
                   case 9:
                       readNum += "nine";
                       break;
               }
               readNum += "ty ";
               switch (ones) {
                   case 1:
                       readNum += "one";
                   case 2:
                       readNum += "two";
                       break;
                   case 3:
                       readNum += "three";
                       break;
                   case 4:
                       readNum += "four";
                       break;
                   case 5:
                       readNum += "five";
                       break;
                   case 6:
                       readNum += "six";
                       break;
                   case 7:
                       readNum += "seven";
                       break;
                   case 8:
                       readNum += "eight";
                       break;
                   case 9:
                       readNum += "nine";
                       break;
               }
           }
        }else readNum += "out of ability";
        System.out.println(readNum);
    }
}
