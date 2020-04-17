package Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){
    }
    public Cylinder(double height){

    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with height = "
                + getHeight()
                + " and has Volume is: "
                + Math.ceil(getVolume()*1000)/1000
                + ", which is a subclass of "
                + super.toString();
    }
}
