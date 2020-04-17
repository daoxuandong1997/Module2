package Point;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println("Point 2D with (x,y) = " + point1 + ")");
        System.out.println("=============");
        point1 = new Point2D(5,9);
        System.out.println("Point 2D with (x,y) = " + point1 + ")");
        Point3D point3D = new Point3D(2.1f,5.7f,9.5f);
        System.out.println(point3D.toString());
        point3D.setXYZ(23.6f,45.8f,0.674f);
        System.out.println(point3D.toString());
    }
}
