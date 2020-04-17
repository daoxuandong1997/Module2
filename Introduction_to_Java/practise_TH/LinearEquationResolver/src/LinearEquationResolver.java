import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a != 0){
            double solution = c-b/a;
            System.out.printf("The solution is: %f!\n", solution);
        } else {
            if (b == 0){
                System.out.print("The solution is all x! ");
            }else {
                System.out.print("No solution");
            }
        }
    }
}