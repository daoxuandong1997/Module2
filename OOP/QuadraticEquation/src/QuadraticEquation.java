import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();

        DeltaAndRoot deltaAndRoot = new DeltaAndRoot(a,b,c);
        if (deltaAndRoot.getDiscriminant() > 0){
            System.out.println("The Quadratic Equation has 2 roots \n");
            System.out.println("The Root 1 is: " + deltaAndRoot.getRoot1());
            System.out.println("THe Root 2 is: "+ deltaAndRoot.getRoot2());
        }else if (deltaAndRoot.getDiscriminant() == 0){
            System.out.println("The Quadratic Equation has 1 root \n");
            System.out.println("The Root is: " + deltaAndRoot.getRoot());
        }else System.out.println("The Quadratic Equation has no root");
    }
}
