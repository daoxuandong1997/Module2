import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    final char CLASSIFIERTRIANGLE = 1;
    final char ISOSCELESTRIANGLE = 2;
    final char REGULARTRIANGLE = 3;
    final char NOTTRIANGLE = 0;

    @Test
    void testClassifierTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;


        int expected = CLASSIFIERTRIANGLE;
        int result = TriangleClassifier.classifierTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testIsoscelesTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;

        int expected = ISOSCELESTRIANGLE;
        int result = TriangleClassifier.classifierTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testRegularTriangle() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        int expected = REGULARTRIANGLE;
        int result = TriangleClassifier.classifierTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void testNotTriangle() {
        int[][] sides = {
                {8,2,3},
                {-1,2,1},
                {0,1,1},
                {-1,0,-1},
                {-1,1,0},
                {0,0,0}
        };

        int expected = NOTTRIANGLE;
        for(int[] side : sides){
            int result = TriangleClassifier.classifierTriangle(side[0],side[1],side[2]);
            assertEquals(expected, result);
        }

    }
}