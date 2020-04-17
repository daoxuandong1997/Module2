import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of money: ");
        double money = 1;
        money = sc.nextDouble();

        System.out.println("Enter the months: ");
        int month = 1;
        month = sc.nextInt();
        while (month < 1 || month >12){
            System.out.println("Enter the months: ");
            month = sc.nextInt();
        }

        System.out.println("Enter the rate per year: ");
        double rate = 1.0;
        rate = sc.nextDouble();

        double profit = money * (rate/100/12) * month;
        System.out.println("Your profit is " + profit);
    }
}
