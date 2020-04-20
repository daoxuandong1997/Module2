public class TriangleClassifier {
    public static int classifierTriangle(int sideA, int sideB, int sideC){
        boolean isTriangle = (sideA > 0 && sideB > 0 && sideC > 0);
        boolean isClassifierTriangle = (sideA == sideB && sideB == sideC);
        boolean isIsoscelesTriangle = (sideA == sideB || sideB == sideC || sideA == sideC);
        boolean isRegularTriangle = (sideB + sideC > sideA && sideA + sideB > sideC && sideA + sideC > sideB);
        final char CLASSIFIERTRIANGLE = 1;
        final char ISOSCELESTRIANGLE = 2;
        final char REGULARTRIANGLE = 3;
        final char NOTTRIANGLE = 0;

        if (isTriangle){
            if (isClassifierTriangle) {
                return CLASSIFIERTRIANGLE;
            } else if (isIsoscelesTriangle) {
                return ISOSCELESTRIANGLE;
            } else if (isRegularTriangle) {
                return REGULARTRIANGLE;
            }
        }return NOTTRIANGLE;
    }
}
