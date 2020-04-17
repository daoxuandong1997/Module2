public class Rectangle {
    double width, height;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ",height=" + height + "}";
    }

    double getPerimeter(){
        return (width + height)*2;
    }

    double getArea(){
        return  width * height;
    }
}
