import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number need to check: ");
        int number = sc.nextInt();

//        short count = 0;
        if (number < 2){
            System.out.printf("%d is NOT prime", number);
        }
//            for (int i = 2; i <= Math.sqrt(number); i++ ){
//                if (number % i == 0){
//                    count++;
//                }
//            }
//            if (count == 0){
//                System.out.printf("%d is prime",number);
//            }else System.out.printf("%d is NOT prime", number);
        int i = 2;
        boolean check = true;
        while(i <= Math.sqrt(number)){
            if (number % i == 0){
                check = false;
                break;
            }
            i++;
        }
        if (check){
            System.out.printf("%d is prime",number);
          }else System.out.printf("%d is NOT prime", number);
    }
}
