import java.util.Scanner;

public class greatestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0){
            if (b == 0){
                System.out.println("No factor!");
            }else System.out.println(b);
        } else {
            if (b == 0){
                System.out.println(a);
            }else{
                while (a != b){
                    if (a > b){
                        a -= b;
                    }else b -= a;
                }
                System.out.println(a);
            }
        }
    }
}
