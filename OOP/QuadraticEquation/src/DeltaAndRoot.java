public class DeltaAndRoot {

    private double a,b,c;

    public DeltaAndRoot(){
    }

    public DeltaAndRoot(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant(){
        return (b*b) - 4*a*c;
    }

    double getRoot(){
        return (-b) / (2*a);
    }

    double getRoot1(){
            return ((-b) + Math.pow(getDiscriminant(),0.5)) / (2*a);
    }

    double getRoot2(){
        return ((-b) - Math.pow(getDiscriminant(),0.5)) / (2*a);
    }

}
