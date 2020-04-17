public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape.setFilled(false);
        shape.setColor("blue");
        System.out.println(shape.toString());
        System.out.println();
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());
        triangle = new Triangle(12,4,9);
        triangle.setColor("red");
        triangle.setFilled(false);
        System.out.println("\n New triangle after setter");
        System.out.println(triangle.toString());
    }
}
