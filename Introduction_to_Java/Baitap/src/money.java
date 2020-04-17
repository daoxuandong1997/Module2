import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of money you want to change: ");
        int USD, VND;
        short rate = 23000;
        USD = sc.nextInt();
        VND = USD*rate;
        System.out.println("The number of money after change into VND is: " + VND + "VND");
    }
}
