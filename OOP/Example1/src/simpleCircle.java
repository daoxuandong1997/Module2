class SimpleCircle {
    double radius;
// cac phuong thuc khoi tao
    /*construct a circle with radius(default)*/
    SimpleCircle(){
        radius = 1;
    }

    /*Constuct a circle with a specified radius */
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

//cac tinh nang cua doi tuong
    /*Return the area of this circle*/
    double getArea(){
        return radius*radius*Math.PI;
    }

    /*Return the parimeter of this circle*/
    double getParimeter(){
        return radius*2*Math.PI;
    }

    /* Set new radius for this circle */
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
