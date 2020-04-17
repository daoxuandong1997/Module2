package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("=============");
        circle = new Circle(5.0,"Yellow");
        System.out.println(circle);
        System.out.println();
        Circle cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("=============");
        cylinder = new Cylinder(10.69,5.69,"Silver");
        System.out.println(cylinder);
    }
}
