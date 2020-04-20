public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        System.out.println(circle1.getRadius() + "\n" + circle1.getArea() + "\n" +
                        circle2.getRadius() + "\n" + circle2.getArea());
    }
}
