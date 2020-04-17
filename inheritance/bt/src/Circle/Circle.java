package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with color of "
                + getColor()
                + " has radius = "
                + getRadius()
                + " and it's Area is: "
                + Math.ceil(getArea()*100)/100;
    }

}
