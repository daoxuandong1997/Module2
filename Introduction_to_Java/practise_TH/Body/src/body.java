import java.util.Scanner;

public class body {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your weight is: ");
        float weight = sc.nextFloat();
        System.out.println("Your height is: ");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.printf("Your bmi is: %f!\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
