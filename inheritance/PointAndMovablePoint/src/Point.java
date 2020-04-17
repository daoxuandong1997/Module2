public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){}
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[]array = new float[]{x,y};
        return array;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + Math.ceil(x*100)/100 + ", " + Math.ceil(y*100)/100 + ")";
    }
}
